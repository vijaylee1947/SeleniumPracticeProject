package TakeScreenShotAgain4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOf_DemoWebRegisterPage {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/register");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File file=new File("./errorshots/register3.png");
		FileHandler.copy(temp, file);
	}

}
