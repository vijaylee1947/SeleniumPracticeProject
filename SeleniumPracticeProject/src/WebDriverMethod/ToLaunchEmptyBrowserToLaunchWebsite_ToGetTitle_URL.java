package WebDriverMethod;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchEmptyBrowserToLaunchWebsite_ToGetTitle_URL {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.linkedin.com/");
		System.out.println("Current URL of CurrentWebsite:"+" "+driver.getCurrentUrl());
		System.out.println("Title of the website:"+" "+driver.getTitle());
	}

}
