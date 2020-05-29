package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class copyAndPaste {
	
	@Test
	public void copyPaste() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver  = new ChromeDriver();	
	   
	    driver.manage().window().maximize();
	    driver.get("http://demoqa.com/text-box");
	    
	    Actions actions = new Actions(driver);
	    
	    //Find Elements
	    WebElement currAddr = driver.findElement(By.id("currentAddress"));
	    WebElement perAddr = driver.findElement(By.id("permanentAddress")); 
	    
	    //Send text 
	    currAddr.sendKeys("1205 GABRIEL GARCEZ STREET,OLD FORGE,NEW YORK,11240");
	    
	    //Copy Text with CTRL+C	    
	    //currAddr.click();
	    actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform(); 
	    actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	    
	    //Paste Text with CTRL+V
	    perAddr.click();
	    actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	    	
		
	}

}
