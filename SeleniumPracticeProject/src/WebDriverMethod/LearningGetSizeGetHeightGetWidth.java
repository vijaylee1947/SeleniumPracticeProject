package WebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetSizeGetHeightGetWidth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
	}
}
