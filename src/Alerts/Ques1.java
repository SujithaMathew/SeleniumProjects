package Alerts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	List<WebElement> f = driver.findElements(By.tagName("iframe"));
	int count=f.size();
	for(int i=0;i<=count;i++) {
	driver.switchTo().frame(i);
	driver.findElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; pushAlert()']")).click();
	
	}
	Alert a = driver.switchTo().alert();
	a.accept();
}
}
