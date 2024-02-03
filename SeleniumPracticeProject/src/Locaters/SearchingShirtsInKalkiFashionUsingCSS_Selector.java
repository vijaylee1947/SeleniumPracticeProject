package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchingShirtsInKalkiFashionUsingCSS_Selector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com/in/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='head-search-1234']")).click();
		driver.findElement(By.cssSelector("input[id='search-input']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='search-input']")).sendKeys("shirts");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='search-input']")).sendKeys(Keys.ENTER);
	}

}
