package LearningAsserts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import UtilityClass.DataUtilityClass;

public class VerifyUserAbleToLoginAndAddProductToCartAndLogout {

	@DataProvider(name = "Udata")
	public String[][] businessflow() throws EncryptedDocumentException, IOException {
		DataUtilityClass data = new DataUtilityClass();
		String[][] edata = data.readDataFromMultipleRow("./TestData/demowebshopuserdetails.xlsx", "details2");
		return edata;
	}

	@Test(dataProvider = "Udata")
	public void addproductToCart(String[] action) {

		System.setProperty(action[0], action[1]);

		SoftAssert sa = new SoftAssert();

		// launching the browser
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser Lanched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser Maximized", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Implicit wait applied", true);
		driver.get(action[2]);
		sa.assertEquals(action[2], "https://demowebshop.tricentis.com/");
		Reporter.log("Application launched");
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("Clicked on login link", true);
		WebElement loginpage = driver.findElement(By.xpath("//strong[text()='Returning Customer']"));
		sa.assertEquals(loginpage.isDisplayed(), true);
		Reporter.log("Login page displayed", true);
		driver.findElement(By.id("Email")).sendKeys(action[3]);
		String email = driver.findElement(By.id("Email")).getAttribute("value");
		sa.assertEquals(email, action[3]);
		Reporter.log("User email entered", true);
		driver.findElement(By.id("Password")).sendKeys(action[4]);
		String pass = driver.findElement(By.id("Password")).getAttribute("value");
		sa.assertEquals(pass, action[4]);
		Reporter.log("Password entered", true);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Clicked on login button", true);
		WebElement home = driver.findElement(By.linkText("Log out"));
		sa.assertEquals(home.isDisplayed(), true);
		Reporter.log("Home page displayed", true);
		driver.findElement(By.id("small-searchterms")).sendKeys(action[5]);
		String product = driver.findElement(By.id("small-searchterms")).getAttribute("value");
		sa.assertEquals(product, "smartphone");
		Reporter.log("Search Criteria Entered", true);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Reporter.log("Clicked on Search button");
		WebElement page = driver.findElement(By.xpath("//h1[text()='Search']"));
		sa.assertEquals(page.isDisplayed(), true);
		Reporter.log("Search Result page displayed");
		driver.findElement(By.linkText("Smartphone")).click();
		Reporter.log("Clicked on particukar product", true);
		String title = driver.getCurrentUrl();
		sa.assertEquals(title, "https://demowebshop.tricentis.com/smartphone");
		Reporter.log("Product details page displayed", true);
		driver.findElement(By.id("add-to-cart-button-43")).click();
		Reporter.log("Clicked on add to cart button", true);
		WebElement confirme = driver.findElement(By.linkText("shopping cart"));
		sa.assertEquals(confirme.isDisplayed(), true);
		Reporter.log("Product added to cart successfully", true);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Reporter.log("Clicked on shopping cart link", true);
		WebElement cartpage = driver.findElement(By.xpath("//h1[text()='Shopping cart']"));
		sa.assertEquals(cartpage.isDisplayed(), true);
		Reporter.log("Shopping cart page displayed", true);
		WebElement product1 = driver.findElement(By.linkText("Smartphone"));
		sa.assertEquals(product1.isDisplayed(), true);
		Reporter.log("Added product displayed in cart", true);
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Clicked on logout", true);
		WebElement logout = driver.findElement(By.linkText("Register"));
		sa.assertEquals(logout.isDisplayed(), true);
		Reporter.log("User loggedout Sucessfully", true);
		driver.quit();
		Reporter.log("User closed the window",true);

	}

}
