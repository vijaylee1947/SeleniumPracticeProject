package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingContainsFunction_or_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodlandworldwide.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='Shop Now'])[3]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='productcardplp_discount__G_IKH'])[22]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='40']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	}
}
