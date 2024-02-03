package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningToHandleAlertPop_up {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
	}

}
