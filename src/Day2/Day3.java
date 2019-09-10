package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	driver.findElement(By.xpath("//button[text()='×']")).click();
	driver.findElement(By.xpath("/ul[@class='config-list']//li[text()='Sign In/Sign Up']")).click();
	
	
}
}
