package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_isEnabled_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/168");
		Thread.sleep(5000);
		boolean b1=driver.findElement(By.id("Check")).isEnabled();
		System.out.println(b1);
		Thread.sleep(3000);
		driver.findElement(By.id("Check Delivery")).sendKeys("560078");
		Thread.sleep(2000);
		boolean b2=driver.findElement(By.id("Check")).isEnabled();
		System.out.println(b2);
	}
}
