package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAbleToRegister {

	@FindBy(linkText = "Register")
	private WebElement Registerlink;

	public WebElement getregistrationlink() {
		return Registerlink;
	}

	@FindBy(id = "gender-male")
	private WebElement maleradiobutton;

	public WebElement getmaleradiobutton() {
		return maleradiobutton;
	}

	@FindBy(id = "FirstName")
	private WebElement FirstName;

	public WebElement getFirstname() {
		return FirstName;
	}

	@FindBy(id = "LastName")
	private WebElement lastname;

	public WebElement getlastname() {
		return lastname;
	}

	@FindBy(id = "Email")
	private WebElement email;

	public WebElement getemail() {
		return email;
	}

	@FindBy(id = "Password")
	WebElement password;

	public WebElement getpassword() {
		return password;
	}

	@FindBy(id = "ConfirmPassword")
	private WebElement cpassword;

	public WebElement getCpassword() {
		return cpassword;
	}

	@FindBy(id = "register-button")
	private WebElement registerbutton;

	public WebElement getregisterbutton() {
		return registerbutton;
	}

	@FindBy(xpath = "\"//div[@class='result']\"")
	private WebElement confirmation;

	public WebElement getconfirmation() {
		return confirmation;
	}

}
