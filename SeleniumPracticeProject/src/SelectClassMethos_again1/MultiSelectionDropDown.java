package SelectClassMethos_again1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement w=driver.findElement(By.xpath("//select[@id='cars']"));
		
		Select s=new Select(w);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("199");
		Thread.sleep(2000);
		s.selectByVisibleText("INR 200 - INR 299 ( 3 )");
		Thread.sleep(2000);
		WebElement first=s.getFirstSelectedOption();
		System.out.println(first.getText());
		System.out.println("------------------------------");
		List<WebElement> all=s.getAllSelectedOptions();
		for(WebElement ele:all) {
			System.out.println(ele.getText());
		}
		s.deselectByIndex(1);
		Thread.sleep(2000);
		s.deselectByValue("199");
		Thread.sleep(2000);
		s.deselectByVisibleText("INR 200 - INR 299 ( 3 )");
		System.out.println("------------------------------");
		List<WebElement> allopt=s.getOptions(); 
		for(WebElement ele1:allopt) {
			System.out.println(ele1.getText());
		}
				
	}
}
