package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MovingCardFromOneListToAnotherList_In_Trello {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://trello.com/b/5GxZw6vS/agile");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("user")).sendKeys("chanikyachandragupta7@gmail.com");
		driver.findElement(By.id("login")).click();
		WebElement frame=driver.findElement(By.xpath("//form[@id='form-login']"));
					
		driver.findElement(By.id("password")).sendKeys("masterstudent123");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(2000);
//		driver.switchTo().frame("659c121f860e7d5ed50b101c");
		Thread.sleep(2000);
		WebElement src=driver.findElement(By.xpath("//a[@data-testid='card-name']"));
		WebElement target=driver.findElement(By.xpath("(//button[@data-testid='list-add-card-button'])[2]"));
		
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDrop(src, target).perform();
		
		
	}

}
