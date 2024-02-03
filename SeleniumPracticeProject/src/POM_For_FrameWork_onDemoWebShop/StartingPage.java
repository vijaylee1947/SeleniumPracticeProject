package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartingPage {

	@FindBy(linkText = "Register")
	private WebElement Registerlink;

	public WebElement getRegisterlink() {
		return Registerlink;
	}

	@FindBy(linkText = "Log in")
	private WebElement Loginlink;

	public WebElement getLoginlink() {
		return Loginlink;
	}

}
