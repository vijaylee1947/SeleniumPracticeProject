package Pop_Ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFileUsingInputTage_InNaukri {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Register")).click();
		
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys("C:\\Users\\User\\Downloads\\resume_012.docx");
		
	}

}
