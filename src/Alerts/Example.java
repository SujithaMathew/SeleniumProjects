package Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.findElement(By.xpath("//div[@class='continue_btn']//a[@class='login_button'][contains(text(),'CONTINUE')] ")).click();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//driver.switchTo().frame("frmnew");
	driver.findElement(By.xpath("//input[@id='Button2']")).click();
	Thread.sleep(5000);
	Alert a = driver.switchTo().alert();
	
	a.accept();
	
}
}
