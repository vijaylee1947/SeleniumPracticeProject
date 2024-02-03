package SelectClass_Or_DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMuliSelectionDropDownAndSingleSelectionDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		WebElement multibox=driver.findElement(By.id("multiselect1"));
		
		Select select=new Select(multibox);
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByValue("audix");
		Thread.sleep(2000);
		select.deselectByIndex(0);
		Thread.sleep(2000);
		select.deselectByValue("audix");
		Thread.sleep(2000);
		System.out.println("MultiBox Values:");
		List<WebElement> multi=driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
		for(WebElement ele:multi) {
			System.out.println(ele.getText());
		}
		
		driver.findElement(By.id("drop1")).click();
		WebElement Singlesec=driver.findElement(By.xpath("//select[@id='drop1']"));
		
		Select select1=new Select(Singlesec);
		select1.selectByIndex(1);
		Thread.sleep(2000);
		select1.selectByValue("ghi");
		Thread.sleep(2000);
		select1.selectByValue("jkl");
		Thread.sleep(2000);
		select1.selectByVisibleText("doc 4");
		Thread.sleep(2000);
		System.out.println("------------------------------");
		System.out.println("SingleSelection Drodown Values:");
		List<WebElement> single=driver.findElements(By.xpath("//select[@id='drop1']/option"));
		for(WebElement ele1:single) {
			System.out.println(ele1.getText());
		}
	}

}
