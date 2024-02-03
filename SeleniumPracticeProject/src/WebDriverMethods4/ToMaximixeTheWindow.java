package WebDriverMethods4;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximixeTheWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		
	}

}
