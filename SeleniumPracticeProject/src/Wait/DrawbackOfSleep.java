package Wait;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrawbackOfSleep {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(10000);
		driver.findElement(By.id("loginBtn")).click();
	}

}
