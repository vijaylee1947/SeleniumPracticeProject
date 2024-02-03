package PracticeLocatorsAgain;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatingElementsUsingID_locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("createacc")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("vijay");
		Thread.sleep(3000);
		driver.findElement(By.name("lastName")).sendKeys("bhaskar");
		Thread.sleep(3000);
		driver.findElement(By.name("userId")).sendKeys("lee456raj");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("poiuytrewq123mnbvcxz");
		Thread.sleep(3000);
		driver.findElement(By.name("mm")).sendKeys("march");
		Thread.sleep(3000);
		driver.findElement(By.name("dd")).sendKeys("20");
		Thread.sleep(3000);
		driver.findElement(By.name("yyyy")).sendKeys("1985");
		Thread.sleep(3000);
		driver.findElement(By.name("signup")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("phone")).sendKeys("9740462944");
		Thread.sleep(3000);
		driver.findElement(By.id("arrowDown")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("signup")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("recaptcha-checkbox-border")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("rc-image-tile-33")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("recaptcha-verify-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("recaptcha-reload-button")).click();
		Thread.sleep(3000);
		
	}

}
