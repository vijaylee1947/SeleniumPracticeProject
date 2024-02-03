package WebDriverMethods4;



import org.openqa.selenium.chrome.ChromeDriver;

public class ToMakeWindowAsFullScreen {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().fullscreen();
		
	}

}
