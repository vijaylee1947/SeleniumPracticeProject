package getScreenShots_Method;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class OrderNow_LogoInPolarBear {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://polarbear.co.in/");
		
		File temp=driver.findElement(By.linkText("Order Now!")).getScreenshotAs(OutputType.FILE);
		File file=new File("./errorshots/orderlogo.png");
		FileHandler.copy(temp, file);
	}

}
