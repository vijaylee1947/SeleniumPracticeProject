package SelectClassMethos_again1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PerformingActionsOnDropDownList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//select[@id='drop1']")).click();
		
		WebElement w=driver.findElement(By.xpath("//select[@id='drop1']"));
		Select s=new Select(w);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("def");
		Thread.sleep(2000);
		s.selectByVisibleText("doc 2");
		Thread.sleep(2000);
		
		
		
	}

}
