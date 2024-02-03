package LocatorsAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToViewAllMotorCyclesInSuzukiMotorCycle_co_in {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.suzukimotorcycle.co.in/");
		driver.findElement(By.xpath("(//a[@href='https://www.suzukimotorcycle.co.in/products'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='View all'])[1]")).click();
	}

}
