package POM_For_FrameWork_onDemoWebShop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResult_Page {

	@FindBy(xpath = "//h1[text()='Search']")
	private WebElement SearchResultpage;

	public WebElement getSearchResultpage() {
		return SearchResultpage;
	}

	@FindBy(linkText = "Smartphone")
	private WebElement productlink;

	public WebElement getProductlink() {
		return productlink;
	}

}
