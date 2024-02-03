package Mobiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iphone {

	@Test(groups="smoke")
	public void startIphone() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.apple.com/");
		System.out.println("fromStartiphone");
		driver.quit();
	}
	
	@Test(groups="Functional",dependsOnMethods = {"startIphone","UpdateIphone"})
	public void endIphone() {
		System.out.println("iPhone is ended");
	}
	
	@Test(groups="smoke")
	public void UpdateIphone() {
		System.out.println("iPhone is Updated");
	}
}
