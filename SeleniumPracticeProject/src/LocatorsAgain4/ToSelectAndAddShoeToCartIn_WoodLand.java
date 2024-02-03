package LocatorsAgain4;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToSelectAndAddShoeToCartIn_WoodLand {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.get("https://www.woodlandworldwide.com/");

		driver.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Shop Now']")));
		driver.findElement(By.xpath("//h3[text()='Boots']/following-sibling::button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Filter by']")));
		
		driver.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Woodland Camel Trekking Shoes']/..")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.='42']")));

		driver.findElement(By.xpath("//button[.='42']")).click();
		driver.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='ADD TO CART']")));
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	}
}
