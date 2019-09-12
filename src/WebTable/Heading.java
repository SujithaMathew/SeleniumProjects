package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heading {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	List<WebElement> tHead = driver.findElements(By.tagName("th"));
	//int headSize = tHead.size();
	//System.out.println(headSize);
	for(int i=0;i<tHead.size();i++) {
		WebElement data = tHead.get(i);
		String text = data.getText();
		System.out.println(text);
	}
}
}
