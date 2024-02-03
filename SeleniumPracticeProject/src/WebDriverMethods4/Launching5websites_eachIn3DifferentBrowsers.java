package WebDriverMethods4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching5websites_eachIn3DifferentBrowsers {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver1=new FirefoxDriver();
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver2=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com/");
		driver1.get("https://www.youtube.com/");
		driver2.get("https://www.youtube.com/");
		
		driver.get("https://www.yahoo.com/");
		driver1.get("https://www.yahoo.com/");
		driver2.get("https://www.yahoo.com/");
		
		driver.get("https://www.myntra.com/");
		driver1.get("https://www.myntra.com/");
		driver2.get("https://www.myntra.com/");
		
		

	}

}
