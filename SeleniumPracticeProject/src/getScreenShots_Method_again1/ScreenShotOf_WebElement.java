package getScreenShots_Method_again1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOf_WebElement {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		File temp=driver.findElement(By.xpath("//img[@class='lnXdpd']")).getScreenshotAs(OutputType.FILE);
		File file=new File("./errorshots/Glogo1.png");
		FileHandler.copy(temp, file);
	}

}
