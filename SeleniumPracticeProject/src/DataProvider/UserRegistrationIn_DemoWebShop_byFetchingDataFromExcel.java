package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserRegistrationIn_DemoWebShop_byFetchingDataFromExcel {

	@DataProvider(name = "Rdata")
	public String[][] registartion() throws EncryptedDocumentException, IOException {
		File file = new File("./TestData/RegistrationDetails.xlsx");
		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("userdetails1");

		int rownum = sheet.getPhysicalNumberOfRows();
		int colnum = sheet.getRow(0).getPhysicalNumberOfCells();

		String[][] details = new String[rownum - 1][colnum];

		for (int i = 1; i < rownum; i++) {
			for (int j = 0; j < colnum; j++) {
				details[i - 1][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return details;
	}

	@Test(dataProvider = "Rdata")
	public void userregistration(String[] data1) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("launching browser", true);
		driver.manage().window().maximize();
		Reporter.log("Maximizing browser", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("applied implicit wait", true);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Application launched", true);
		driver.findElement(By.linkText("Register")).click();
		Reporter.log("Clicked on Register link", true);
		driver.findElement(By.id("gender-male")).click();
		Reporter.log("Seleceted gender as male", true);
		driver.findElement(By.id("FirstName")).sendKeys(data1[0]);
		Reporter.log("Entered fierst name", true);
		driver.findElement(By.id("LastName")).sendKeys(data1[1]);
		Reporter.log("Entered last name", true);
		driver.findElement(By.id("Email")).sendKeys(data1[2]);
		Reporter.log("Entered email", true);
		driver.findElement(By.id("Password")).sendKeys(data1[3]);
		Reporter.log("Entered password", true);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data1[4]);
		Reporter.log("Entered confirm password", true);
		driver.findElement(By.id("register-button")).click();
		Reporter.log("Clicked on register button", true);
		driver.quit();
	}

}
