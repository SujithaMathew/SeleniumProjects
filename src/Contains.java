import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/testimonial.html");
	//Contains xpath text
	WebElement c = driver.findElement(By.xpath("//strong[contains(text(),'Sekhar')]"));
	String s = c.getText();
	System.out.println(s);
	
	
	
	
}
}
