package WebElementAgain1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingClickMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
				
		WebDriverWait w1=new WebDriverWait(driver,10);
		WebElement w=driver.findElement(By.xpath("//input[@id='search']"));
		w1.until(ExpectedConditions.elementToBeClickable(w));
		w.click();
	}

}
