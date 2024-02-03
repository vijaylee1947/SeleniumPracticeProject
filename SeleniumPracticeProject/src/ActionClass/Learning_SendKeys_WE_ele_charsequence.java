package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_SendKeys_WE_ele_charsequence {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement w=driver.findElement(By.id("small-searchterms"));	
		
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.sendKeys(w,"shirts").sendKeys(Keys.ENTER).perform();
	}

}
