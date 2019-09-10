import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	WebElement mouse = driver.findElement(By.xpath("//a[@class='activeLink']"));
	Actions a =new Actions(driver);
	a.moveToElement(mouse).perform();
	
	
}
}
