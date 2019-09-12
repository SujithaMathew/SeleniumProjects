package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example {
public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement d = driver.findElement(By.xpath("//select[@id='selenium_commands'] "));
		Select s=new Select(d);
		//To check Multipe dd or Single
		boolean a = s.isMultiple();
		System.out.println(a);
		//to find the size
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(size);
		//s.selectByIndex(0);
		//s.selectByVisibleText("Navigation Commands");
		//to get all options fromm dd using index
		for(int i=0;i<options.size();i++) {
			WebElement t = options.get(i);
			String text = t.getText();
			System.out.println(text);
		}
		//Using Text
		for (WebElement opt : options) {
			String text1 = opt.getText();
			s.selectByVisibleText(text1);
		}
		//to deselect all
		s.deselectByVisibleText("Navigation Commands");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text3 = firstSelectedOption.getText();
		System.out.println(text3);
		s.deselectAll();
		
}
}
