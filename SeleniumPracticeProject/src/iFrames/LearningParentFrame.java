package iFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningParentFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/User/Downloads/iframe%20(1).html");
		
		driver.switchTo().frame("FR2");
		Thread.sleep(2000);
		driver.findElement(By.id("click-to-show")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txt_sm_search")).sendKeys("nexon");
		Thread.sleep(2000);
		driver.findElement(By.id("txt_sm_search")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Google")).click();
	}

}
