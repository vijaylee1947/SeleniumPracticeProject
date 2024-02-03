package Laptops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hplaptop {
	
	@Test(groups = "Function",dependsOnMethods = "Update",dependsOnGroups = "Smoke")
	public void Hp() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.hp.com/in-en/home.html");
		System.out.println("i am from HP");
	}
	
	@Test(groups = "integration")
	public void Update() {
		System.out.println("HP has updated");
	}

}
