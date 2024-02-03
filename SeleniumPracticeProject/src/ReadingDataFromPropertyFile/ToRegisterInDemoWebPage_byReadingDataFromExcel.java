package ReadingDataFromPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegisterInDemoWebPage_byReadingDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Location the file and reading the file
		File file = new File("./TestData/DemoWebShopLogin.properties");
		FileInputStream fis = new FileInputStream(file);
		System.out.println("Property file is read");

		// to read and fetch data from property file
		Properties prop = new Properties();
		prop.load(fis);
		String dk = (String) prop.get("driverkey");
		String dp = (String) prop.get("driverpath");
		

		// setting key value path
		System.setProperty(dk, dp);
		

		// reading data from excel
		File file1 = new File("./TestData/registartiondata.xlsx");
		FileInputStream fis1 = new FileInputStream(file1);
		

		// to fetch sheet from excel
		Workbook workbook = WorkbookFactory.create(fis1);
		Sheet sheet = workbook.getSheet("data");
		

		// launching browser
		WebDriver driver = new ChromeDriver();
		System.out.println("sucessfully browser launched");

		// maximizing browser window
		driver.manage().window().maximize();
		System.out.println("browser window maximized");

		// creating implicite wait to avoid delay
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("created implicit wait");

		// Launching application
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("Sucessfully launched");

		// clicking on register link
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		System.out.println("Register page opened");

		// selecting gender as male
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		System.out.println("Gender is selected as male");

		// Reading data from excel , to enter first name
		String d1 = sheet.getRow(1).getCell(0).toString();
		driver.findElement(By.id("FirstName")).sendKeys(d1);
		System.out.println("First name Entered");

		// Reading data from excel , to enter last name
		String d2 = sheet.getRow(1).getCell(1).toString();
		driver.findElement(By.id("LastName")).sendKeys(d2);
		System.out.println("Last name entered");

		// Reading data from excel , to enter Email
		String d3 = sheet.getRow(1).getCell(2).toString();
		driver.findElement(By.id("Email")).sendKeys(d3);
		System.out.println("Email is entered");

		// Reading data from excel , to enter password
		String d4 = sheet.getRow(1).getCell(3).toString();
		driver.findElement(By.id("Password")).sendKeys(d4);
		System.out.println("Password entered");

		// Reading data from excel , to enter confirm password
		String d5 = sheet.getRow(1).getCell(4).toString();
		driver.findElement(By.id("ConfirmPassword")).sendKeys(d5);
		System.out.println("ConfirmPassword entered");

		// Clicking on register button.
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		System.out.println("Register button clicked");

		System.out.println("Your Registration Completed Sucessfully---|:-)");

	}

}
