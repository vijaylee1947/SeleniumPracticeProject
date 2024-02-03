package LocatorsAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSubscribeToNewsLetters {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("vijaylee1947@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
	}

}
