package WebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningNavigatorMethodOfBackAndForwardMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.qspiders.com/");
		Thread.sleep(5000);
		driver.get("https://www.testyantra.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
	}
}
