package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement down = driver.findElement(By.xpath("//a[text()='Katalon']"));
	js.executeScript("arguments[0].scrollIntoView(true)", down);
	
	Thread.sleep(5000);
	WebElement up = driver.findElement(By.xpath("//span[text()='Selenium Training Benefit']"));
	js.executeScript("arguments[0].scrollIntoView(false)", up);
	
}
}
