package WebElementMethodsAgain4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_MenWomenBridalLuxe_InKalkiFashion_PrintIt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.kalkifashion.com/");
		driver.findElement(By.xpath("//button[@id='okButton']")).click();
		Thread.sleep(2000);
		List<WebElement> text=driver.findElements(By.xpath("//div[@id='tabs']"));
		
		for(WebElement ele:text) {
			String alltabs=ele.getText();
			System.out.println(alltabs);
		}
	}

}
