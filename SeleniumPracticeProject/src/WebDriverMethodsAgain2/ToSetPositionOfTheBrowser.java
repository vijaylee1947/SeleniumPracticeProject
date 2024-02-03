package WebDriverMethodsAgain2;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPositionOfTheBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().setPosition(new Point(70, 70));
	}

}
