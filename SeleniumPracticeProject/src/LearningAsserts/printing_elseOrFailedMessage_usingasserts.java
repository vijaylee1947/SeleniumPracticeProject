package LearningAsserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class printing_elseOrFailedMessage_usingasserts {

	@Test
	public void elsemessage() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		SoftAssert soft = new SoftAssert();
		Reporter.log("Browser launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser maximised", true);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("application lanched", true);
		driver.findElement(By.linkText("Log in")).click();
		String page = driver.getCurrentUrl();
		soft.assertEquals(page, "https://demowebshop.tricentiscomlogin", "login page not displayed :(");
		Reporter.log("Login page displayed :)",true);

		driver.quit();
		Reporter.log("Window closed",true);
		soft.assertAll();
	}

}
