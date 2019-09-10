
package Javasript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.xpath("//a[text()='Login & Signup']"));
		WebElement name = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		WebElement pass = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		WebElement btn = driver.findElement(By.xpath("//span[text()='Login']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", login);
		
		js.executeScript("arguments[0].setAttribute('value','suji')",name);
		
		//get the value
		Object o = js.executeScript("return arguments[0].getAttribute('value')", name);
		String s=(String)o;
		System.out.println(s);
		
		js.executeScript("arguments[0].setAttribute('value','1234')",pass);
		
		js.executeScript("arguments[0].click()", btn);
		
	}
}
