package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingMethodPage {

	@FindBy(xpath = "//h2[text()='Shipping method']")
	private WebElement ShippingMethodPage;

	public WebElement getShippingMethodPage() {
		return ShippingMethodPage;
	}

	@FindBy(id = "shippingoption_0")
	private WebElement Ground;

	public WebElement getGroundOption() {
		return Ground;
	}

	@FindBy(id = "shippingoption_1")
	private WebElement NextDayAir;

	public WebElement getNextDayAirOption() {
		return NextDayAir;
	}

	@FindBy(id = "shippingoption_2")
	private WebElement SecondDayAir;

	public WebElement getSecondDayAirgoption() {
		return SecondDayAir;
	}

	@FindBy(id = "//input[@onclick='ShippingMethod.save()']")
	private WebElement ContinueButton;

	public WebElement getContinueButton() {
		return ContinueButton;
	}

}
