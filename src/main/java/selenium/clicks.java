package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clicks {
	
	@Test
	public void click() throws AWTException {
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver  = new ChromeDriver();	
   
    driver.manage().window().maximize();
    driver.get("http://google.com.br");
    driver.get("http://amazon.com.br");
 
    //Instantiate Action Class
    Actions actions = new Actions(driver);
 
    //Retrieve WebElement to perform right click
    WebElement btnElement = driver.findElement(By.id("nav-global-location-slot"));
 
    //Right Click and Return
    actions.contextClick(btnElement).perform();
    
    //Select option 
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_DOWN);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);

   }

}
