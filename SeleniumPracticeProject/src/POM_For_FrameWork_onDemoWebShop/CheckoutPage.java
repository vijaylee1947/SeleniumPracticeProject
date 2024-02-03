package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {
	
	@FindBy(xpath = "//h1[text()='Checkout']")
	private WebElement checkoutpage;
	public WebElement getcheckoutpage() {
		return checkoutpage;
	}
	

	@FindBy(xpath = "//h2[text()='Billing address']")
	private WebElement BillingAddressTab;

	public WebElement getBillingAddressPage() {
		return BillingAddressTab;
	}

}
