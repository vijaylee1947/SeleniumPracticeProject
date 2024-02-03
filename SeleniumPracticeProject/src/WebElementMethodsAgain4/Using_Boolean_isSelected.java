package WebElementMethodsAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Boolean_isSelected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@value='M']")).click();
		Boolean s=driver.findElement(By.xpath("//input[@value='M']")).isSelected();
		System.out.println(s);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		Boolean s1=driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
		System.out.println(s1);
		
				
	}

}
