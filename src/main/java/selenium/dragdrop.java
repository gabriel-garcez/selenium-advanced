package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
	
	@Test
	public void dragdrop() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver  = new ChromeDriver();	
	   
	    driver.manage().window().maximize();
	    driver.get("http://demoqa.com/droppable/");		
		
		Actions builder = new Actions(driver);
		 
		 WebElement from = driver.findElement(By.id("draggable"));
		 
		 WebElement to = driver.findElement(By.id("droppable")); 
		 
		 //Perform drag and drop
		 builder.dragAndDrop(from, to).perform();
		
	}

}
