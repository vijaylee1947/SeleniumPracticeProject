package LocatorsAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToGmailUsingCssSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("lee456raj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("poiuytrewq123mnbvcxz");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
