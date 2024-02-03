package DemoWebShop;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Verify_user_is_able_to_add_a_product_to_the_wishlist {
	public static void main(String[] args) throws IOException, InterruptedException {
		File file = new File("./TestData/DemoWebShopLogin.properties");
		FileInputStream fis = new FileInputStream(file);

		Properties prop = new Properties();
		prop.load(fis);
		String dk = (String) prop.get("driverkey");
		String dp = (String) prop.get("driverpath");
		String url1 = (String) prop.get("url");

		// setting path
		System.setProperty(dk, dp);

		SoftAssert action = new SoftAssert();
		// launching a browser
		WebDriver driver = new ChromeDriver();
		Reporter.log("browser launched", true);

		// maximizing browser
		driver.manage().window().maximize();
		Reporter.log("browser maximized", true);

		// using implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("implicite wait applied", true);

		// launching application
		driver.get(url1);
		Reporter.log("application launched", true);

		// clicking on login link
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("clicked on login link", true);

		File file1 = new File("./TestData/registartiondata.xlsx");
		FileInputStream fis1 = new FileInputStream(file1);

		Workbook workbook = WorkbookFactory.create(fis1);
		Sheet sheet = workbook.getSheet("data");

		Reporter.log("login page displayed", true);

		// entering email
		driver.findElement(By.id("Email")).sendKeys(sheet.getRow(1).getCell(2).toString());
		Reporter.log("entered email-id into email textfiled", true);

		// entering password
		driver.findElement(By.id("Password")).sendKeys(sheet.getRow(1).getCell(3).toString());
		Reporter.log("entered password into password text field", true);

		// selecting remember me check box
		driver.findElement(By.id("RememberMe")).click();
		Reporter.log("Remember me Check box selected", true);

		// clicking on login button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("clicked on login button", true);

		// clicking particular product
		driver.findElement(By.linkText("$25 Virtual Gift Card")).click();
		Reporter.log("clicked on particular product", true);
		Reporter.log("Particular product details page displayed", true);

		// providing Recipient name
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("vijay", Keys.TAB);
		Reporter.log("Recipient name entered", true);

		// entering recipient email
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("vijaylee1947@gmail.com");
		Reporter.log("Recipient email entered", true);

		// clicking on add to wish list button
		driver.findElement(By.id("add-to-wishlist-button-2")).click();
		Reporter.log("clicked on add to wish list button", true);

		// verifying confirmation message displayed
		String content = driver.findElement(By.xpath("//p[@class='content']")).getText();
		action.assertEquals(content, "//p[@class='content']");
		Reporter.log("Confirmation message displayed", true);

		// verifying wish list link displayed or not
		WebElement page1 = driver.findElement(By.xpath("//span[text()='Wishlist']"));
		action.assertEquals(page1.isDisplayed(), true);
		Reporter.log("click on wishlist link", true);
		Thread.sleep(3000);

		// clicking on wishlist link
		driver.findElement(By.xpath("(//a[@href='/wishlist'])[2]")).click();
		Reporter.log("clicked on wishlist link", true);

		// verifying wishlist page displayed
		WebElement page2 = driver.findElement(By.xpath("//div[@class='page-title']"));
		action.assertEquals(page2.isDisplayed(), true);
		Reporter.log("Wishlist page displayed", true);

		// verifying added product displayed or not
		WebElement page3 = driver.findElement(By.linkText("$25 Virtual Gift Card"));
		action.assertEquals(page3.isDisplayed(), true);
		Reporter.log("Added Product displayed in Wishlist", true);
		Reporter.log("integration testing is pass", true);

	}

}
