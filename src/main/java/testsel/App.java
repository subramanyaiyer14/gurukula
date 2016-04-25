package testsel;

/**
 * Hello world!
 *
 */
import java.util.Iterator;
import java.util.Set;

import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
	
protected WebDriver driver = null;
	
@org.testng.annotations.BeforeClass	
public void initialise() {
		
		try {
			driver = new FirefoxDriver();
			driver.get("http://127.0.0.1:8080/#/");
			driver.manage().window().maximize();
			loginlink();
			logincheck();
		}
		catch(Exception e) {

			System.out.println(e.getStackTrace());			
		}
	
		
		
	}
	
	public void loginlink() {
		
		driver.findElement(By.xpath("//div/div[1]/a[@href='#/login']")).click();
		
	}

	public void logincheck() {
		
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//form/button")).click();
		
	}
	
	public void logininvalidcheck(){
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin1");
		driver.findElement(By.xpath("//form/button")).click();
		
	}
	
	@AfterClass
	public void endprocess() {
		
		driver.close();
	}


}
