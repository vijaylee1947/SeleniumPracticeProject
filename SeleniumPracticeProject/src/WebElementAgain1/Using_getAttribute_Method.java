package WebElementAgain1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_getAttribute_Method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.woodlandworldwide.com/");
		driver.findElement(By.xpath("//input[@id='standard-bare']")).click();
		driver.findElement(By.xpath("//input[@id='standard-bare']")).sendKeys("sneaker");
		
		String w1=driver.findElement(By.id("standard-bare")).getAttribute("value");
		System.out.println(w1);
	}

}
