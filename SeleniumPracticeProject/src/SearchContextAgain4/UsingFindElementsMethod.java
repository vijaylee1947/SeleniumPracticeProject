package SearchContextAgain4;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElementsMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.kalkifashion.com/in/");
		List<WebElement> tabs=driver.findElements(By.xpath("//div[@id='tabs']"));
		for(WebElement ele:tabs) {
			System.out.println(ele.getText());
		}
	}

}
