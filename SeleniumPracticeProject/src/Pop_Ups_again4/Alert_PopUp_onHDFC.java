package Pop_Ups_again4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_PopUp_onHDFC {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
				
		driver.switchTo().frame(0);
		
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		action.moveToElement(ele).click().perform();
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		Thread.sleep(2000);
		alert.accept();
	}

}
