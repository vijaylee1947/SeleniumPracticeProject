package WebElementAgain1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_isEnabled_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/141-inch-laptop");
		
		WebDriverWait w=new WebDriverWait(driver,10);
		WebElement enable=driver.findElement(By.xpath("//input[@value='Email a friend']"));
		w.until(ExpectedConditions.elementToBeClickable(enable));
		System.out.println(enable.isEnabled());
	}

}
