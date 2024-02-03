package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert_Omayo_Website {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/search?q=");
		driver.findElement(By.xpath("//input[@id='alert1']")).click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

}
