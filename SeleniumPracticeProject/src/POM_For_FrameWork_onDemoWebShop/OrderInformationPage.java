package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderInformationPage {

	@FindBy(xpath = "//h1[text()='Order information']")
	private WebElement OrderInformationPage;

	public WebElement getOrderInformationPage() {
		return OrderInformationPage;
	}

}
