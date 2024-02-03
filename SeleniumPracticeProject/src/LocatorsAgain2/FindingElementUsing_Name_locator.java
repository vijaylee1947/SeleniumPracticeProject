package LocatorsAgain2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementUsing_Name_locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("search_query")).sendKeys("BruceLee");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
	}

}
