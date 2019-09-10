package BaseClassAlert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClass {
	static WebDriver driver;
	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	     driver=new ChromeDriver();
	     return driver;
	      	
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	public static void getWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public static void accept(WebElement e) throws InterruptedException{
		
		driver.switchTo().frame("iframeResult");
		e.click();
Alert a= driver.switchTo().alert();
	Thread.sleep(3000);
	  a.accept();
	}
	
}
