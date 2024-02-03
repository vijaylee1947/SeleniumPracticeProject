package Pop_Ups_again4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_PromptPopUp_On_ShoppersStack {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		Robot r1=new Robot();
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_END);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_END);
		Thread.sleep(2000);
		r1.keyRelease(KeyEvent.VK_END);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Swagger Documentation")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		alert.sendKeys("admin");
		Thread.sleep(2000);
		alert.accept();
		alert.sendKeys("admin");
		Thread.sleep(2000);
		alert.accept();
		
	}

}
