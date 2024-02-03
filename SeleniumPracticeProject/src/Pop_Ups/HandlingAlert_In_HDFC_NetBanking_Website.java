package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAlert_In_HDFC_NetBanking_Website {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame(0);		
		
		Actions action=new Actions(driver);
		WebElement target=driver.findElement(By.linkText("CONTINUE"));
		action.moveToElement(target).perform();
		action.click().perform();
			
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
	}

}
