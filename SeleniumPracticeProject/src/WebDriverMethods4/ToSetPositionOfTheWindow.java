package WebDriverMethods4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPositionOfTheWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		driver.manage().window().setPosition(new Point(80, 100));
	}

}
