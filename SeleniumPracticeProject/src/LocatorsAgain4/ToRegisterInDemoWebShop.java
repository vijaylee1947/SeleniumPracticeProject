package LocatorsAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegisterInDemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Vijay");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("lee");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("vijaylee1948@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("vijay007lee");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("vijay007lee");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
	}

}
