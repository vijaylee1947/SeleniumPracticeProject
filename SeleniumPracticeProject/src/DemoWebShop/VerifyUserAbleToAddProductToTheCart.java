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

public class VerifyUserAbleToAddProductToTheCart {
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

		SoftAssert soft = new SoftAssert();

		// launching browser
		WebDriver driver = new ChromeDriver();
		Reporter.log("browser is launched", true);

		// maximizing the browser window
		driver.manage().window().maximize();
		Reporter.log("browser window maximized", true);

		// using implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("applied implicit wait", true);

		// launching application
		driver.get(url1);
		Reporter.log("application launched", true);

		// clicking on login button
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("clicked on log-in button", true);
		Reporter.log("login page displayed", true);

		File file1 = new File("./TestData/registartiondata.xlsx");
		FileInputStream fis1 = new FileInputStream(file1);

		Workbook workbook = WorkbookFactory.create(fis1);
		Sheet sheet = workbook.getSheet("data");

		// entering email id
		driver.findElement(By.id("Email")).sendKeys(sheet.getRow(1).getCell(2).toString());
		Reporter.log("Email id entered", true);

		// entering passport
		driver.findElement(By.id("Password")).sendKeys(sheet.getRow(1).getCell(3).toString());
		Reporter.log("password entered", true);

		// selecting remember me check box
		driver.findElement(By.id("RememberMe")).click();
		Reporter.log("remember me check box selected", true);

		// click on log in button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("clicked on login button", true);
		Reporter.log("home page displayed", true);

		// searching for particular product
		driver.findElement(By.id("small-searchterms")).sendKeys("laptop", Keys.ENTER);
		Reporter.log("Particular product displayed", true);

		// click on particular product
		driver.findElement(By.linkText("14.1-inch Laptop")).click();
		Reporter.log("clicked on particular product", true);
		Reporter.log("particular product details page displayed", true);

		// clicking on add to cart button
		driver.findElement(By.id("add-to-cart-button-31")).click();
		Reporter.log("clicked on add to cart button", true);

		// verifying confirmation message displayed
		String text = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getText();
		soft.assertEquals(text, "The product has been added to your ");
		Reporter.log("confirmation message displayed", true);

		// clicking on shopping cart link
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Reporter.log("clicked on shopping cart link", true);

		// getting page heading to verify
		WebElement heading = driver.findElement(By.xpath("//h1[text()='Shopping cart']"));

		// verifying shopping cart page displayed
		soft.assertEquals(heading.isDisplayed(), true);
		Reporter.log("shopping cart page displayed", true);
		// if(driver.findElement(By.className("page shopping-cart-page")).isDisplayed())
		// {
		// verifying added product displayed or not
		WebElement product = driver.findElement(By.linkText("14.1-inch Laptop"));
		soft.assertEquals(product.isDisplayed(), true);
		Reporter.log("Added Product displayed in card", true);
		Reporter.log("Integration testing is pass", true);

		// }

	}

}
