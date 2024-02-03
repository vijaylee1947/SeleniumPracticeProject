package iFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningDefaultContent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/User/Downloads/iframe%20(1).html");
		
		driver.switchTo().frame("FR2");
		Thread.sleep(2000);
		driver.findElement(By.id("click-to-show")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txt_sm_search")).sendKeys("nexon");
		Thread.sleep(2000);
		driver.findElement(By.id("btn_sm_search")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Google")).click();
	}

}
