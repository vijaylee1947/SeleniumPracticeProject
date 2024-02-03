package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laerning_name_locater {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.name("Gender")).click();
	}
}
