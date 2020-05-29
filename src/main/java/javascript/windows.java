package javascript;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {
	
	@Test
	public void handle() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver  = new ChromeDriver();	
	
	 //Get First Window Handle
	 driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	 String parentWindowHandle = driver.getWindowHandle();
	 System.out.println("Parent window's handle -> " + parentWindowHandle);
	
	 //Open a new Window
	 WebElement clickElement = driver.findElement(By.id("button1")); 
	 
	 
	 for(int i = 0; i < 3; i++)
	 {
	 clickElement.click();
	 Thread.sleep(3000);
	 }
	 
	 Set<String> allWindowHandles = driver.getWindowHandles();
	 
	 for(String handle : allWindowHandles)
	 {
	 System.out.println("Window handle - > " + handle);
	 }
	 
	 }
	 

}
