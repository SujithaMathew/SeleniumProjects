package BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends BaseClass{

	public Locators() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastName;
	@FindBy(xpath="//input[@id='sex-1']")
    private WebElement rBtn;
	@FindBy(xpath="//input[@id='exp-3']")
	private WebElement rBtn1;
	@FindBy(xpath="//input[@id='datepicker']")
	private WebElement date;
	@FindBy(xpath="//input[@id='profession-1']")
	private WebElement chkBtn;
	@FindBy(xpath="//select[@id='continents']")
	private WebElement dropClick;
	@FindBy(xpath="//select[@id='continentsmultiple']")
	private WebElement mulDrop;
	@FindBy(xpath="//button[@id='submit']")
	private WebElement lastBtn;
	public WebElement getLastBtn() {
		return lastBtn;
	}

	public WebElement getChkBtn() {
		return chkBtn;
	}

	public WebElement getDropClick() {
		return dropClick;
	}

	public WebElement getMulDrop() {
		return mulDrop;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getrBtn() {
		return rBtn;
	}

	public WebElement getrBtn1() {
		return rBtn1;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getFirstname() {
		return firstname;
	}
	
}
