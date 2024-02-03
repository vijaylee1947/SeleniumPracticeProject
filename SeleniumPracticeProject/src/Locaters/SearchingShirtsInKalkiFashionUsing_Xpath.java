package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchingShirtsInKalkiFashionUsing_Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com/in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='head-search-1234']")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("Shirts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys(Keys.ENTER);
	}

}
