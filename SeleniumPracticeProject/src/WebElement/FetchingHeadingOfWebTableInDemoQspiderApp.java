package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingHeadingOfWebTableInDemoQspiderApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		
		List<WebElement> s=driver.findElements(By.xpath("//thead[@class='text-xs text-gray-700 uppercase bg-orange-200']/tr/th"));
				
		for(WebElement t:s) {
			String text=t.getText();
			System.out.println(text);
			}
	}
}
