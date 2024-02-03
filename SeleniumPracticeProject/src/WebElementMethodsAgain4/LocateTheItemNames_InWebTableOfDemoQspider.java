package WebElementMethodsAgain4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateTheItemNames_InWebTableOfDemoQspider {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/table");
		List<WebElement> items=driver.findElements(By.xpath("//tr[@class='bg-white border-b  hover:bg-orange-100']/th"));
		for(WebElement ele:items) {
			String text=ele.getText();
			System.out.println(text);
		}
	}

}
