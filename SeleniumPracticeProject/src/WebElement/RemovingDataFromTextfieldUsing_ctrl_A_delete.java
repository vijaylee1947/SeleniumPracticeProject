package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemovingDataFromTextfieldUsing_ctrl_A_delete {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("shirts");
		Thread.sleep(2000);		
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.BACK_SPACE);
		
	}

}
