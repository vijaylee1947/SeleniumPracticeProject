package SelectsClassAgain4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiselectionDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://demoapp.skillrary.com/");
			
			WebElement c=driver.findElement(By.id("cars"));
			
			Select select=new Select(c);
			select.selectByIndex(1);
			select.selectByValue("399");
			select.selectByVisibleText("More Than INR 500 ( 55 )");
			
			String s1=select.getFirstSelectedOption().getText();
			System.out.println("first selected option");
			System.out.println(s1);
			
			System.out.println("all selected options");
			List<WebElement> s2=select.getAllSelectedOptions();
			for(WebElement ele:s2) {
				
				System.out.println(ele.getText());
			}
			System.out.println("get option");
			List<WebElement> s3=select.getOptions();
			for(WebElement ele:s3) {
				
				System.out.println(ele.getText());
			}
			
			select.deselectByIndex(1);
			select.deselectByValue("399");
			select.deselectAll();
			
			
		
			
			
			
	}

}
