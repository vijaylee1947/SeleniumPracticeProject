package WebDriverMethodsPracticeagain;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseTheBrowserWindowUsing_CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.close();
	}
}
