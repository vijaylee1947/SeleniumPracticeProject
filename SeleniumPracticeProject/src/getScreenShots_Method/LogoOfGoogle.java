package getScreenShots_Method;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LogoOfGoogle {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		File temp=driver.findElement(By.xpath(("//img[@data-atf='1'])[2]"))).getScreenshotAs(OutputType.FILE);
		File file=new File("./errorshots/googlelogo.jpeg");
		FileHandler.copy(temp, file);
	}
}
