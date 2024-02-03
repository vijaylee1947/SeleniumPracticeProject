package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_dragAndDrop_with_srcAndtarget {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.switchTo().frame(3);
		
		WebElement src=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement target=driver.findElement(By.id("trash"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(src, target).perform();
	}

}
