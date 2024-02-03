package PracticeLocatorsAgain;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementsUsingLinkedText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Offers")).click();
	}

}
