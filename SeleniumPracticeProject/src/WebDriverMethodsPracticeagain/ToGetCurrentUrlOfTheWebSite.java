package WebDriverMethodsPracticeagain;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentUrlOfTheWebSite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://whc.unesco.org/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
}
