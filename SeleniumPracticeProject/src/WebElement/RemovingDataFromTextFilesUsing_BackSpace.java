package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemovingDataFromTextFilesUsing_BackSpace {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sumanthchinivar");
		Thread.sleep(3000);
		String data=driver.findElement(By.xpath("//input[@id='Email']")).getAttribute("value");
		//generic way
		//for(int i=0;i<data.length();i++) {
		//driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Keys.BACK_SPACE);
		
	//infinet for loop to remove any data
		for(;;) 
		{
			if(!driver.findElement(By.xpath("//input[@id='Email']")).equals(" ")) {
				driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Keys.BACK_SPACE);
			}else {
				break;
			}
		}
	}
}
	
	




