package WebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningRefreshMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.testyantra.com/");
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
}
