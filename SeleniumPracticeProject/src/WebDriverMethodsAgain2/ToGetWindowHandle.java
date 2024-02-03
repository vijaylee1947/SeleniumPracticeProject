package WebDriverMethodsAgain2;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getWindowHandle());
	}
}
