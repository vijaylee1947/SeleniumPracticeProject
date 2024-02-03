package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterInDemoWebShope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Spider");
		driver.findElement(By.id("LastName")).sendKeys("man");
		driver.findElement(By.id("Email")).sendKeys("vijaylee1958@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("spider@143");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("spider@143");
		driver.findElement(By.id("register-button")).click();
	}
}
