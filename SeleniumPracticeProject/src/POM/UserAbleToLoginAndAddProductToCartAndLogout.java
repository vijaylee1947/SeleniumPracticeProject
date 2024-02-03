package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAbleToLoginAndAddProductToCartAndLogout {

	@FindBy(linkText = "Log in")
	private WebElement logindisplayed;

	public WebElement getlogindisplayed() {
		return logindisplayed;
	}

	@FindBy(linkText = "Log in")
	private WebElement loginlink;

	public WebElement getloginlink() {
		return loginlink;
	}

	@FindBy(xpath = "\"//strong[text()='Returning Customer']\"")
	private WebElement loginpage;

	public WebElement getloginpagedisplayed() {
		return loginpage;
	}

	@FindBy(id = "Email")
	private WebElement email;

	public WebElement getenteremail() {
		return email;
	}

	@FindBy(id = "Password")
	private WebElement password;

	public WebElement getenterpassword() {
		return password;
	}

	@FindBy(id = "RememberMe")
	private WebElement remembercheckbox;

	public WebElement getselectremembercheckbox() {
		return remembercheckbox;
	}

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;

	public WebElement getloginbutton() {
		return loginbutton;
	}

	@FindBy(linkText = "Log out")
	private WebElement logoutlink;

	public WebElement getlogoutlink() {
		return logoutlink;
	}

	@FindBy(id = "small-searchterms")
	private WebElement search;

	public WebElement getsearch() {
		return search;
	}

	@FindBy(xpath = "(//img[contains(@title,'14.1-inch Laptop')])[2]")
	private WebElement productimage;

	public WebElement getproductimage() {
		return productimage;
	}

	@FindBy(id = "add-to-cart-button-31")
	private WebElement addtocart;

	public WebElement getaddtocartbutton() {
		return addtocart;
	}

	@FindBy(xpath = "//p[text()='The product has been added to your ']")
	private WebElement confirmation;

	public WebElement getaddedproductconfirmation() {
		return confirmation;
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
	private WebElement addedproductdisplayed;

	public WebElement getaddedproductdisplayedincart() {
		return addedproductdisplayed;
	}

	@FindBy(linkText = "Log out")
	private WebElement logoutuser;

	public WebElement getlogoutfromapp() {
		return logoutlink;
	}

	@FindBy(linkText = "Register")
	private WebElement logoutconfirm;

	public WebElement getlogoutconfirmation() {
		return logoutconfirm;
	}

}
