package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_getTagnameMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		Thread.sleep(2000);
		String Tname=driver.findElement(By.xpath("//input[@id='ybar-sbq']")).getTagName();
		System.out.println(Tname);
	}

}
