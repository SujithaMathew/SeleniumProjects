package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnhancedForLoop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	List<WebElement> tRow = driver.findElements(By.tagName("tr"));
	for (WebElement x : tRow) {
		List<WebElement> tData = driver.findElements(By.tagName("td"));
		for (WebElement y : tData) {
		String text = y.getText();
		System.out.println(text);
			
		}
		
	}
	
}
}
