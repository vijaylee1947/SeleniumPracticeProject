package SearchContextAgain4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingWindowIfItIs_a_ChildWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Downloads/TestPage.html");
		String parentid=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);
		driver.switchTo().window(parentid).close();
		
		Set<String> allchild=driver.getWindowHandles();
		
		for(String ele:allchild) {
			driver.switchTo().window(ele);
			Thread.sleep(2000);
			driver.close();
		}
		
	}

}
