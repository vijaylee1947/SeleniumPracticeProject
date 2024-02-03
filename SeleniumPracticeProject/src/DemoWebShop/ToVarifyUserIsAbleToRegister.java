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
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class ToVarifyUserIsAbleToRegister {
	public static void main(String[] args) throws IOException {
		File file = new File("./TestData/DemoWebShopLogin.properties");
		FileInputStream fis = new FileInputStream(file);

		Properties prop = new Properties();
		prop.load(fis);
		String dk = (String) prop.get("driverkey");
		String dp = (String) prop.get("driverpath");
		String url1 = (String) prop.get("url");

		File file1 = new File("./TestData/registartiondata.xlsx");
		FileInputStream fis1 = new FileInputStream(file1);

		Workbook workbook = WorkbookFactory.create(fis1);
		Sheet sheet = workbook.getSheet("data");

		// setting path
		System.setProperty(dk, dp);

		// browser is launched
		WebDriver driver = new ChromeDriver();
		Reporter.log("browser launched", true);

		// using SoftAssertion
		SoftAssert softassert = new SoftAssert();

		// browser window maximized
		driver.manage().window().maximize();
		Reporter.log("browser maximised", true);

		// using implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("implicit wait applied", true);

		// launching Application
		driver.get(url1);
		Reporter.log("Application launched", true);

		// clicking on register link
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Reporter.log("Register link clicked", true);

		// varying it is register page or not
		String heading = driver.findElement(By.xpath("//h1[text()='Register']")).getText();
		Reporter.log("register page displayed", true);

		// varying it is register page,if it is register page, then fill the
		// valid details and click on register button
		softassert.assertEquals(heading, "Register");
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(sheet.getRow(1).getCell(0).toString());
		driver.findElement(By.id("LastName")).sendKeys(sheet.getRow(1).getCell(1).toString());
		driver.findElement(By.id("Email")).sendKeys(sheet.getRow(1).getCell(2).toString());
		driver.findElement(By.id("Password")).sendKeys(sheet.getRow(1).getCell(3).toString());
		driver.findElement(By.id("ConfirmPassword")).sendKeys(sheet.getRow(1).getCell(4).toString());
		driver.findElement(By.id("register-button")).click();
		Reporter.log("entered valid data into all the fields", true);
		Reporter.log("clicked on register button", true);

		// storing confirmation message into variable to verify
		String confirm = driver.findElement(By.xpath("//div[@class='result']")).getText();

		// verifying Register button working or not
		softassert.assertEquals(confirm, "registration completed");
		Reporter.log("Confirmation message displayed", true);
		Reporter.log("Functional Testing is pass", true);
		
		softassert.assertAll();
	}

}
