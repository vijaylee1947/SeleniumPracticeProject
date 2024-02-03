package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.milton.in/");
		String text=driver.findElement(By.xpath("//h1[contains(text(),'Milton India')]")).getText();
		System.out.println(text);
	}

}
