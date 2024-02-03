package WebDriverMethodsPracticeagain;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToRefreshthepage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.alibaba.com/?from_http=1");
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
}

