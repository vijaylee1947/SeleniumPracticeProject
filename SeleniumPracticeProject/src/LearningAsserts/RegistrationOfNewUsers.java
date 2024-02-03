package LearningAsserts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import UtilityClass.DataUtilityClass;

public class RegistrationOfNewUsers {

	@DataProvider(name = "Udata")
	public String[][] Register() throws EncryptedDocumentException, IOException {
		DataUtilityClass data = new DataUtilityClass();
		String[][] reg = data.readDataFromMultipleRow("./TestData/RegistrationDetails.xlsx", "userdetails");
		return reg;
	}

	@Test(dataProvider = "Udata")
	public void userregister(String[] user) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		SoftAssert action = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Application Launched", true);
		driver.findElement(By.linkText("Register")).click();
		Reporter.log("Clicked on register link", true);
		WebElement page = driver.findElement(By.xpath("//h1[text()='Register']"));
		action.assertEquals(page.isDisplayed(), true);
		Reporter.log("Register page displayed", true);
		driver.findElement(By.id("gender-male")).click();
		Reporter.log("selected gender as male", true);

		driver.findElement(By.id("FirstName")).sendKeys(user[0]);
		String name1 = driver.findElement(By.id("FirstName")).getAttribute("value");
		action.assertEquals(name1, user[0]);
		Reporter.log("First name entered", true);

		driver.findElement(By.id("LastName")).sendKeys(user[1]);
		String name2 = driver.findElement(By.id("LastName")).getAttribute("value");
		action.assertEquals(name2, user[1]);
		Reporter.log("Last name entered", true);

		driver.findElement(By.id("Email")).sendKeys(user[2]);
		String email = driver.findElement(By.id("Email")).getAttribute("value");
		action.assertEquals(email, user[2]);
		Reporter.log("email entered", true);

		driver.findElement(By.id("Password")).sendKeys(user[3]);
		String pass = driver.findElement(By.id("Password")).getAttribute("value");
		action.assertEquals(pass, user[3]);
		Reporter.log("password entered", true);

		driver.findElement(By.id("ConfirmPassword")).sendKeys(user[4]);
		String cpass = driver.findElement(By.id("ConfirmPassword")).getAttribute("value");
		action.assertEquals(cpass, user[4]);
		Reporter.log("Confirm password entered", true);

		driver.findElement(By.id("register-button")).click();
		Reporter.log("clicked on register button", true);
		String result = driver.getCurrentUrl();
		action.assertEquals(result, "https://demowebshop.tricentis.com/registerresult/1");
		Reporter.log("Confirmation message displayed", true);

		driver.quit();
		Reporter.log("window closed", true);

	}

}
