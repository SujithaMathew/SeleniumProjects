package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class toolSqa extends BaseClass {
public static void main(String[] args) {
	launchBrowser();
	loadUrl("https://www.toolsqa.com/automation-practice-form/?firstname=&photo=&continents=AS&submit=");
	getWait();
	getTitle();
	getCurrentUrl();
	Locators s=new Locators();
	WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
	fill(s.getFirstname(),"Sujitha");
	
	fill(s.getLastName(),"Mathew");
	//WebElement btn = driver.findElement(By.xpath("//button[@id='buttonwithclass']"));
	btnClick(s.getrBtn());
	btnClick(s.getrBtn1());
	
	//WebElement chk = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	
	//js.executeScript("arguments.click()", chk);
	
	//WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
	fill(s.getDate(),"06/09/2019");
	//WebElement profess = driver.findElement(By.xpath("//input[@id='profession-1']"));
	btnClick(s.getChkBtn());
	//WebElement drop = driver.findElement(By.xpath("//select[@id='continents']"));
	dropDown(s.getDropClick(),2);
	//WebElement mulDrop = driver.findElement(By.xpath("//select[@id='continentsmultiple'] "));
	getAllDrop(s.getMulDrop());
	//WebElement mulDrop1 = driver.findElement(By.xpath("//select[@id='selenium_commands'] "));
	//getAllDrop(mulDrop1);
	//WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
	btnClick(s.getLastBtn());
	
}
}
