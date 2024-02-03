package WebElementAgain1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_getTagname_method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		String Tag=driver.findElement(By.xpath("//a[@aria-label='Check your mail']")).getTagName();
		
		WebDriverWait w=new WebDriverWait(driver,15);
		WebElement tag1=driver.findElement(By.xpath("//a[@aria-label='Check your mail']"));
		w.until(ExpectedConditions.elementToBeClickable(tag1));
		System.out.println(Tag);
	}
}
