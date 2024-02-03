package LearningAsserts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import UtilityClass.DataUtilityClass;

public class BuyingProductOnCashOnDelivery {

	@DataProvider(name = "Udata")
	public String[][] buyProduct() throws EncryptedDocumentException, IOException {
		DataUtilityClass data = new DataUtilityClass();
		String[][] buy = data.readDataFromMultipleRow("./TestData/demowebshopuserdetails.xlsx", "details2");
		return buy;
	}

	@Test(dataProvider = "Udata")
	public void login(String[] shoot) throws InterruptedException {
		System.setProperty(shoot[0], shoot[1]);

		SoftAssert action = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser Launcher :)", true);
		driver.manage().window().maximize();
		Reporter.log("Browser maximised", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(shoot[2]);
		Reporter.log("Application launched", true);
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("Clicked on login button");
		driver.findElement(By.id("Email")).sendKeys(shoot[3]);
		String email = driver.findElement(By.id("Email")).getAttribute("value");
		action.assertEquals(email, shoot[3]);
		Reporter.log("Email entered sucessfully");
		driver.findElement(By.id("Password")).sendKeys(shoot[4]);
		String pass = driver.findElement(By.id("Password")).getAttribute("value");
		action.assertEquals(pass, shoot[4]);
		Reporter.log("Password entered sucessfully", true);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Clicked on login button", true);
		WebElement home = driver.findElement(By.linkText("Log out"));
		action.assertEquals(home.isDisplayed(), true);
		Reporter.log("Home page displayed", true);
		driver.findElement(By.id("small-searchterms")).sendKeys(shoot[5]);
		String criteria = driver.findElement(By.id("small-searchterms")).getAttribute("value");
		action.assertEquals(criteria, "small-searchterms");
		Reporter.log("Product name entered", true);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Reporter.log("Clicked on search button", true);
		WebElement page1 = driver.findElement(By.xpath("//h1[text()='Search']"));
		action.assertEquals(page1.isDisplayed(), true);
		Reporter.log("Search result page displayed", true);
		driver.findElement(By.linkText("Smartphone")).click();
		Reporter.log("Clicked on particular product", true);
		String page2 = driver.getCurrentUrl();
		action.assertEquals(page2, "https://demowebshop.tricentis.com/smartphone");
		Reporter.log("product details page displayed", true);
		driver.findElement(By.id("add-to-cart-button-43")).click();
		Reporter.log("Clicked on add to product button", true);
		WebElement confirm = driver.findElement(By.linkText("shopping cart"));
		action.assertEquals(confirm.isDisplayed(), true);
		Reporter.log("Product added to cart", true);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Reporter.log("Clicked on shopping cart link", true);
		WebElement page3 = driver.findElement(By.xpath("//h1[text()='Shopping cart']"));
		action.assertEquals(page3.isDisplayed(), true);
		Reporter.log("Shopping cart page displayed", true);
		WebElement name = driver.findElement(By.linkText("Smartphone"));
		action.assertEquals(name.isDisplayed(), true);
		Reporter.log("Added product displayed in cart", true);

		WebElement drop = driver.findElement(By.id("CountryId"));
		Select select = new Select(drop);
		select.selectByValue("41");
		Reporter.log("Selected CountryID", true);
		driver.findElement(By.id("ZipPostalCode")).sendKeys(shoot[6]);
		Reporter.log("entered zippostalcode", true);
		driver.findElement(By.id("termsofservice")).click();
		Reporter.log("selected terms and conditions check box", true);
		driver.findElement(By.id("checkout")).click();
		Reporter.log("Clicked on checkout button", true);
		String page4 = driver.getCurrentUrl();
		action.assertEquals(page4, "https://demowebshop.tricentis.com/onepagecheckout");
		Reporter.log("Checkout page displayed", true);

		WebElement page12 = driver.findElement(By.xpath("//h2[text()='Billing address']"));
		action.assertEquals(page12.isDisplayed(), true);
		Reporter.log("Billing address page displayed", true);
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		Reporter.log("clicked on continue button", true);
//		Actions a = new Actions(driver);
//		ac.keyDown(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
//		Reporter.log("Selected Company name,automatically other field are filled", true);

		WebElement page5 = driver.findElement(By.xpath("//h2[text()='Shipping address']"));
		action.assertEquals(page5.isDisplayed(), true);
		Reporter.log("Shipping address page displayed", true);

		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		Reporter.log("clicked on continue button", true);

		WebElement page6 = driver.findElement(By.xpath("//h2[text()='Shipping method']"));
		action.assertEquals(page6.isDisplayed(), true);
		Reporter.log("Shipping method page displayed", true);

		driver.findElement(By.id("shippingoption_1")).click();
		Reporter.log("Seleceted Shippingoption1", true);
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
		Reporter.log("clicked on continue button", true);

		WebElement page7 = driver.findElement(By.xpath("//h2[text()='Payment method']"));
		action.assertEquals(page7.isDisplayed(), true);
		Reporter.log("payment method page displayed", true);

		driver.findElement(By.id("paymentmethod_0")).click();
		Reporter.log("selected cash on delivery option", true);
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		Reporter.log("clicked on continue button", true);

		WebElement page8 = driver.findElement(By.xpath("//h2[text()='Payment information']"));
		action.assertEquals(page8.isDisplayed(), true);
		Reporter.log("payment information page displayed", true);
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		Reporter.log("clicked on continue button", true);

		WebElement page9 = driver.findElement(By.xpath("//h2[text()='Confirm order']"));
		action.assertEquals(page9.isDisplayed(), true);
		Reporter.log("Confirm Order page displayed", true);
		Reporter.log("Billing and Shipping and Product, cost details ahould be display", true);

		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		Reporter.log("clicked on continue button", true);

		WebElement page10 = driver.findElement(By.xpath("//h1[text()='Thank you']"));
		action.assertEquals(page10.isDisplayed(), true);
		Reporter.log("Thank you page should be display", true);
		Reporter.log("Your order has been successfully processed! message should be display", true);

		driver.findElement(By.linkText("Click here for order details.")).click();
		Reporter.log("clicked on order details link", true);
		WebElement page11 = driver.findElement(By.xpath("//h1[text()='Order information']"));
		action.assertEquals(page11.isDisplayed(), true);
		Reporter.log("Order information page should be display", true);
		Reporter.log("Billing and Shipping and Product,Price details should be display", true);

		driver.quit();
		Reporter.log("Window Closed", true);

	}

}
