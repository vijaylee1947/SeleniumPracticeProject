package WaitAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.testyantra.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,2);
		WebElement s1=driver.findElement(By.xpath("//a[text()='Services']"));
		wait.until(ExpectedConditions.elementToBeClickable(s1));
		s1.click();
		
	}

}
