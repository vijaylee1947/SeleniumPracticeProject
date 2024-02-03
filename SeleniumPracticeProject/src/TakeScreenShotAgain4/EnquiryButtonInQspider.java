package TakeScreenShotAgain4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class EnquiryButtonInQspider {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.qspiders.com/");
		File temp=driver.findElement(By.xpath("//span[text()='Enquiry']")).getScreenshotAs(OutputType.FILE);
		File file=new File("./errorshots/enquiry3.png");
		FileHandler.copy(temp, file);
	}

}
