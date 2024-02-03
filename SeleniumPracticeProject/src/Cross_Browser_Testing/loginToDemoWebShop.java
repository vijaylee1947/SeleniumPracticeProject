package Cross_Browser_Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginToDemoWebShop {

	@Test
	@Parameters("browsers")
	public void login(@Optional("chrome") String browser) {
		WebDriver driver = null;

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}else if(browser.equals("gecko")) {
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("chanikyachandragupta7@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("ramrom1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
	}
	

}
