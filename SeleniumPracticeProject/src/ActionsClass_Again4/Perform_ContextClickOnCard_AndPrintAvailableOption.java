package ActionsClass_Again4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Perform_ContextClickOnCard_AndPrintAvailableOption {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://trello.com/b/5GxZw6vS/agile");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("chanikyachandragupta7@gmail.com");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		WebElement ele2=driver.findElement(By.xpath("//form[@id='form-login']"));
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("masterstudent123");
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		WebElement ele1=driver.findElement(By.xpath("//a[text()='card']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(ele1).contextClick().perform();
		
		List<WebElement> s1=driver.findElements(By.xpath("//div[@data-testid='quick-card-editor-buttons']"));
		for(WebElement ele:s1){
			System.out.println(ele.getText());
		}
		
		
	}

}
