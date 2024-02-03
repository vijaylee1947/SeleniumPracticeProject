package getScreenShots_Method;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class EnquiryButton_InQspider_com {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");
		
		File temp=driver.findElement(By.xpath("//span[text()='Enquiry']")).getScreenshotAs(OutputType.FILE);
		File file=new File("./errorshots/enquirylogo.jpeg");
		FileHandler.copy(temp, file);
	}

}
