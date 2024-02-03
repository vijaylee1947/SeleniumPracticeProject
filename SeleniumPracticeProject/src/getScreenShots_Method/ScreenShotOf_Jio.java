package getScreenShots_Method;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOf_Jio {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jio.com/");
		
		File temp=driver.getScreenshotAs(OutputType.FILE);
		File file=new File("./errorshots/jio.png");
		FileHandler.copy(temp, file);
	}

}
