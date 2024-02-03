package getScreenShots_Method;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenShotUsing_getScreenShotas_Method {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		File file=new File("./errorshots/demowebhome.jpeg");
		FileHandler.copy(ss, file);

	}
}

