package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserRegistrationInDemoWebShop_byUsing2DimensionalArray {
	
	@DataProvider(name="Rdata")
	public String[][] userdetails(){
		String[][] details= {{"sano","rita","rita555@gmail.com","sano999","sano999"},
				{"robin","hood","robin345@gmail.com","hood654","hood654"},
				{"aston","martin","aston888@gmail.com","martin89","martin89"},
				{"Siri","semi","sirisam45@gmail.com","siri@09","siri@09"},
				{"alexa","sony","alexa56@gmail.com","sony456","sony456"}};
		return details;
		}
	
	@Test(dataProvider = "Rdata")
	public void read(String[] data) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(data[0]);
		driver.findElement(By.id("LastName")).sendKeys(data[1]);
		driver.findElement(By.id("Email")).sendKeys(data[2]);
		driver.findElement(By.id("Password")).sendKeys(data[3]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data[4]);
		driver.findElement(By.id("register-button")).click();
		driver.quit();
	}
	}


