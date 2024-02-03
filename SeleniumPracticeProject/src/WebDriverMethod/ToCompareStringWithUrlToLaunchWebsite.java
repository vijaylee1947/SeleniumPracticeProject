package WebDriverMethod;



import java.util.ArrayList;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCompareStringWithUrlToLaunchWebsite {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
//		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
//		EdgeDriver driver1=new EdgeDriver();
		ChromeDriver driver=new ChromeDriver();
//		FirefoxDriver driver2=new FirefoxDriver();
		
		ArrayList<String> ls=new ArrayList<>();
		driver.get("https://www.testyantra.com/");
		ls.add(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.get("https://www.google.com/");
		ls.add(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.get("https://www.linkedin.com/");
		ls.add(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		String keyelement="google";
		for(String element:ls) {
			if(element.contains(keyelement)) {
				driver.get(element);
			}
		}
		}
		
		
	}


