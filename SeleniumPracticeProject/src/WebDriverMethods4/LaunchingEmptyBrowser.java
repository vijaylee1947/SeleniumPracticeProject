package WebDriverMethods4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingEmptyBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

}
