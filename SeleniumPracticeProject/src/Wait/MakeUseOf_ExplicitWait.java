package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeUseOf_ExplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://www.shoppersstack.com/products_page/4");
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		//driver.findElement(By.id("Check Delivery")).sendKeys("456789");
		
		WebElement ele=driver.findElement(By.id("Check"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		
	}

}
