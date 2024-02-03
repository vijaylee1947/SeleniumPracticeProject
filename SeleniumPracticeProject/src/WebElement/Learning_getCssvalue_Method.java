package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_getCssvalue_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		Thread.sleep(2000);
		String s=driver.findElement(By.xpath("//button[@id='ybar-search']")).getCssValue("font-family");
		System.out.println(s);
	}

}
