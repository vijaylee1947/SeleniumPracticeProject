package WebDriverMethod;

import org.openqa.selenium.edge.EdgeDriver;

public class LearningMaximizingScreen {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
	}

}
