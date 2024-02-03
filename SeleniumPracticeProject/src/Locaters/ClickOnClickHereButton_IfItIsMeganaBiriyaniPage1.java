package Locaters;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnClickHereButton_IfItIsMeganaBiriyaniPage1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/Selenium%20app/TestPage.html");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		Set<String> allID=driver.getWindowHandles();
		
		for(String element:allID) {
			driver.switchTo().window(element);
			String title=driver.getTitle();
			if(title.contains("Meghana Foods")) {
				Thread.sleep(3000);
				driver.close();
			}
		}
	}

}
