package LocatorsAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingTheElementsUsing_CssSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.cssSelector("input[placeholder='Search the web']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Search the web']")).sendKeys("sachin");
		
	}

}
