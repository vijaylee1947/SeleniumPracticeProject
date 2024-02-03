package ConfigurationAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ScriptUsingConfigurationAnnotationOnDemowebshop {

	WebDriver driver;

	@BeforeClass
	public void setpath() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		Reporter.log("path is setted", true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Browser maximized", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("before class", true);
	}

	@BeforeMethod
	public void logintest() {

		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("application launched", true);
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("clicked on login link", true);
		driver.findElement(By.id("Email")).sendKeys("chanikyachandragupta7@gmail.com");
		Reporter.log("entered email", true);
		driver.findElement(By.id("Password")).sendKeys("ramrom1234");
		Reporter.log("entered password", true);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("clicked on login button", true);
		Reporter.log("before method", true);
		Reporter.log("logged in", true);
	}

	@Test
	public void hometest() {
		SoftAssert soft = new SoftAssert();
		Reporter.log("i am home test");
		WebElement ele = driver.findElement(By.linkText("chanikyachandragupta7@gmail.com"));
		soft.assertEquals(ele.isDisplayed(), true);
		Reporter.log("email displayed on home page", true);

	}

	@AfterMethod
	public void demo1() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("logged out", true);
		Reporter.log("after method", true);
	}

	@AfterClass
	public void demo2() {
		driver.quit();
		Reporter.log("after class", true);
		Reporter.log("window closed", true);
	}

	@AfterTest
	public void demo3() {
		Reporter.log("after test", true);
	}

	@AfterSuite
	public void demo4() {
		Reporter.log("after suite", true);
	}

}
