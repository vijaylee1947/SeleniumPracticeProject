package LocatorsAgain2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementUsing_LinkedText_Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
		driver.findElement(By.linkText("Marketing")).click();
	}

}
