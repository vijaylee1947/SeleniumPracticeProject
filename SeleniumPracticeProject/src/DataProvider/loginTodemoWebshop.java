package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginTodemoWebshop {
	
	@DataProvider(name="Udata")
	public String[][] logindata(){
		String[][] userdetails= {{"chanikyachandragupta7@gmail.com","ramrom1234"},
				{"mondy456@gmail.com","sanmondy90"},
				{"sumanthchinivar16@gmail.com","Rowdy@123"}};
		return userdetails;
		}
	
	@Test(dataProvider = "Udata")
	public void Use(String[] Ldata) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(Ldata[0]);
		driver.findElement(By.id("Password")).sendKeys(Ldata[1]);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
		
		}
	}


