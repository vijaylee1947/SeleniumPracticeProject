package DemoWebShop;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Verify_user_is_able_to_vote_and_submit_in_community_poll {
	public static void main(String[] args) throws IOException {
		File file = new File("./TestData/DemoWebShopLogin.properties");
		FileInputStream fis = new FileInputStream(file);

		Properties prop = new Properties();
		prop.load(fis);
		String dk = (String) prop.get("driverkey");
		String dp = (String) prop.get("driverpath");
		String url1 = (String) prop.get("url");

		// setting path
		System.setProperty(dk, dp);

		SoftAssert soft = new SoftAssert();
		// launching an browser
		WebDriver driver = new ChromeDriver();
		Reporter.log("browser launched", true);

		// maximizing browser window
		driver.manage().window().maximize();
		Reporter.log("browser window maximized", true);

		// using implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("applied implicit wait", true);

		// launching application
		driver.get(url1);
		Reporter.log("application launched", true);

		// verifying login link displayed
		WebElement login = driver.findElement(By.linkText("Log in"));
		soft.assertEquals(login.isDisplayed(), true);
		Reporter.log("login link displayed", true);

		// clicking on login link
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("clicked on login link", true);

		File file1 = new File("./TestData/registartiondata.xlsx");
		FileInputStream fis1 = new FileInputStream(file1);

		Workbook workbook = WorkbookFactory.create(fis1);
		Sheet sheet = workbook.getSheet("data");

		// verifying login page displayed
		WebElement page1 = driver.findElement(By.xpath("//strong[text()='Returning Customer']"));
		soft.assertEquals(page1.isDisplayed(), true);
		Reporter.log("login page displayed", true);
		// Entering email and password to login
		driver.findElement(By.id("Email")).sendKeys(sheet.getRow(1).getCell(2).toString());
		driver.findElement(By.id("Password")).sendKeys(sheet.getRow(1).getCell(3).toString());
		driver.findElement(By.id("RememberMe")).click();
		Reporter.log("entered email and password", true);
		// clicking on login button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Home page displayed", true);

		// verifying community poll options displayed
		WebElement option = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		soft.assertEquals(option.isDisplayed(), true);
		Reporter.log("communitypoll frame displayed", true);

		// selecting community poll option to vote
		driver.findElement(By.id("pollanswers-2")).click();
		Reporter.log("clicked on good option", true);

		// verifying clicked option is selected or not
		WebElement opt1 = driver.findElement(By.id("pollanswers-2"));
		soft.assertEquals(opt1.isSelected(), true);
		Reporter.log("selected good radio button", true);

		// clicking on vote button
		driver.findElement(By.id("vote-poll-1")).click();
		Reporter.log("clicked on vote button", true);

		// verifying poll results displayed
		WebElement result = driver.findElement(By.className("poll-results"));
		soft.assertEquals(result.isDisplayed(), true);
		Reporter.log("confirmation message displayed", true);
		Reporter.log("Functional testing is pass", true);

		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("clicked on logout link", true);
	}

}
