package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateTheItemNamesInWebTableUsingXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		List<WebElement> items=driver.findElements(By.xpath("//tr[@class='bg-white border-b  hover:bg-orange-100']"));
		
		for(WebElement element:items) {
			String r=element.getText();
			System.out.println(r);
		}
	}
}
