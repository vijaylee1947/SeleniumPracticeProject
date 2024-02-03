package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Yamaha {
	
	@Test
	public void yamaha() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yamaha-motor-india.com/");
		driver.quit();
		System.out.println("i am yamaha");
	}

}
