package WebDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningSetSizeDimensionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().setSize(new Dimension(500, 500));
	}

}
