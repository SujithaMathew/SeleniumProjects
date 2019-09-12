package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	List<WebElement> tRow = driver.findElements(By.tagName("tr"));
	for(int i=0;i<tRow.size();i++) {
		WebElement row = tRow.get(i);
		List<WebElement> tData = driver.findElements(By.tagName("td"));
		for(int j=0;j<tData.size();j++) {
			WebElement data = tData.get(j);
			
			String text = data.getText();
		if(text.equals("Dubai")) {
				System.out.println(text);
				System.out.println("Row number : "+i);
				System.out.println("Cell number : "+j);
						
			}
			
			
			
		}
	}
	/*WebElement data = driver.findElement(By.xpath("//td[contains(text(),'Dubai')]"));
	String text = data.getText();
	System.out.println(text);*/
}
}
