package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSearchSachinTendulkarUsingCSSselector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("textarea[name='q']")).sendKeys("SachinTendulkar");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("textarea[name='q']")).sendKeys(Keys.ENTER);
		
	}

}
