package WebElementMethodsAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Rectangle_getRect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Rectangle r=driver.findElement(By.xpath("//a[text()='Gmail']")).getRect();
		System.out.println(r.getX());
		System.out.println(r.getY());
		System.out.println(r.getWidth());
		System.out.println(r.getHeight());
	}

}
