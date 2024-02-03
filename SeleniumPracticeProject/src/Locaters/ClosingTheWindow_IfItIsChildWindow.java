package Locaters;




import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingTheWindow_IfItIsChildWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/Selenium%20app/TestPage.html");
		String parent=driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		Set<String> allId=driver.getWindowHandles();
		allId.remove(parent);
		
		for(String element:allId) {
			driver.switchTo().window(element).close();
		}
		
		
		
		
		
		
		
		
		
				
	}
}
