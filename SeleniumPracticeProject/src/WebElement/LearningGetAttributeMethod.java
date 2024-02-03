package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetAttributeMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com/in/");
		Thread.sleep(3000);
		driver.findElement(By.className("head-search-1234")).click();
		
		String text=driver.findElement(By.id("search-input")).getAttribute("placeholder");
		System.out.println(text);
	}
}

