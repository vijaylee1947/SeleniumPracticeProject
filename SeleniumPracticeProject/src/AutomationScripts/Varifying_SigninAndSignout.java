package AutomationScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Varifying_SigninAndSignout {
	public static void main(String[] args) {
		//Initializing UN and PSWD
		String username="chanikyachandragupta7@gmail.com";
		String password="ramrom1234";
		
		//Triggering Browser driver from Current Folder
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//Launching a Browser
		WebDriver driver=new ChromeDriver();
		System.out.println("Launching a Browser");
		
		//Maximizing the window
		driver.manage().window().maximize();
		System.out.println("Maximizing the Window");
	
		//Using implicit wait to avoid delay 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Implicite wait is done");
		
		//Launching the Application
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("Application launched");
		
		//Clicking on login button
		driver.findElement(By.linkText("Log in")).click();
		System.out.println("clicked on Login link");
		
		//Getting current url to check login page displayed or not
		String url=driver.getCurrentUrl();
		if(url.contains("login")) {
			System.out.println("Login Page is displayed");
		}else {
			System.out.println("Successfully login page not displayed");
		}
		
		//entering User name
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		System.out.println("Email=id Entered");
		
		//entering password
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		System.out.println("Password entered");
		
		//selecting remember password checkbox
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		System.out.println("Select Remember me check box");
		
		//clicking on login button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("Login button clicked");
		
		//verifying home page displayed or not
		String un=driver.findElement(By.linkText("chanikyachandragupta7@gmail.com")).getText();
		if(un.contains(username)) {
			System.out.println("Logged-in Sucesssfully");
		}else {
			System.out.println("Sucessfully Login failled");
		}
		
		//clicking logout link
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		System.out.println("sucessfully Loggedout");
		
		//closing browser window
		driver.close();
		System.out.println("Sucessfully Browser Closed");
			
		
		
	}

}
