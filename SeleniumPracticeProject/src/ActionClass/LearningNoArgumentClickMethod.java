package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningNoArgumentClickMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action=new Actions(driver);
		WebElement searchbutton=driver.findElement(By.xpath("//input[@value='Search']"));
		action.moveToElement(searchbutton).perform();
		action.click().perform();
	}

}
