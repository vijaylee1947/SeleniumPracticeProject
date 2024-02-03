package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(linkText = "moonaaa7656@gmail.com")
	private WebElement Homepage;

	public WebElement getHomepage() {
		return Homepage;
	}

	@FindBy(linkText = "Register")
	private WebElement RegisterLink;

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	
	@FindBy(id = "small-searchterms")
	private WebElement SearchTextField;

	public WebElement getSearchTextField() {
		return SearchTextField;
	}

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement SearchButton;

	public WebElement getSearchButton() {
		return SearchButton;
	}

	@FindBy(linkText = "Log out")
	private WebElement Logoutlink;

	public WebElement getLogoutlink() {
		return Logoutlink;
	}

}
