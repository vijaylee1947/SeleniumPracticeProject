package LocatorsAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAddSteelFlaskInCelloWorld {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://celloworld.com/");
		driver.findElement(By.xpath("(//a[text()='DRINKWARE'])[1]")).click();
		driver.findElement(By.xpath("(//div[text()='STEEL FLASKS'])[1]")).click();
		driver.findElement(By.xpath("(//a[@href='/products/duro-kent-vacusteel-flask-900'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	}

}
