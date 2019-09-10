package Frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/guru99home/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	List<WebElement> f = driver.findElements(By.tagName("iframe"));
	System.out.println(f.size());
	
	driver.switchTo().frame("a077aa5e");
	driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
	//switch to webpage
	driver.switchTo().defaultContent();
}
}
