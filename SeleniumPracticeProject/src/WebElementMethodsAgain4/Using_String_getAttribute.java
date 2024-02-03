package WebElementMethodsAgain4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_String_getAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.woodlandworldwide.com/");
		driver.findElement(By.xpath("//input[@id='standard-bare']")).sendKeys("shirts");
		WebElement at=driver.findElement(By.xpath("//input[@id='standard-bare']"));
		System.out.println(at.getAttribute("value"));
	}

}
