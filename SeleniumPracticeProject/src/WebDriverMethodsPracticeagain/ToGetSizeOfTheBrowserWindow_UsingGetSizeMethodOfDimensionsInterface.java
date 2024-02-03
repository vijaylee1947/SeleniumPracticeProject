package WebDriverMethodsPracticeagain;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSizeOfTheBrowserWindow_UsingGetSizeMethodOfDimensionsInterface {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.manage().window().getSize());
	}

}
