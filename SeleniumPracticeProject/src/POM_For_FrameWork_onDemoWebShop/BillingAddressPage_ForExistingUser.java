package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingAddressPage_ForExistingUser {

	@FindBy(xpath = "//h2[text()='Billing address']")
	private WebElement BillingAddressPage;

	public WebElement getBillingAddressPage() {
		return BillingAddressPage;
	}

	@FindBy(id = "billing-address-select")
	private WebElement FromAddressBookOrNewAddressdropdown;

	public WebElement getFromAddressBookOrNewAddressdropdown() {
		return FromAddressBookOrNewAddressdropdown;
	}

	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement ContinueButton;

	public WebElement getContinueButton() {
		return ContinueButton;
	}
}
