package Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	List<WebElement> radio = driver.findElements(By.xpath("//input{@type='radio']"));
	//int size = radio.size();
	//System.out.println(size);
	radio.get(0).click();
	//Same as checkbox
}
}
