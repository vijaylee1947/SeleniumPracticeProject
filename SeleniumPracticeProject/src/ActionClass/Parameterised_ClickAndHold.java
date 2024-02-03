package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Parameterised_ClickAndHold {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.switchTo().frame(3);
		Actions action=new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		action.moveToElement(src).clickAndHold(src).perform();
		WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));
		action.moveToElement(target).release(target).perform();
	}

}
