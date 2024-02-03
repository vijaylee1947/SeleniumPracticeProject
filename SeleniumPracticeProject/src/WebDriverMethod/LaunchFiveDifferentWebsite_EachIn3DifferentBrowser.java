package WebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFiveDifferentWebsite_EachIn3DifferentBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		EdgeDriver driver1=new EdgeDriver();
		ChromeDriver driver2=new ChromeDriver();
		driver.get("https://brucelee.com/");
		Thread.sleep(5000);
		driver1.get("https://brucelee.com/");
		Thread.sleep(5000);
		driver2.get("https://brucelee.com/");
		Thread.sleep(5000);
		driver.get("https://www.naukri.com/nlogin/login/");
		Thread.sleep(5000);
		driver1.get("https://www.naukri.com/nlogin/login/");
		Thread.sleep(5000);
		driver2.get("https://www.naukri.com/nlogin/login/");
		Thread.sleep(5000);
		driver.get("https://www.yatra.com/");
		Thread.sleep(5000);
		driver1.get("https://www.yatra.com/");
		Thread.sleep(5000);
		driver2.get("https://www.yatra.com/");
		Thread.sleep(5000);
		driver.get("https://landrecords.karnataka.gov.in/service78/Login.aspx");
		Thread.sleep(5000);
		driver1.get("https://landrecords.karnataka.gov.in/service78/Login.aspx");
		Thread.sleep(5000);
		driver2.get("https://landrecords.karnataka.gov.in/service78/Login.aspx");
		Thread.sleep(5000);
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver1.get("https://www.google.com/");
		Thread.sleep(5000);
		driver2.get("https://www.google.com/");
		Thread.sleep(5000);
	}

}

