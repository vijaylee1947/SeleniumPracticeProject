package WebDriverMethods4;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


public class IfTheURLcontainsBook_word_itShouldLaunchAtLast {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ArrayList<String> ls=new ArrayList<>();
		driver.get("https://www.facebook.com/");
		ls.add(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.get("https://www.youtube.com/");
		ls.add(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/");
		ls.add(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		String keyelement="book";
		for(String ele:ls) {
			if(ele.contains(keyelement)) {
				driver.get(ele);
			}
		}
		
	}

}
