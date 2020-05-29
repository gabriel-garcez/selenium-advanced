package javascript;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertText {
	
	@Test
	public void manage() throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver  = new ChromeDriver();	
		 
			 driver.manage().window().maximize();
			 
			 //Send User and Password to Alert
			 driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		 
			  // To Send Text
			  //Alert alert = driver.switchTo().alert();		
		      //alert.sendKeys("admin");
		      
	     
	}

}
