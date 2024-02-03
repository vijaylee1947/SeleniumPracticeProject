package SelectClass_Or_DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSelectByVisibleText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://omayo.blogspot.com/");
		WebElement dr=driver.findElement(By.xpath("//select[@id='drop1']"));
		Select s=new Select(dr);
		s.selectByVisibleText("doc 2");
		Thread.sleep(2000);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("jkl");
	}

}
