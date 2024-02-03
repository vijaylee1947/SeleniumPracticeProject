package WebDriverMethodsPracticeagain;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchwebsiteUsing_toURL_mathos {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(new URL("https://www.alibaba.com/?from_http=1"));
	}
}
