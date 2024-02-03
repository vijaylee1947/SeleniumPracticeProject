package WebDriverMethodsPracticeagain;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchOneWindowToOtherWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Downloads/TestPage.html");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(5000);
		
		Set<String> AllIDs=driver.getWindowHandles();
		
		for(String element:AllIDs) {
			driver.switchTo().window(element);
			Thread.sleep(5000);
			driver.close();
		}
		
	}

}
