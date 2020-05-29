package javascript;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollBar {
	
	@Test
	public void scroll() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver  = new ChromeDriver();	
	 
		 driver.get("http://automationpractice.com/index.php");
		 driver.manage().window().maximize();
		 
		 //Create JavaScript Executor
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		
		 //Scroll to element
	     WebElement myWebElement = driver.findElement(By.id("facebook_block"));	     
	     js.executeScript("arguments[0].scrollIntoView();", myWebElement);

	     //Scroll with measures
	     //js.executeScript("window.scrollBy(0,1000)"); //Vertically
	     //js.executeScript("window.scrollBy(1000,0)");//Horizontally
	  
	     
	}

}
