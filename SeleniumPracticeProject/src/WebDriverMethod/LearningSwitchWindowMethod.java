package WebDriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningSwitchWindowMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/Selenium%20app/TestPage.html");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(5000);
		
		Set<String> allwindowID=driver.getWindowHandles();
		
		for(String windowid:allwindowID) {
			driver.switchTo().window(windowid);
			Thread.sleep(5000);
			driver.close();
		}
		
	}

}
