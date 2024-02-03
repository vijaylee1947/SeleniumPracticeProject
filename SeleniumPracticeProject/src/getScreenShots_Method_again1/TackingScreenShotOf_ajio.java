package getScreenShots_Method_again1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TackingScreenShotOf_ajio {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/");
		File temp=driver.getScreenshotAs(OutputType.FILE);
		File file=new File("./errorshots/ajio1.png");
		FileHandler.copy(temp, file);
	}

}
