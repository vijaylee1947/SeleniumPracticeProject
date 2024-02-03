package WebElementMethodsAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndPlay_Song_In_Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("MichelJackson songs");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500);");
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[5]")).click();
	
		
	}

}
