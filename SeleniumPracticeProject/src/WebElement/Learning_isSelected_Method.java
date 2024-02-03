package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_isSelected_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		boolean isSelected=driver.findElement(By.id("gender-male")).isSelected();
		System.out.println(isSelected);
	}

}
