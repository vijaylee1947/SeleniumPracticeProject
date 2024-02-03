package WebElementAgain1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_getText_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
			
		WebDriverWait w=new WebDriverWait(driver,10);
		WebElement allchips=driver.findElement(By.xpath("//div[@data-test-locator='trending-general-title']"));
		w.until(ExpectedConditions.visibilityOfAllElements(allchips));
		System.out.println(( allchips).getText());
		
	}
}
