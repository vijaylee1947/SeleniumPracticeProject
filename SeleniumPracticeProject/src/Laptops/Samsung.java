package Laptops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Samsung {
	
	@Test(groups = "Smoke")
	public void SamsungLaptop() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("i am from SamSung");
	}
	
	@Test(groups = "Function")
	public void SamSungUpdate() {
		System.out.println("SamSung update");
	}

}
