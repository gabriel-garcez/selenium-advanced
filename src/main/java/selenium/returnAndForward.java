package selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class returnAndForward {
	
	@Test
	public void navigate() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver  = new ChromeDriver();	
	   
	    driver.manage().window().maximize();
	    driver.get("http://google.com.br");
	    driver.get("http://amazon.com.br");
		
	    driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		
	}

}
