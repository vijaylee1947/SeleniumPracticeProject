package WebElementAgain1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;


public class RemovingDataByDoingKeyBoardAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("rambo1");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.xpath("//input[@id='search']")).clear();
		
	}

}
