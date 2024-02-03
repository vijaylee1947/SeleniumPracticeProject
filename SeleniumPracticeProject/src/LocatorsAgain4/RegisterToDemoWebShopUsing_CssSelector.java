package LocatorsAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterToDemoWebShopUsing_CssSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a[href='/register']")).click();
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Rodin");
		driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("wood");
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("robin143@gmail.com");
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("robin@123");
		driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("robin@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='register-button']")).click();
		
	}

}
