package WebDriverMethod;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchingTitleOfWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.partsbaba.com/");
		System.out.println(driver.getTitle());
		
	}

}
