package WebDriverMethod;

import java.util.ArrayList;

import org.openqa.selenium.chrome.ChromeDriver;

public class IfTheURLContains_book_work_thatshouldbelaunchedLast {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
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
		
		String key="book";
		for(String element:ls) {
			if(element.contains(key)) {
				driver.get(element);
			}
		}
	}
}

