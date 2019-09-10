import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RayappanRaja\\Selenium-workspace\\Selenium\\driver\\chromedriver76.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement drag = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement drop = driver.findElement(By.xpath("//ol[@id='bank']"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		
		WebElement drag1 = driver.findElement(By.xpath("//li[@id='fourth']"));
		WebElement drop1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		Actions b=new Actions(driver);
		b.dragAndDrop(drag1, drop1).perform();
		
		WebElement drag2 = driver.findElement(By.xpath("//li[@id='credit0']"));
		WebElement drop2 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		Actions c=new Actions(driver);
		c.dragAndDrop(drag2, drop2);
		
		WebElement drag3 = driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement drop3 = driver.findElement(By.xpath("//ol[@id='loan']"));
		Actions d=new Actions(driver);
		d.dragAndDrop(drag3, drop3);
		
		
		
		
	}
	
	
	

}
