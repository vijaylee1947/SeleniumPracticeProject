package WebElementAgain1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingRectangle_getRect_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.woodlandworldwide.com/");
		Rectangle rect=driver.findElement(By.xpath("(//img[@alt='logo'])[1]")).getRect();
		
		WebDriverWait w=new WebDriverWait(driver,10);
		WebElement w1=driver.findElement(By.xpath("(//img[@alt='logo'])[1]"));
		w.until(ExpectedConditions.elementToBeClickable(w1));
		System.out.println(rect);
		
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println(rect.height);
		System.out.println(rect.width);
		
	}

}
