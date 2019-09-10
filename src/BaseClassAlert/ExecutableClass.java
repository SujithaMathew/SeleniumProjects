package BaseClassAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutableClass extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		loadUrl("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		//getWait();
		Locator l=new Locator();
	//driver.switchTo().frame("iframeResult");
	
		
		accept(l.getClkBtn1());
		
		
		
		
	}

}
