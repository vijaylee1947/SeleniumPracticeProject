package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSearchAndPlaySongIn_YouTube {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("videosongs play online");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@title='Naiyo Lagda Song'])[1]")).click();
		Thread.sleep(3000);
	}
}
