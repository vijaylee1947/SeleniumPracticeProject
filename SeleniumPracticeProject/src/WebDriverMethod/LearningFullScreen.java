package WebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFullScreen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().fullscreen();
	}

}
