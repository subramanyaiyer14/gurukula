package testsel;


import junit.framework.Assert;
import static org.junit.Assert.*;

import org.aspectj.lang.annotation.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {

	private WebDriver driver;
	
static App newapp = new App();

	@Before
	public void setUp() {
		// Create a new instance of the firefox driver
        
        newapp.initialise();
	}
	
	@Test
	public void testinvalidlogin() {
		
		
		newapp.loginlink();
		newapp.logininvalidcheck();
		WebElement loginmessage = driver.findElement(By.xpath("//div/div/div[1]/strong"));
		
		String message = loginmessage.getText();
	
		Assert.assertEquals("Authentication failed!", message);
		
				
	}

	@Test
	public void testSuccessfulLogin() {   
		
		
		newapp.loginlink();
		newapp.logincheck();
		
		WebElement loginmessage = driver.findElement(By.xpath("//div/div[2]/div/div"));
		
		String message = loginmessage.getText();
	
		Assert.assertEquals("You are logged in as user \"admin\"", message);
		                
	}
	
@org.junit.AfterClass
public static void complete(){
	
	newapp.endprocess();
	
}
	
}
