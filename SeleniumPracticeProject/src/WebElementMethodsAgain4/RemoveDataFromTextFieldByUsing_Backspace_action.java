package WebElementMethodsAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveDataFromTextFieldByUsing_Backspace_action {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcdefghijk");
		
		String data=driver.findElement(By.xpath("//input[@name='q']")).getAttribute("value");
		
		for(;;) 
		{
			if(!driver.findElement(By.xpath("//input[@name='q']")).equals(" ")){
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.BACK_SPACE);
			}else {
				break;
			}
			
		}
	}
}
