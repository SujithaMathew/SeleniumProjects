package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.adactin.com/HotelApp/");
			
	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement e = driver.findElement(By.name("username"));
	e.sendKeys("Chennai");
	WebElement p = driver.findElement(By.name("password"));
	p.sendKeys("Coimbatore");
	
	
}
}
