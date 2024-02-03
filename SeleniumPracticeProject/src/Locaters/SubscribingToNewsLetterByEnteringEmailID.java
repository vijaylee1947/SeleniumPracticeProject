package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubscribingToNewsLetterByEnteringEmailID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.name("NewsletterEmail")).sendKeys("vijaylee1948@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		Thread.sleep(3000);
	}

}
