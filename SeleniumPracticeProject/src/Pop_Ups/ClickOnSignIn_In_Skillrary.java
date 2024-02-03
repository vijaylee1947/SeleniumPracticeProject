package Pop_Ups;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnSignIn_In_Skillrary {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		
		driver.findElement(By.xpath("//a[text()='Sign In']"));
		WebElement pop=driver.findElement(By.xpath("//div[@id='gdpr-cookie-message']"));
		driver.switchTo().frame(pop);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
	}

}
