package LocatorsAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSearchShirtsInKalkiFashion {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.kalkifashion.com/");
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//div[@class='head-search-1234']")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("shirts");
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys(Keys.ENTER);
		
	}

}
