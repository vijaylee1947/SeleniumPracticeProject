package iFrames_again1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByIndex {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/User/Downloads/iframe%20(1).html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("shirts");
	}

}
