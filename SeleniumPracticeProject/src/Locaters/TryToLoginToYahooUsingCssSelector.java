package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryToLoginToYahooUsingCssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[data-redirect-params='pspid=[[pspid]]&activity=ybar-signin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='login-username']")).sendKeys("lee456raj");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("poiuytrewq123mnbvcxz");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[value='Next']")).click();
		Thread.sleep(2000);
		
		
	}
}
