package WebDriverMethods4;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchFromeOneWindowToAnotherWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/User/Downloads/TestPage.html");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Set<String> allid=driver.getWindowHandles();
		
		for(String ele:allid) {
			driver.switchTo().window(ele);
			Thread.sleep(2000);
			driver.close();
			
		}
	}

}
