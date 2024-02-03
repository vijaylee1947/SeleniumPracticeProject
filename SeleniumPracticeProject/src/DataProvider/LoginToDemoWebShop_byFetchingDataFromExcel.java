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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginToDemoWebShop_byFetchingDataFromExcel {
	
	@DataProvider(name="Udata")
	public String[][] logindetails() throws EncryptedDocumentException, IOException{
		File file=new File("./TestData/LoginCredentials.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("details");
		
		int rownum=sheet.getPhysicalNumberOfRows();
		int colnum=sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data=new String[rownum-1][colnum];
		
		for(int i=0;i<rownum-1;i++) {
			for(int j=0;j<colnum;j++) {
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
	@Test(dataProvider = "Udata")
	public void login(String[] cred) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(cred[0]);
		driver.findElement(By.id("Password")).sendKeys(cred[1]);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
	}
}
