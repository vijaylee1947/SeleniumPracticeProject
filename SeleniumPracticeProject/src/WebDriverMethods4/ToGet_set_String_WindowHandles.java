package WebDriverMethods4;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGet_set_String_WindowHandles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/User/Downloads/TestPage.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandles());
		
	}

}
