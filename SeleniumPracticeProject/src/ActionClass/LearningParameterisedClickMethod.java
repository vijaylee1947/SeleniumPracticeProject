package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningParameterisedClickMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/");
	
	Actions action=new Actions(driver);
	WebElement Register=driver.findElement(By.linkText("Register"));
	action.click(Register).perform();
}}
