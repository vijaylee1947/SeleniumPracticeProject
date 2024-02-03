package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearningToDisableNotification {
	public static void main(String[] args) {
		ChromeOptions settings=new ChromeOptions();
		settings.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		
		 
	}

}
