package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class varifyUserAbleToAddProductToCart {

	@FindBy(linkText = "Log in")
	private WebElement loginlink;

	public WebElement getloginlink() {
		return loginlink;
	}

	@FindBy(id = "Email")
	private WebElement email;

	public WebElement getemail() {
		return email;
	}

	@FindBy(id = "Password")
	private WebElement password;

	public WebElement getpassword() {
		return password;
	}

	@FindBy(id = "RememberMe")
	private WebElement rememberme;

	public WebElement getrememberme() {
		return rememberme;
	}

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;

	public WebElement getloginbutton() {
		return loginbutton;
	}

	@FindBy(id = "small-searchterms")
	private WebElement searchtextfield;

	public WebElement getsearchtextfield() {
		return searchtextfield;
	}

	@FindBy(linkText = "14.1-inch Laptop")
	private WebElement clickonproduct;

	public WebElement getclickonproduct() {
		return clickonproduct;
	}

	@FindBy(id = "add-to-cart-button-31")
	private WebElement addtocartbutton;

	public WebElement getaddtocartbutton() {
		return addtocartbutton;
	}

	@FindBy(xpath = "//p[text()='The product has been added to your ']")
	private WebElement confirmationmessage;

	public WebElement getconfirmationmessage() {
		return confirmationmessage;
	}

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingcartlink;

	public WebElement getshoppingcartlink() {
		return shoppingcartlink;
	}

	@FindBy(xpath = "//h1[text()='Shopping cart']")
	private WebElement shoppingcartpage;

	public WebElement getshoppingcartpage() {
		return shoppingcartpage;
	}

	@FindBy(linkText = "14.1-inch Laptop")
	private WebElement productdisplayedincart;

	public WebElement getproductdisplayedincart() {
		return productdisplayedincart;
	}

}
