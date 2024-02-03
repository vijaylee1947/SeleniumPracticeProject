package SearchContextAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSendDataToTextField_Or_TextArea {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.xpath("//input[@name='p']")).click();
		driver.findElement(By.xpath("//input[@name='p']")).sendKeys("tata");
		driver.findElement(By.xpath("//input[@name='p']")).sendKeys(Keys.ENTER);
		
	}

}
