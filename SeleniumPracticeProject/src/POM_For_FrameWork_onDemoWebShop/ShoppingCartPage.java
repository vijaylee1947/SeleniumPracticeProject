package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {

	@FindBy(xpath = "//h1[text()='Shopping cart']")
	private WebElement Shoppingcartpage;

	public WebElement getShoppingcartpage() {
		return Shoppingcartpage;
	}
	
	@FindBy(linkText = "Smartphone")
	private WebElement productlink;

	public WebElement getProductlink() {
		return productlink;
	}

	@FindBy(id = "CountryId")
	private WebElement Countryname;

	public WebElement getCountryname() {
		return Countryname;
	}

	@FindBy(id = "termsofservice")
	private WebElement TermsofServicescheckbox;

	public WebElement getTermsofServicescheckbox() {
		return TermsofServicescheckbox;
	}

	@FindBy(id = "checkout")
	private WebElement CheckOutbutton;

	public WebElement getCheckOutbutton() {
		return CheckOutbutton;
	}

}
