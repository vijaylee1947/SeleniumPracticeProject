package WebDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningSetStringGetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/Selenium%20app/TestPage.html");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getWindowHandles());
	}

}
