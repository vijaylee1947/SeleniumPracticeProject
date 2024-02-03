package WebDriverMethodsAgain2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingWebsiteUsing_toString_method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
	}

}
