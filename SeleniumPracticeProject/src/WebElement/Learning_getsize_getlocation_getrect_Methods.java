package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_getsize_getlocation_getrect_Methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		System.out.println("Size of the WebElement");
		Dimension d=driver.findElement(By.id("ybar-sbq")).getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
		
		System.out.println("Location of the web elemnt");
		Point p=driver.findElement(By.id("ybar-sbq")).getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		System.out.println("Getting heigth,width,X,Y of web element");
		Rectangle r=driver.findElement(By.id("ybar-sbq")).getRect();
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		System.out.println(r.getX());
		System.out.println(r.getY());
	}

}
