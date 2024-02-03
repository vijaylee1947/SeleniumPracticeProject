package ReadingDataFromPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToDemoWebShop_byreadingCredentialsFromPropertyFile {
	public static void main(String[] args) throws IOException {
		
		File file=new File("./testdata/DemoWebShopLogin.properties");
		FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String dk=(String)prop.get("driverkey");
		String dp=(String)prop.get("driverpath");
		System.setProperty(dk,dp);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		String un=(String)prop.get("UN");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(un);
		
		String pass=(String)prop.get("PSWD");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pass);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		
	}

}
