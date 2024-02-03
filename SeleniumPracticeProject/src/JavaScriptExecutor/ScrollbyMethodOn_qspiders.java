package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbyMethodOn_qspiders {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.qspiders.com/");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//a[@href='https://pyspiders.com/batches']")).click();
				break;
			}catch(NoSuchElementException e) {
				jse.executeScript("window.scrollby(0,500);");
			}
		}
	}

}
