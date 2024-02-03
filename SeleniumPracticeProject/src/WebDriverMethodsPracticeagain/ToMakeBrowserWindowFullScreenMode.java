package WebDriverMethodsPracticeagain;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMakeBrowserWindowFullScreenMode {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		driver.get("https://www.flipkart.com/");
	}

}
