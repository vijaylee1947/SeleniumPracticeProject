package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserIsAbleToAddProductToTheWishList {

	@FindBy(linkText = "Log in")
	private WebElement loginlink;

	public WebElement getlogin() {
		return loginlink;
	}

	@FindBy(id = "Email")
	private WebElement emailtextfield;

	public WebElement getemailtextfield() {
		return emailtextfield;
	}

	@FindBy(id = "Password")
	private WebElement passwordtextfield;

	public WebElement getpasswordtextfield() {
		return passwordtextfield;
	}

	@FindBy(id = "RememberMe")
	private WebElement remembermecheckbox;

	public WebElement getremembermecheckbox() {
		return remembermecheckbox;
	}

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;

	public WebElement getloginbutton() {
		return loginbutton;
	}

	@FindBy(linkText = "$25 Virtual Gift Card")
	private WebElement particularproduct;

	public WebElement getparticularproduct() {
		return particularproduct;
	}

	@FindBy(id = "giftcard_2_RecipientName")
	private WebElement recipientname;

	public WebElement getrecipientname() {
		return recipientname;
	}

	@FindBy(id = "giftcard_2_RecipientEmail")
	private WebElement recipientemail;

	public WebElement getrecipientemail() {
		return recipientemail;
	}

	@FindBy(id = "add-to-wishlist-button-2")
	private WebElement addtowishlistbutton2;

	public WebElement getaddtowishlistbutton2() {
		return addtowishlistbutton2;
	}

	@FindBy(xpath = "//p[@class='content']")
	private WebElement confirmation;

	public WebElement getaddedwishlistconfirmation() {
		return confirmation;
	}

	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistlink;

	public WebElement getwishlistlink() {
		return wishlistlink;
	}

	@FindBy(xpath = "(//a[@href='/wishlist'])[2]")
	private WebElement clickwishlistlink;

	public WebElement getclickwishlistlink() {
		return clickwishlistlink;
	}

	@FindBy(xpath = "//div[@class='page-title']")
	private WebElement wishlistpage;

	public WebElement getwishlistpage() {
		return wishlistpage;
	}

	@FindBy(linkText = "$25 Virtual Gift Card")
	private WebElement addedproductinwishlist;

	public WebElement getaddedproductinwishlist() {
		return addedproductinwishlist;
	}

}
