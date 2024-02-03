package WebDriverMethodsAgain2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchFromOneWindowToAnotherWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/Selenium%20app/TestPage.html");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(5000);
		
		Set<String> allID=driver.getWindowHandles();
		
		for(String element:allID) {
			driver.switchTo().window(element);
			Thread.sleep(3000);
			driver.close();
		}
	}

}
