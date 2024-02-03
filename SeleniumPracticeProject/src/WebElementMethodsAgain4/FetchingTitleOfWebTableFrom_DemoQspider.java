package WebElementMethodsAgain4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingTitleOfWebTableFrom_DemoQspider {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		List<WebElement> title=driver.findElements(By.xpath("//thead[@class='text-xs text-gray-700 uppercase bg-orange-200']"));
		for(WebElement ele:title) {
			String headings=ele.getText();
			System.out.println(headings);
		}
	}

}
