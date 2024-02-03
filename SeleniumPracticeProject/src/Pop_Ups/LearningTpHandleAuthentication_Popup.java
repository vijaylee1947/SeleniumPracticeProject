package Pop_Ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningTpHandleAuthentication_Popup {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_D);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_M);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_D);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_M);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r1.keyRelease(KeyEvent.VK_A);
		Thread.sleep(2000);
		r1.keyRelease(KeyEvent.VK_D);
		Thread.sleep(2000);
		r1.keyRelease(KeyEvent.VK_M);
		Thread.sleep(2000);
		r1.keyRelease(KeyEvent.VK_I);
		Thread.sleep(2000);
		r1.keyRelease(KeyEvent.VK_N);
		r1.keyRelease(KeyEvent.VK_TAB);
		r1.keyRelease(KeyEvent.VK_ENTER);
	}

}

