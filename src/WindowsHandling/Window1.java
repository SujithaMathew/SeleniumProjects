package WindowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Switch to particular window
public class Window1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp?");
	WebElement lgn = driver.findElement(By.id("fldLoginUserId"));
	lgn.sendKeys("Suji");
	WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
	pwd.sendKeys("Suji");
	WebElement btn = driver.findElement(By.xpath("//input[@value='SIGN IN']"));
	btn.click();
	String pWind = driver.getWindowHandle();
	System.out.println(pWind);
	Set<String> allWind = driver.getWindowHandles();
	System.out.println(allWind);
	int c=0;
	for (String cWind : allWind) {
		if(c==1) {
			driver.switchTo().window(cWind);
		}
		c++;
	}
	WebElement cl = driver.findElement(By.xpath("//input[@value='Close']"));
	cl.click();
	//Switch to parent window
	driver.switchTo().defaultContent();
	//driver.quit();
	
}
}
