package WebElementAgain1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_Dimension_getSize_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		
		WebDriverWait w=new WebDriverWait(driver,15);
		Dimension size=driver.findElement(By.linkText("Sign in")).getSize();
		WebElement w1=driver.findElement(By.linkText("Sign in"));
		w.until(ExpectedConditions.elementToBeClickable(w1));
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
	}
}
