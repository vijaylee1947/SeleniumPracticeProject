package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_KeysUpAndKeysDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action=new Actions(driver);
		WebElement search=driver.findElement(By.id("small-searchterms"));
		Thread.sleep(2000);
		action.sendKeys(search,"smartphones").perform();
		Thread.sleep(2000);
		action.moveToElement(search).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.DELETE).perform();
	}

}
