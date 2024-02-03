package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentInformationPage {

	@FindBy(xpath = "//h2[text()='Payment information']")
	private WebElement PaymentInformationPage;

	public WebElement getPaymentInformationPage() {
		return PaymentInformationPage;
	}

	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement ContinueButton;

	public WebElement getContinueButton() {
		return ContinueButton;
	}

}
