package LaunchingEmptyBrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEmptyEdgeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver edge=new EdgeDriver();
	}
}
