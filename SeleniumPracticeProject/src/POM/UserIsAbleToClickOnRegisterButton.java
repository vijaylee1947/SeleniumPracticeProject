package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserIsAbleToClickOnRegisterButton {

	@FindBy(linkText = "Register")
	private WebElement registerlink;

	public WebElement getregisterlink() {
		return registerlink;
	}

	@FindBy(xpath = "//h1[text()='Register']")
	private WebElement registerpagedisplayed;

	public WebElement getregisterpagedisplayed() {
		return registerpagedisplayed;
	}

}
