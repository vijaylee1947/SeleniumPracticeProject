package WebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningTo_String_str {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.yahoo.com/");
	}

}
