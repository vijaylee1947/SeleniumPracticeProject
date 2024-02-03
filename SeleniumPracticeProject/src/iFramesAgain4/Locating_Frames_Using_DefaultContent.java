package iFramesAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_Frames_Using_DefaultContent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/User/Downloads/iframe%20(1).html");
		
		driver.switchTo().frame("FR2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id=\'click-to-show\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("txt_sm_search")).sendKeys("nexon");
		Thread.sleep(2000);
		driver.findElement(By.name("txt_sm_search")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Google']")).click();
	}

}
