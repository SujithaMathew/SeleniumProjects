package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
			
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement e = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
	e.click();
	WebElement p = driver.findElement(By.id("InputName"));
	p.sendKeys("Sujitha");
	WebElement k = driver.findElement(By.id("InputEmail1"));
	k.sendKeys("sujijosephine@gmail.com");
	WebElement l = driver.findElement(By.id("InputSubject"));
	l.sendKeys("36789654");
	WebElement m = driver.findElement(By.xpath("//select[@name='courses'][1]"));
	m.click();
	
	
	
	
	
	
}
}
