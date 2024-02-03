package LocatorsAgain2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementUsingClassName_Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.alibaba.com/?from_http=1");
		Thread.sleep(3000);
		driver.findElement(By.className("paly-video")).click();
		
	}

}
