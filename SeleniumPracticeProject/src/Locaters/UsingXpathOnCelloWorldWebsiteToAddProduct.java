package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathOnCelloWorldWebsiteToAddProduct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://celloworld.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href='/collections/drinkware'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href='/collections/steel-flasks'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href='/products/duro-kent-vacusteel-flask-900'])[1]")).click();
		
	}

}
