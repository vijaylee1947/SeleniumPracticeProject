package WebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitleOfMyntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}
