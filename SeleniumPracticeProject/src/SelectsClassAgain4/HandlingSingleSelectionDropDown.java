package SelectsClassAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleSelectionDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		WebElement dd=driver.findElement(By.xpath("//select[@id='drop1']"));
		
		Select select=new Select(dd);
		
		select.selectByValue("ghi");
		Thread.sleep(2000);
		select.selectByVisibleText("doc 3");
		Thread.sleep(2000);
			select.selectByIndex(1);
		Thread.sleep(2000);
		
		
		
		
	}

}
