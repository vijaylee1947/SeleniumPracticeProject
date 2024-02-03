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

public class Varify_user_is_able_to_login_and_add_Product_to_cart_and_Logout {
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

		// launching browser
		WebDriver driver = new ChromeDriver();
		Reporter.log("browser launched", true);

		SoftAssert softassert = new SoftAssert();
		// maximizing window
		driver.manage().window().maximize();
		Reporter.log("browser window maximized", true);

		// using implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("implicit wait applied", true);

		// launching application
		driver.get(url1);
		Reporter.log("Application launched", true);

		// checking login link displayed or not
		WebElement login = driver.findElement(By.linkText("Log in"));
		softassert.assertEquals(login.isDisplayed(), true);
		Reporter.log("login link displayed", true);

		// clicking on login link
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("login link clicked", true);

		File file1 = new File("./TestData/registartiondata.xlsx");
		FileInputStream fis1 = new FileInputStream(file1);

		Workbook workbook = WorkbookFactory.create(fis1);
		Sheet sheet = workbook.getSheet("data");

		// verifying login page displayed and able to enter User name and password,
		// click on login button
		softassert.assertEquals(By.xpath("//strong[text()='Returning Customer']"), "Returning Customer");
		System.out.println("login page displayed");
		driver.findElement(By.id("Email")).sendKeys(sheet.getRow(1).getCell(2).toString());
		driver.findElement(By.id("Password")).sendKeys(sheet.getRow(1).getCell(3).toString());
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("given valid data into all the fields");
		System.out.println("clicked on login button");

		// verifying login functionality working or not
		String data = driver.findElement(By.linkText("Log out")).getText();
		softassert.assertEquals(data, "Log out");
		System.out.println("Home page displayed");
		System.out.println("login test is pass");

		// searching for particular product
		driver.findElement(By.id("small-searchterms")).sendKeys("laptop", Keys.ENTER);
		Reporter.log("Particular product displayed", true);

		// clicking on particular product
		driver.findElement(By.xpath("(//img[contains(@title,'14.1-inch Laptop')])[2]")).click();
		Reporter.log("Particular product details displayed", true);

		// clicking on add to cart button
		driver.findElement(By.id("add-to-cart-button-31")).click();
		Reporter.log("clicked on add to cart button", true);

		// verifying add to cart button working
		String text = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getText();
		softassert.assertEquals(text, "\"The product has been added to your\"");
		Reporter.log("Confirmation message displayed", true);

		// clicking on shopping cart link
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Reporter.log("clicked on shopping cart link", true);

		// verifying Shopping cart page displayed
		String heading = driver.findElement(By.xpath("//h1[text()='Shopping cart']")).getText();
		softassert.assertEquals(heading, "Shopping cart");
		Reporter.log("Shopping cart page displayed", true);

		// verifying added product displayed in cart page
		softassert.assertEquals(heading, "Shopping cart");
		// if(driver.findElement(By.className("page shopping-cart-page")).isDisplayed())
		// {
		softassert.assertEquals(By.linkText("14.1-inch Laptop"), "14.1-inch Laptop");
		Reporter.log("Added Product displayed in card", true);
		Reporter.log("Integration testing is pass", true);
		// }

		// clicking on logout link
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("clicked on logout link", true);
		// verifying logout functionality working
		softassert.assertEquals(driver.findElement(By.linkText("Register")), "Register");
		Reporter.log("User successfully loggedout", true);
		Reporter.log("End to End testing is pass", true);
		softassert.assertAll();
	}

}
