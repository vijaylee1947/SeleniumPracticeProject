package BaseClass_forDemoWebShop;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import POM_For_FrameWork_onDemoWebShop.BillingAddressPage_ForExistingUser;
import POM_For_FrameWork_onDemoWebShop.CheckoutPage;
import POM_For_FrameWork_onDemoWebShop.ConfirmOrderPage;
import POM_For_FrameWork_onDemoWebShop.HomePage;
import POM_For_FrameWork_onDemoWebShop.OrderInformationPage;
import POM_For_FrameWork_onDemoWebShop.PaymentInformationPage;
import POM_For_FrameWork_onDemoWebShop.PaymentMethodPage;
import POM_For_FrameWork_onDemoWebShop.ProductDetailsPage;
import POM_For_FrameWork_onDemoWebShop.RegisterPage;
import POM_For_FrameWork_onDemoWebShop.ReturningCustomerPage;
import POM_For_FrameWork_onDemoWebShop.SearchResult_Page;
import POM_For_FrameWork_onDemoWebShop.ShippingAddressPage;
import POM_For_FrameWork_onDemoWebShop.ShippingMethodPage;
import POM_For_FrameWork_onDemoWebShop.ShoppingCartPage;
import POM_For_FrameWork_onDemoWebShop.StartingPage;
import POM_For_FrameWork_onDemoWebShop.ThankYouPage;
import UtilityClass.DataUtilityClass;

public class Base {

	WebDriver driver;
	SoftAssert action = new SoftAssert();
	DataUtilityClass data = new DataUtilityClass();
	HomePage home;
	RegisterPage reg;
	StartingPage s;
	ReturningCustomerPage lp;
	ProductDetailsPage pd;
	ShoppingCartPage sc;
	BillingAddressPage_ForExistingUser ba;
	ShippingAddressPage sa;
	ShippingMethodPage sm;
	PaymentMethodPage pm;
	PaymentInformationPage pi;
	ConfirmOrderPage co;
	ThankYouPage ty;
	OrderInformationPage oi;

	@BeforeSuite
	public void TypeOfTesting() {
		Reporter.log("Automation Testing on DemoWebPage", true);
	}

	@BeforeTest
	public void TestingTechniquesToBeApplied() {
		Reporter.log("SmokeTesting IT SystemTesting", true);
	}

	@BeforeClass
	public void AccesingBuild() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("Browser Launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser maximised", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void RegistrationTest() throws EncryptedDocumentException, IOException {
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Application Launched", true);
		home.getRegisterLink().click();
		action.assertEquals(reg.getRegisterPage().isDisplayed(), true);
		Reporter.log("Registerpage displayed", true);
		Reporter.log("Smoke Testing is pass on Registartion link", true);
		Reporter.log("Creating 3 users :", true);
		String[][] A1 = data.readDataFromMultipleRow("./TestData/RegistrationDetails.xlsx", "userdetails");
		reg.getGenderMale().click();
		reg.getFirstnametextfield().sendKeys(A1[0]);
		reg.getLastnameTextfield().sendKeys(A1[1]);
		reg.getEmailTextfield().sendKeys(A1[2]);
		reg.getPasswordTextfield().sendKeys(A1[3]);
		reg.getConfirmPasswordTextfield().sendKeys(A1[4]);
		Reporter.log("Entered valid data into all the fields", true);
		reg.getRegisterButton().click();
		action.assertEquals(reg.getconfirmationMessage().isDisplayed(), true);
		Reporter.log("Registration Completed", true);
		Reporter.log("Smoke testing is pass on Register Button", true);
	}

	@BeforeMethod
	public void loginTest() throws EncryptedDocumentException, IOException {
		s.getLoginlink().click();
		Reporter.log("clicked on login link", true);
		action.assertEquals(lp.getReturningCustomerPage().isDisplayed(), "SmokeTesting is fail");
		Reporter.log("Login page displayed", true);
		Reporter.log("SmokeTesting is pass on login link", true);
		String[][] data2 = data.readDataFromMultipleRow("./TestData/LoginCredentials.xlsx", "details");
		Reporter.log("Entered valid user details", true);
		lp.getEmailTextField().sendKeys(data2[0]);
		lp.getPasswordTextField().sendKeys(data2[1]);
		lp.getRememberMeCheckBox().click();
		lp.getLoginbutton().click();
		Reporter.log("Clicked on login button", true);
		action.assertEquals(home.getHomepage().isDisplayed(), "Home page not displayed");
		Reporter.log("Home page displayed", true);
		Reporter.log("SmokeTesting is pass on login button", true);
	}

	@BeforeMethod
	public void SearchAndAddProductToCartTest(SearchResult_Page result) {
		home.getSearchTextField().sendKeys("smartphone");
		Reporter.log("Entered product details", true);
		home.getSearchButton().click();
		Reporter.log("clicked on search button", true);
		action.assertEquals(result.getSearchResultpage().isDisplayed(), "searchresult page not displayed");
		Reporter.log("Search result page displayed and searched product displayed", true);
		Reporter.log("SmokeTesting is pass on Search button", true);
		result.getProductlink().click();
		Reporter.log("clicked on product link", true);
		action.assertEquals(pd.getProductDetailsPage().isDisplayed(), true);
		Reporter.log("Product details page displayed", true);
		pd.getAddtoCartButton().click();
		Reporter.log("Clicked on AddToCart Button", true);
		action.assertEquals(pd.getConfirmationMessage().isDisplayed(), "confirmation message not displayed");
		Reporter.log("Confirmation message displayed", true);
		Reporter.log("SmokeTesting is pass on AddToCart Button", true);
		pd.getShoppingCartlink().click();
		Reporter.log("clicked on shoppingcart link", true);
		if (sc.getShoppingcartpage().isDisplayed()) {
			if (sc.getProductlink().isDisplayed()) {
				Reporter.log("ShoppingCart page displayed and Added Product details displayed", true);
				Reporter.log("Integration Testing is pass between search page to cart page", true);
			}
		}
	}

	@BeforeMethod
	public void CheckOutButtonTest(CheckoutPage co) {
		Select select = new Select(sc.getCountryname());
		select.selectByValue("41");
		Reporter.log("Selected country as INDIA :) from dropdown", true);
		sc.getTermsofServicescheckbox().click();
		Reporter.log("Selected TesrmsofServices check box", true);
		sc.getCheckOutbutton().click();
		Reporter.log("Clicked on checkout button", true);
		if (co.getcheckoutpage().isDisplayed()) {
			if (co.getBillingAddressPage().isDisplayed()) {
				Reporter.log("Check page displayed with address details", true);
				Reporter.log("SmokeTesting is pass on CheckOut Button", true);
			}
		}
	}

	@BeforeMethod
	public void CheckOutProcedureTest() {
		Select select1 = new Select(ba.getFromAddressBookOrNewAddressdropdown());
		Reporter.log("Moving Cursor on address dropdown", true);
		select1.selectByValue("3412285");
		Reporter.log("Selected billing address from address book", true);
		ba.getContinueButton().click();
		Reporter.log("Clicked on Continue Button", true);
		action.assertEquals(sa.getShippingAddressPage().isDisplayed(), true);
		Reporter.log("Shipping address page displayed", true);
		Reporter.log("SmokeTesting is pass on Continue Button", true);
		Select select2 = new Select(sa.getFromAddressBookOrNewAddressdropdown());
		Reporter.log("Moving Cursor on address dropdown", true);
		select2.selectByValue("3412285");
		Reporter.log("Selected Shipping address from address book", true);
		sa.getContinueButton().click();
		Reporter.log("Clicked on Continue Button", true);
		action.assertEquals(sm.getShippingMethodPage().isDisplayed(), true);
		Reporter.log("ShippingMethod Page displayed", true);
		Reporter.log("SmokeTesting is pass on Continue button ", true);
		sm.getGroundOption().click();
		Reporter.log("Sleceted Ground Option", true);
		sm.getContinueButton().click();
		Reporter.log("Clicked on Continue button");
		action.assertEquals(pm.getPaymentMethodPage().isDisplayed(), true);
		Reporter.log("PaymentMethod page displayed", true);
		Reporter.log("Smoketesting is pass on Continue button", true);
		pm.getCashOnDelivery().click();
		Reporter.log("Selected CashOnDelivery Option", true);
		pm.getContinueButton().click();
		Reporter.log("Clicked on Continue Button", true);
		action.assertEquals(pi.getPaymentInformationPage().isDisplayed(), true);
		Reporter.log("PaymentInformation page displayed", true);
		Reporter.log("Smoketesting is pass on Continue button", true);
		pi.getContinueButton().click();
		Reporter.log("Clicked on Continue Button", true);
		action.assertEquals(co.getConfirmOrderPage().isDisplayed(), true);
		Reporter.log("ConfirmOrder Page displayed with Product,Billing,shipping details", true);
		Reporter.log("Smoketesting is pass on Continue button", true);
		co.getContinueButton().click();
		Reporter.log("clicked on continue button", true);
		action.assertEquals(ty.getThankYouPage().isDisplayed(), true);
		Reporter.log("Thank you page displayed with Order number, saying that product processed Sucessfully :)", true);
		Reporter.log("***If you want to see your Order details***", true);
		ty.getForOrderDetailslink().click();
		action.assertEquals(oi.getOrderInformationPage().isDisplayed(), true);
		Reporter.log("OrderInformation Page displayed", true);
		Reporter.log("SmokeTesting is pass on ForOrderDetailsLink", true);
		driver.navigate().back();
		Reporter.log("Going back to ThankYOu Page :)", true);
		ty.getContinueButton().click();
		Reporter.log("clicked on continue button", true);
		action.assertEquals(home.getHomepage().isDisplayed(), true);
		Reporter.log("Home page displayed", true);
		Reporter.log("CheckOut Procedure is Successfull", true);
	}

	@AfterMethod
	public void logoutTest(StartingPage sp) {
		home.getLogoutlink().click();
		Reporter.log("Clicked On logout link", true);
		action.assertEquals(sp.getRegisterlink().isDisplayed(), true);
		Reporter.log("User Successfully LogedOut", true);
		Reporter.log("E2E Testing is Pass :)", true);
		driver.close();
		Reporter.log("Browser Window Closed", true);
	}

	@AfterClass
	public void keypath() {
		Reporter.log("Applied PreCondition", true);
	}

	@AfterTest
	public void TestingTechniques() {
		Reporter.log("Smoke,IT and System Testing Applied :)", true);
	}

	@AfterSuite
	public void TypeOfTesting1() {
		Reporter.log("Automation Testing Performed", true);
	}

}
