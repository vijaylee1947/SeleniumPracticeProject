package SearchContextAgain4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClickOnClickHereButtonAndCloseWindow_ifItIsMeghanasBiriyani {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/User/Downloads/TestPage.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		Set<String> allid=driver.getWindowHandles();
		
		
		for(String element:allid) {
			driver.switchTo().window(element);
			String title=driver.getTitle();
			if(title.contains("Meghana Foods")) {
				Thread.sleep(2000);
				driver.close();
			}
		}
			
		}
	}


