package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {
	
	@Test
	public void hover() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver  = new ChromeDriver();	
	   
	    driver.manage().window().maximize();
	    driver.get("http://demoqa.com/menu/");
	    
	  //Instantiate Action Class        
       Actions actions = new Actions(driver);
       
       
       //Get Menu Option
       WebElement menuOption = driver.findElement(By.xpath(".//a[contains(text(),'Main Item 2')]"));
     
       //Mouse hover to menu option
       actions.moveToElement(menuOption).perform();
     
       //Select 'Sub Sub List' from sub menu which has got displayed on mouse hover of 'Main Item 2'
        WebElement subMenuOption = driver.findElement(By.xpath(".//a[contains(text(),'SUB SUB LIST »')]")); 
       
       //Mouse hover menuOption 'SUB SUB LIST »'
       actions.moveToElement(subMenuOption).perform();
       
       //Select 'Sub Sub List' from sub menu which has got displayed on mouse hover of 'Main Item 2'
       WebElement item1 = driver.findElement(By.xpath(".//a[contains(text(),'Sub Sub Item 1')]")); 
       item1.click();
  

}
}
