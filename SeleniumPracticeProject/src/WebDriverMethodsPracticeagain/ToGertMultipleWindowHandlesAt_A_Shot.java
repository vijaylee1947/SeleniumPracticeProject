package WebDriverMethodsPracticeagain;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGertMultipleWindowHandlesAt_A_Shot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Downloads/TestPage.html");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(5000);
		System.out.println(driver.getWindowHandles());
	}
}
