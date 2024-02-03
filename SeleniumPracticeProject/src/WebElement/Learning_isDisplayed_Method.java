package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_isDisplayed_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		boolean isDisplayed = driver.findElement(By.xpath("//a[@class='ico-register']")).isDisplayed();
		System.out.println(isDisplayed);
	}

}
