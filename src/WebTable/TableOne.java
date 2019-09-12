package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		/*List<WebElement> tableNo = driver.findElements(By.tagName("table"));
		int size = tableNo.size();
		System.out.println(size);*/
		List<WebElement> tRow = driver.findElements(By.tagName("tr"));
				
		//int rSize = tRow.size();
		//System.out.println(rSize);
		for(int i=0;i<tRow.size();i++) {
			WebElement row = tRow.get(i);
			List<WebElement> tData = driver.findElements(By.tagName("td"));
			for(int j=0;j<tData.size();j++) {
				WebElement data = tData.get(j);
				String text = data.getText();
				System.out.println(text);
				
				
			}
		}
	}
	
}
