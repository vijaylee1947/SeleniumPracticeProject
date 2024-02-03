package LocatorsAgain2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementUsing_PartialLinkText_Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Join")).click();
	}
}
