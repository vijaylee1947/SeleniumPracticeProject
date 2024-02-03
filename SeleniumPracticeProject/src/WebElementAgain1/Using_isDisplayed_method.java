package WebElementAgain1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_isDisplayed_method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Boolean w1=driver.findElement(By.xpath("(//a[@id='endpoint'])[1]")).isDisplayed();
		
		WebDriverWait w=new WebDriverWait(driver,10);
		WebElement w2=driver.findElement(By.xpath("(//a[@id='endpoint'])[1]"));
		w.until(ExpectedConditions.elementToBeClickable(w2));
		System.out.println(w1);
	}

}
