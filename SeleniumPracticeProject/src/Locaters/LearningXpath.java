package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodlandworldwide.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='standard-bare']")).sendKeys("sneakers");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='standard-bare']")).sendKeys(Keys.ENTER);
	}

}
