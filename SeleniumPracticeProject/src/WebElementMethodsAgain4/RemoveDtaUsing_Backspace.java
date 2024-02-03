package WebElementMethodsAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveDtaUsing_Backspace {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("indianFlag");
		String dat=driver.findElement(By.xpath("//textarea[@name='q']")).getAttribute("value");
		
		for(;;) {
			
			if(!driver.findElement(By.xpath("//textarea[@name='q']")).equals(" ")) {
				
				driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.BACK_SPACE);
			}else {
				break;
			}
		}
	}

}
