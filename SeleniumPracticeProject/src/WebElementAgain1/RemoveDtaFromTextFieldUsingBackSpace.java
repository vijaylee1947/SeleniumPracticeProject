package WebElementAgain1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveDtaFromTextFieldUsingBackSpace {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Mummy");
		
		for(;;) {
			
		if(!driver.findElement(By.xpath("//input[@id='search']")).equals(" ")) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.BACK_SPACE);
		}else {
			break;
		}
	}
		
	}

}
