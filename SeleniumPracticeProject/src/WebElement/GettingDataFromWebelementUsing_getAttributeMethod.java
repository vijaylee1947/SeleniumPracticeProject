package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingDataFromWebelementUsing_getAttributeMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodlandworldwide.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("standard-bare")).sendKeys("sneakers");
		Thread.sleep(2000);
		String s=driver.findElement(By.id("standard-bare")).getAttribute("value");
		System.out.println(s);
	}

}
