package WebElementAgain1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_isSelected_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
		WebDriverWait w=new WebDriverWait(driver,20);
		WebElement w1=driver.findElement(By.xpath("//input[@id='gender-male']"));
		w.until(ExpectedConditions.elementToBeSelected(w1));
		System.out.println(w1.isSelected());
				
	}
}
