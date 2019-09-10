package BaseClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
	static JavascriptExecutor js;
	
public static WebDriver launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
     driver=new ChromeDriver();
     return driver;
     
     
	
}
public static void loadUrl(String url) {
	driver.get(url);
}
public static void fill(WebElement e,String value) {
	e.sendKeys(value);
}
public static void btnClick(WebElement e) {
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",e);
			
	
	
}
public static void dropDown(WebElement e,int index) {
Select s=new Select(e);
s.selectByIndex(index);

}
public static void getTitle() {
	String title = driver.getTitle();
	System.out.println(title);
}
public static void getCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
}
public static void getWait() {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}
public static void getAllDrop(WebElement e) {
	Select s=new Select(e);
	System.out.println(e);
	List<WebElement> options = s.getOptions();
	for(WebElement opt:options) {
		String t=opt.getText();
		if((t.equals("Asia"))||(t.equals("Europe"))||(t.equals("Africa"))) {
			s.selectByVisibleText(t);
		}
	}
}
}
