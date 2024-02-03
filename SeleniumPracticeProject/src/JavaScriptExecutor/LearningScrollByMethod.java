package JavaScriptExecutor;


import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningScrollByMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		JavascriptExecutor jc=(JavascriptExecutor)driver;
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
				break;
			}catch(NoSuchElementException e) {
				jc.executeScript("Window.ScrollBy(0,800);");
			}
		}
		
	}

}
