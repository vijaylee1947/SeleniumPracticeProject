package ActionsClass_Again4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Perform_ClickAction_Using_moveToElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Register']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(ele).click().perform();
	}

}
