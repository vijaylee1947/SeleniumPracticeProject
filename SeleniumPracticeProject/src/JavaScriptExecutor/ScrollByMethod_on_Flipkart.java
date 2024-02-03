package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByMethod_on_Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/furniture-india-ka-furniture-livingroom-store?fm=neo%2Fmerchandising&iid=M_9cb9b87c-539b-4b52-9a33-abb5772030ea_1_372UD5BXDFYS_MC.4MQHUMDYWFBZ&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Home%2B%2526%2BFurniture~Living%2BRoom%2BFurniture_4MQHUMDYWFBZ&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L1_view-all&cid=4MQHUMDYWFBZ");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='Kitchen Trolley']")).click();
				break;
			}catch(NoSuchElementException e) {
				jse.executeScript("window.scrollby(0,300);");
			}
		}
		
	}

}
