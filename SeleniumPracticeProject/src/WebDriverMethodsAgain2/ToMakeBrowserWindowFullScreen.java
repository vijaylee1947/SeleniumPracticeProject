package WebDriverMethodsAgain2;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMakeBrowserWindowFullScreen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.close();
	}

}
