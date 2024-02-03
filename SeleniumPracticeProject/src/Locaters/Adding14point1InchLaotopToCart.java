package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adding14point1InchLaotopToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("14.1-inch")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button-31")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("ico-cart")).click();
		Thread.sleep(3000);
		
	}
}
