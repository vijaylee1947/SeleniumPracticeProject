package LocatorsAgain4;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfTheProductCostIsLessThan10000_removeThatProductAndPriceDetails {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		ArrayList<String> name1 = new ArrayList<>();
		ArrayList price = new ArrayList();
		driver.findElement(By.name("q")).sendKeys("redmi 13c" + Keys.ENTER);
		String ele = driver.findElement(By.xpath("//div[text()='REDMI 13c (Starshine Green, 128 GB)']")).getText();
		String p1 = driver.findElement(By.xpath("(//div[text()='₹13,468'])[1]")).getText();
		name1.add(ele);
		price.add(p1);
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
		driver.findElement(By.name("q")).sendKeys("iphone14" + Keys.ENTER);
		String ele1 = driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Midnight, 128 GB)']")).getText();
		String p2 = driver.findElement(By.xpath("(//div[text()='₹58,999'])[1]")).getText();
		name1.add(ele1);
		price.add(p2);
		System.out.println(name1);
		System.out.println(price);
		
		if((price.indexOf(p1))<=15000) {
			if((price.indexOf(p2))<=15000) {
				price.removeIf()
			}
			
		}
	}
}
