package WebElement;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAdd2ProductsInFlipkartAndCompareAndRemoveLeastCostProduct {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("redmi13c");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.className("_396cs4")).click();
		driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).sendKeys(Keys.ENTER);
		
		
	}

}
