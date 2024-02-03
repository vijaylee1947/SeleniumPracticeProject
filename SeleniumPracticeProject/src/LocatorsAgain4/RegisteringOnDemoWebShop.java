package LocatorsAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisteringOnDemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("ram");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("rom");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("chanikyachandragupta7@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("ramrom1234");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("ramrom1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
	}

}
