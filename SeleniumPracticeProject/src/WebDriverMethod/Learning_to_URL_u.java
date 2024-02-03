package WebDriverMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_to_URL_u {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");
		Thread.sleep(5000);
		driver.navigate().to(new URL("https://www.yahoo.com/"));
	}
}
