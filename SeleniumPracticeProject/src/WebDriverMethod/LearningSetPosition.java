package WebDriverMethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningSetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.testyantra.com/");
		driver.manage().window().setPosition(new Point(50, 120));
	}

}
