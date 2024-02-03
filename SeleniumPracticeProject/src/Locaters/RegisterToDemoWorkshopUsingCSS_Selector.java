package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterToDemoWorkshopUsingCSS_Selector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href='/register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='M']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("Sano");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("Rita");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("vijaylee1988@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("winners9887");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("winners9887");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Register']")).click();
	}

}
