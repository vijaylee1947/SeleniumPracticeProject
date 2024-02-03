package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAbleToVoteAndSubmitInCommunityPoll {

	@FindBy(linkText = "Log in")
	private WebElement loginlinkdisplayed;

	public WebElement getloginlinkdisplayed() {
		return loginlinkdisplayed;
	}

	@FindBy(linkText = "Log in")
	private WebElement clickloginlink;

	public WebElement getloginlinkclick() {
		return clickloginlink;
	}

	@FindBy(xpath = "//strong[text()='Returning Customer']")
	private WebElement loginpagedisplayed;

	public WebElement getloginpagedisplayed() {
		return loginpagedisplayed;
	}

	@FindBy(id = "Email")
	private WebElement emailtextfield;

	public WebElement getemailtextfield() {
		return emailtextfield;
	}

	@FindBy(id = "Password")
	private WebElement passwordtextfield;

	public WebElement getpasswordtextfield() {
		return passwordtextfield;
	}

	@FindBy(id = "RememberMe")
	private WebElement remembermecheckbox;

	public WebElement getremembermecheckbox() {
		return remembermecheckbox;
	}

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement clickloginbutton;

	public WebElement getloginbuttonclick() {
		return clickloginbutton;
	}

	@FindBy(xpath = "//strong[text()='Community poll']")
	private WebElement communitypolloptionsdisplayed;

	public WebElement getcommunitypolloptionsdisplayed() {
		return communitypolloptionsdisplayed;
	}

	@FindBy(id = "pollanswers-2")
	private WebElement selectpollanswer2;

	public WebElement getselectpollanswer2() {
		return selectpollanswer2;
	}

	@FindBy(id = "pollanswers-2")
	private WebElement pollanswer2selected;

	public WebElement getverifypollanswer2selected() {
		return pollanswer2selected;
	}

	@FindBy(id = "vote-poll-1")
	private WebElement clickvotebutton;

	public WebElement getclickvotebutton() {
		return clickvotebutton;
	}

	@FindBy(className = "poll-results")
	private WebElement pollresultdisplayed;

	public WebElement getverifypollresultdisplayed() {
		return pollresultdisplayed;
	}

	@FindBy(linkText = "Log out")
	private WebElement logoutlink;

	public WebElement getlogoutlink() {
		return logoutlink;
	}

}
