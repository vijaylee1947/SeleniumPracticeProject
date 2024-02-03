package WebDriverMethodsAgain2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingWebsiteUsint_toURL_Method {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(new URL("https://www.youtube.com/"));
	}

}
