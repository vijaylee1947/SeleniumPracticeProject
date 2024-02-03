package WebDriverMethodsAgain2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/Selenium%20app/TestPage.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandles());
	}
}
