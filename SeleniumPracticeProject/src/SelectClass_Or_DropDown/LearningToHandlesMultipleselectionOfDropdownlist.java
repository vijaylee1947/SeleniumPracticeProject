package SelectClass_Or_DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningToHandlesMultipleselectionOfDropdownlist {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement drd=driver.findElement(By.id("cars"));
		Select s=new Select(drd);
		s.selectByValue("99");
		Thread.sleep(2000);
		s.selectByIndex(4);
		Thread.sleep(2000);
		s.selectByVisibleText("INR 200 - INR 299 ( 3 )");
		Thread.sleep(2000);
		String p1=s.getFirstSelectedOption().getText();
		System.out.println(p1);
		s.deselectByIndex(0);
		Thread.sleep(2000);
		s.deselectAll();
		List<WebElement> selected=s.getAllSelectedOptions();
		for(WebElement ele:selected) {
			System.out.println(ele.getText());
		}
		List<WebElement> s1=s.getOptions();
		for(WebElement s2:s1) {
		System.out.println(s2.getText());
		}
	}

}
