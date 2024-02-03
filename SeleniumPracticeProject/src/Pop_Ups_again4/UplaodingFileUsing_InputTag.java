package Pop_Ups_again4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UplaodingFileUsing_InputTag {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys("C:\\Users\\User\\Downloads\\resume_012");
	}

}
