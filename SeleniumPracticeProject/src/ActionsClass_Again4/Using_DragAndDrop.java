package ActionsClass_Again4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://trello.com/b/5GxZw6vS/agile");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("chanikyachandragupta7@gmail.com");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		WebElement ele=driver.findElement(By.xpath("//form[@id='form-login']"));
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("masterstudent123");
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		WebElement src=driver.findElement(By.xpath("(//a[@data-testid='card-name'])[1]"));
		WebElement target=driver.findElement(By.xpath("(//button[@data-testid='list-add-card-button'])[2]"));
		
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDrop(src, target).perform();
	}

}
