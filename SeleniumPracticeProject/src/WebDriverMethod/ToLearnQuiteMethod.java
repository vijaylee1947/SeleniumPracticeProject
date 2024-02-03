package WebDriverMethod;

import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnQuiteMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.linkedin.com/");
		driver.quit();
	}

}
