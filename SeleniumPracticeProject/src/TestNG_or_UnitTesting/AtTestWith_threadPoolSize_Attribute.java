package TestNG_or_UnitTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AtTestWith_threadPoolSize_Attribute {
	
	@Test(invocationCount=6,threadPoolSize = 2)
	public void learningthreadPoolSize() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.testyantra.com/");
		driver.quit();
	}
	

}
