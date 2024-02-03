package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningToHandleConfirmationAlert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://licindia.in/");
		
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		Actions action=new Actions(driver);
		WebElement target=driver.findElement(By.xpath("//a[@class='login1']"));
		action.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//a[text()='Agent Portal']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		
	}

}
