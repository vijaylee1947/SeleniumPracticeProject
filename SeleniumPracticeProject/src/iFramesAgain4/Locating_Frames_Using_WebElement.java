package iFramesAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_Frames_Using_WebElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/User/Downloads/iframe%20(1).html");
		
		WebElement ele=driver.findElement(By.id("FR1"));
		driver.switchTo().frame(ele);
		driver.findElement(By.name("q")).sendKeys("SunGlasses");
	}

}
