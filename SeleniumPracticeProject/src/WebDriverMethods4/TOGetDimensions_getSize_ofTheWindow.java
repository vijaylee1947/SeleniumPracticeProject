package WebDriverMethods4;

import org.openqa.selenium.chrome.ChromeDriver;

public class TOGetDimensions_getSize_ofTheWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
	}

}
