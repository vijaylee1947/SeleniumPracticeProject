package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Suzuki {
	
	@Test
	public void suzuki() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.suzukimotorcycle.co.in/");
		driver.quit();
		System.out.println("i am suzuki");
	}

}
