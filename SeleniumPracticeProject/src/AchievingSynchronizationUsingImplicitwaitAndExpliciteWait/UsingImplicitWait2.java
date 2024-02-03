package AchievingSynchronizationUsingImplicitwaitAndExpliciteWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitWait2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	}

}
