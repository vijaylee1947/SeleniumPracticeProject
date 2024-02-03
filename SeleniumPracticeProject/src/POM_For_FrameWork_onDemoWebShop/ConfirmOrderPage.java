package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmOrderPage {

	@FindBy(xpath = "//h2[text()='Confirm order']")
	private WebElement ConfirmOrderPage;

	public WebElement getConfirmOrderPage() {
		return ConfirmOrderPage;
	}

	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
	private WebElement ContinueButton;

	public WebElement getContinueButton() {
		return ContinueButton;
	}

}
