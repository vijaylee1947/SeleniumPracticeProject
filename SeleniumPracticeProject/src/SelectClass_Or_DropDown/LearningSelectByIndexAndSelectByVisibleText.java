package SelectClass_Or_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSelectByIndexAndSelectByVisibleText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/notebooks");
		
		WebElement dropdown=driver.findElement(By.id("products-orderby"));
		Select s=new Select(dropdown);
		s.selectByIndex(4);
		
		WebElement d1=driver.findElement(By.id("products-viewmode"));
		Select s1=new Select(d1);
		s1.selectByVisibleText("List");
		
	}

}
