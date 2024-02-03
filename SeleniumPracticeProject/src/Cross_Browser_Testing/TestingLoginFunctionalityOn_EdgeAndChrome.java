package Cross_Browser_Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestingLoginFunctionalityOn_EdgeAndChrome {
	
	@Test
	public void EdgeBrowser() {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		if(driver.findElement(By.xpath("//strong[text()='Returning Customer']")).isDisplayed()) {
			System.out.println("login link is working fine");
		}else {
			System.out.println("login link is not working");
		}
	}
	
	@Test
	public void chromeBrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		if(driver.findElement(By.xpath("//strong[text()='Returning Customer']")).isDisplayed()) {
			System.out.println("login link is working fine");
		}else {
			System.out.println("login link is not working");
		}
	}
}
