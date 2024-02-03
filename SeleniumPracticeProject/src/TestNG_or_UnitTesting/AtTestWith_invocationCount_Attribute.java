package TestNG_or_UnitTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AtTestWith_invocationCount_Attribute {
	
	@Test(invocationCount = 5)
	public void learninginvocationCount() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.testyantra.com/");
		driver.quit();
	}

}
