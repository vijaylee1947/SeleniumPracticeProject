package WebElementAgain1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingSendKeysMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		WebDriverWait w=new WebDriverWait(driver,20);
		WebElement w1=driver.findElement(By.xpath("//input[@name='search_query']"));
		w.until(ExpectedConditions.elementToBeClickable(w1));
		w1.click();
		w1.sendKeys("dangerous");
		w1.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]")).click();
		
	}

}
