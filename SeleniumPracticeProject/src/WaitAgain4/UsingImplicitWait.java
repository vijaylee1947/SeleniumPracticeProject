package WaitAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.get("https://www.qspiders.com/");
		driver.findElement(By.xpath("//span[text()='Enquiry']")).click();
	}

}
