package ActionsClass_Again4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_KeysUpAndKeysDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
				
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//input[@name='q']"));
		Thread.sleep(2000);
		action.sendKeys(ele, "laptop").perform();
		Thread.sleep(2000);
		action.moveToElement(ele).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		action.moveToElement(ele).sendKeys(Keys.DELETE).perform();
		
		
		
	}

}
