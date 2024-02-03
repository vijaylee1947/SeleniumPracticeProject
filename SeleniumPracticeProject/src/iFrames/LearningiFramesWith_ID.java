package iFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningiFramesWith_ID {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/User/Downloads/iframe%20(1).html");
		
		driver.switchTo().frame("FR1");
		driver.findElement(By.name("q")).sendKeys("mouse");
	}

}
