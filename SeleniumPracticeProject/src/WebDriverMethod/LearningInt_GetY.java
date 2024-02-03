package WebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningInt_GetY {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.testyantra.com/");
		System.out.println(driver.manage().window().getPosition().getY());
	}
}
