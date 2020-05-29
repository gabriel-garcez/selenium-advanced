package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard {
	
	@Test
	public void fill() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver  = new ChromeDriver();	
	   
	    driver.manage().window().maximize();
	    driver.get("http://google.com");
	    
	    WebElement searchField = driver.findElement(By.name("q"));
	    
	    //Instantiate Actions class
	      Actions actions = new Actions(driver);
	      actions.sendKeys(searchField,"gabrielgarcez").perform();
	      
	      
		
	}

}
