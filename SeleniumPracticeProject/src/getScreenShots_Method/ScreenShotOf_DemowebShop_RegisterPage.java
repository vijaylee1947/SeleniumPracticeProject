package getScreenShots_Method;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOf_DemowebShop_RegisterPage {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		
		File temp=driver.getScreenshotAs(OutputType.FILE);
		File file=new File("./errorshots/demoshop.png");
		FileHandler.copy(temp, file);
	}
}
