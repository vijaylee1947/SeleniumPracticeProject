package getScreenShots_Method;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOfParticularElement {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tatamotors.com/");
		
		WebElement Class=driver.findElement(By.className("logo-wrp2"));
		File ss=Class.getScreenshotAs(OutputType.FILE);
		File file=new File("./errorshots/logo.png");
		FileHandler.copy(ss, file);
		
	}
}
