package WebElementAgain1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingPoint_getLocation_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement w1=driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
		
		WebDriverWait w=new WebDriverWait(driver,10);
		Point loc=driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]")).getLocation();
		w.until(ExpectedConditions.elementToBeClickable(w1));
		System.out.println(loc);
		System.out.println(loc.getX());
		System.out.println(loc.getY());
	}
}
