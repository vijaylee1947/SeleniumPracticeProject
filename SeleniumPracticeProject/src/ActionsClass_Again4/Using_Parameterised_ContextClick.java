package ActionsClass_Again4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_Parameterised_ContextClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.contextClick(ele).perform();
	}

}
