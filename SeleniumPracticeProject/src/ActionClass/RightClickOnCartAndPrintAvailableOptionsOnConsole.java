package ActionClass;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOnCartAndPrintAvailableOptionsOnConsole {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action=new Actions(driver);
		WebElement right=driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		action.contextClick(right).perform();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		}
}
