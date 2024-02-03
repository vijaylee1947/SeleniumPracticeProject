package Pop_Ups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningDynamic_Xpath_For_Calender {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		LocalDateTime dateAndtime=LocalDateTime.now();
		String month=dateAndtime.getMonth().toString();
		month=month.charAt(0)+month.substring(1,month.length()).toLowerCase();
		int date=dateAndtime.getDayOfMonth();
		int year=dateAndtime.getYear();
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'"+month+"')]/../..//p[text()='"+date+"']")).click();
	}

}
