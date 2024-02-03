package AchievingSynchronizationUsingImplicitwaitAndExpliciteWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitWait1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//if it takes more than 20 seconds time, then it should display-
		//no such element found exception
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("//button[@id='loginBtn']"));
	}

}
