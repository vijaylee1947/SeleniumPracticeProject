package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClear_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='text-input flex'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("vijaylee1948@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@autocomplete='username']")).clear();
	}
	

}
