package LearningAsserts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsingSoftAsserts {
	
	@Test
	public void url() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		SoftAssert softassert=new SoftAssert();
		
		softassert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis");
		Reporter.log("DemoWebShop Launched",true);
		softassert.assertAll();
	}

}
