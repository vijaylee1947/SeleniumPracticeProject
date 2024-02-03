package POM;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class UserAbleToEnterEmailInNewsLetterSectionAndClickOnSubscribeButton {

	@FindBy(xpath = "//strong[text()='Newsletter']")
	private WebElement newslettersoption;

	public WebElement getnewslettersoptiondisplayed() {
		return newslettersoption;
	}

	@FindBy(id = "newsletter-email")
	private WebElement newsletteremail;

	public WebElement getemailofnewsletter() {
		return newsletteremail;
	}

	@FindBy(xpath = "//input[@value='Subscribe']")
	private WebElement subscribebutton;

	public WebElement getSubscribebutton() {
		return subscribebutton;
	}

	@FindBy(id = "newsletter-result-block")
	private WebElement newsletterresultblock;

	public WebElement getnewsletterresultblock() {
		return newsletterresultblock;
	}

}
