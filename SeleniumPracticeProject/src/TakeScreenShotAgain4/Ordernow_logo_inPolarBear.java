package TakeScreenShotAgain4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ordernow_logo_inPolarBear {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://polarbear.co.in/");
		File temp=driver.findElement(By.xpath("//a[@class='btn btn-small btn-optional']")).getScreenshotAs(OutputType.FILE);
		File file=new File("./errorshots/polar.png");
		FileHandler.copy(temp, file);
	}
}
