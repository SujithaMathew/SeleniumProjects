package Day2;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//span[text()='Sign In']")).click();
   driver.findElement(By.xpath("//span[text()='Register'][1]")).click();
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("3456986532");
    driver.findElement(By.xpath("//button[@id='checkUser']")).click();
    driver.findElement(By.xpath("//input[@id='j_username_new']")).sendKeys("suji@gmail.com");
    driver.findElement(By.xpath("//input[@id='j_name']")).sendKeys("Suji");
    driver.findElement(By.xpath("//input[@id='j_password']")).sendKeys("1234567");
    driver.findElement(By.xpath("//button[@id='userSignup']")).click();
    
    
	}	
}

