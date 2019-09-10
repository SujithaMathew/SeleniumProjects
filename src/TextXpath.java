import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextXpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement t = driver.findElement(By.xpath("//span[text()='Create an account']"));
	String text = t.getText();
	System.out.println(text);
	WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
	String att = btn.getAttribute("value");
	System.out.println(att);
	//JavaScript
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Object o = js.executeScript("return arguments[0].getAttribute('value')", btn);
	String s=(String)o;
	System.out.println(s);
	driver.quit();
	
	
}
}
