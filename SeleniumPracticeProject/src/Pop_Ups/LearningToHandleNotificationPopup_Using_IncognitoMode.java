package Pop_Ups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearningToHandleNotificationPopup_Using_IncognitoMode {
public static void main(String[] args) {
	ChromeOptions settings=new ChromeOptions();
	settings.addArguments("--incognito");
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver(settings);
	driver.manage().window().maximize();
	driver.get("https://www.yatra.com/");
	
}
}
