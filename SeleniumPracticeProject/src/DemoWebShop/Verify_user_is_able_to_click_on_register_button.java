package DemoWebShop;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Verify_user_is_able_to_click_on_register_button {
	public static void main(String[] args) throws IOException {
		File file = new File("./TestData/DemoWebShopLogin.properties");
		FileInputStream fis = new FileInputStream(file);

		Properties prop = new Properties();
		prop.load(fis);
		String dk = (String) prop.get("driverkey");
		String dp = (String) prop.get("driverpath");
		String url1 = (String) prop.get("url");
		// setting path
		System.setProperty(dk, dp);

		SoftAssert s = new SoftAssert();
		// launching browser
		WebDriver driver = new ChromeDriver();
		Reporter.log("browser launched", true);

		// maximizing browser window
		driver.manage().window().maximize();
		Reporter.log("browser window maximized", true);

		// using implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("applied implicit wait", true);

		// launching application
		driver.get(url1);
		Reporter.log("Application launched", true);

		// verifying register link is enabled
		WebElement link1 = driver.findElement(By.linkText("Register"));
		s.assertEquals(link1.isEnabled(), true);
		Reporter.log("register link is enabled", true);

		// clicking on register link
		driver.findElement(By.linkText("Register")).click();
		Reporter.log("clicked on register link", true);

		// verifying register page displayed
		WebElement page = driver.findElement(By.xpath("//h1[text()='Register']"));
		s.assertEquals(page.isDisplayed(), true);
		Reporter.log("register page displayed", true);
		Reporter.log("Functional testing is pass", true);

	}

}
