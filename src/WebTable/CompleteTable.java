package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	  List<WebElement> tRow = driver.findElements(By.tagName("tr"));
	  for(int i=0;i<tRow.size();i++) {
		  WebElement row = tRow.get(i);
		  String text = row.getText();
		  System.out.println(text);
		  
	  }
	
}
}
