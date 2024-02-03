package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage {

	@FindBy(xpath = "//div[@class='page product-details-page']")
	private WebElement ProductDetailsPage;

	public WebElement getProductDetailsPage() {
		return ProductDetailsPage;
	}

	@FindBy(id = "add-to-cart-button-43")
	private WebElement AddtoCartButton;

	public WebElement getAddtoCartButton() {
		return AddtoCartButton;
	}

	@FindBy(linkText = "shopping cart")
	private WebElement ConfirmationMessage;

	public WebElement getConfirmationMessage() {
		return ConfirmationMessage;
	}

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement ShoppingCartlink;

	public WebElement getShoppingCartlink() {
		return ShoppingCartlink;
	}

}
