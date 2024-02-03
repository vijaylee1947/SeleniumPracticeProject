package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningStaleElementReferenceException {
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search=driver.findElement(By.id("small-searchterms"));
		search.sendKeys("smartphone");
		
		driver.navigate().refresh();
		
			
		//search=driver.findElement(By.id("small-searchterms"));
		System.out.println(search.getAttribute("value"));
		
	}
		
	

}
