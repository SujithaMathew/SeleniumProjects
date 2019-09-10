package BaseClassAlert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locator extends BaseClass {

	
	public Locator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[contains(text(),'Try it')]")
			
	private WebElement clkBtn1;
	
	
	public WebElement getClkBtn1() {
		return clkBtn1;
	}
	
}
