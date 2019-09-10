import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Example {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement a= driver.findElement(By.xpath("(//input[@class='inputtext'])[1]"));
	js.executeScript("arguments[0].setAttribute('value','suji@gmail.com')", a);
	//a.sendKeys("sujijosephine@gmail.com");
	WebElement b = driver.findElement(By.xpath("(//input[@class='inputtext'])[2]"));
	b.sendKeys("oct282011");
	
	WebElement c = driver.findElement(By.id("loginbutton"));
	//c.click();
	js.executeScript("arguments[0].click()", c);
	
	
			
	
}
}
