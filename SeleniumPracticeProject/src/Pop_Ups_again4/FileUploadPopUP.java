package Pop_Ups_again4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUP {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(2000);
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_D);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_R);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r1.keyRelease(KeyEvent.VK_D);
		Thread.sleep(2000);
		r1.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r1.keyRelease(KeyEvent.VK_R);
	}

}
