package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningMoveToElementUsingCo_Ordinates {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action=new Actions(driver);
		
		Point point=driver.findElement(By.className("ico-login")).getLocation();
		action.moveByOffset(point.getX(), point.getY()).click().perform();
		WebElement w=driver.findElement(By.xpath("//a[text()='Log in']"));
		action.moveToElement(w, 78, 0).click().perform();
	}

}
