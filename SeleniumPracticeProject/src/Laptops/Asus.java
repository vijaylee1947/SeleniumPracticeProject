package Laptops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Asus {
	
	@Test(threadPoolSize = 3,groups = "Functional")
	public void AsusLaptop() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.asus.com/in/");
		System.out.println("i am from Asus");
	}
	
	@Test(groups = "Smoke")
	public void UpdateAsus() {
		System.out.println("Asus Updated");
	}

}
