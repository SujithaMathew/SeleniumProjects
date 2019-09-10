package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mobile.twitter.com/login");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement e = driver.findElement(By.xpath("//input[@type='text']"));
	e.sendKeys("Sujitha");
	WebElement p = driver.findElement(By.xpath("//input[@type='password']"));
	p.sendKeys("1234");
	//driver.quit();
}
}