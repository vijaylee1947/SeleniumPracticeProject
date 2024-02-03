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

public class Verify_user_is_able_to_enter_email_id_in_news_letter_section_and_click_on_subscribe_button {
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
		SoftAssert sa = new SoftAssert();
		// launching an browser
		WebDriver driver = new ChromeDriver();
		Reporter.log("browser launched", true);

		// browser window maximized
		driver.manage().window().maximize();
		Reporter.log("browser window maximized", true);

		// using implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("applied implicit wait", true);

		// launching application
		driver.get(url1);
		Reporter.log("application launched", true);

		// verifying news letter options displayed
		WebElement option = driver.findElement(By.xpath("//strong[text()='Newsletter']"));
		sa.assertEquals(option.isDisplayed(), true);
		Reporter.log("News Letters frame displayed", true);

		// verifying user able to enter email-id
		driver.findElement(By.id("newsletter-email")).sendKeys("vijaylee1949@gmail.com");
		Reporter.log("email id entered sucessfully", true);

		// clicking on subscribe button
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
		Reporter.log("clicked on subscribe button", true);

		// verifying confirmation message
		WebElement message = driver.findElement(By.id("newsletter-result-block"));
		sa.assertEquals(message.isDisplayed(), true);
		Reporter.log("confirmation message displayed", true);
		Reporter.log("functional testing is pass", true);
	}
}
