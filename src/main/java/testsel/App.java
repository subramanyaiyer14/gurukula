package testsel;

/**
 * Hello world!
 *
 */
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
	
public WebDriver driver = null;
	
	public void initialise() {
		
		driver = new FirefoxDriver();
		driver.get("http://127.0.0.1:8080/#/");
		driver.manage().window().maximize();
		
		
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
	
	public void entityclick() {
		
		driver.findElement(By.xpath("//ul/li[2]/a/span/span[2]")).click();
		driver.findElement(By.className("dropdown-toggle")).click();

		
		
	}
	
		public void branchcreate() {
		
			driver.findElement(By.xpath("//ul/li[2]/a/span/span[2]")).click();
			driver.findElement(By.className("dropdown-toggle")).click();
			driver.findElement(By.xpath("//ul/li[2]/ul/li[1]/a/span[2]")).click();
			driver.findElement(By.className("ng-scope")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div[1]/div/div[1]/div/div[1]/button")));
		
		driver.findElement(By.xpath("//div[3]/div[1]/div/div[1]/div/div[1]/button")).click();
		
		
		//switch to subwindow
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()){
				    subWindowHandler = iterator.next();
			}
				driver.switchTo().window(subWindowHandler); // switch to popup window
				                                            // perform operations on popup
				driver.findElement(By.name("name")).sendKeys("subramanya");
				driver.findElement(By.name("code")).sendKeys("111");
				driver.findElement(By.xpath("//form/div[3]/button[2]")).click();
				driver.switchTo().window(parentWindowHandler);
				
			}
		
	public void branchsearch() throws InterruptedException {
		
		driver.findElement(By.id("searchQuery")).sendKeys("subramanya");
		driver.findElement(By.xpath("//div/div[2]/form/button")).click();
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[3]/div[1]/div/button")).click();
	}
	

	public void branchedit() {
		
		driver.findElement(By.id("searchQuery")).sendKeys("subramanya");
		driver.findElement(By.xpath("//div/div[2]/form/button")).click();
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/button[2]")).click();
		
		//switch to subwindow
				String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
				String subWindowHandler = null;

				Set<String> handles = driver.getWindowHandles(); // get all window handles
				Iterator<String> iterator = handles.iterator();
					while (iterator.hasNext()){
						    subWindowHandler = iterator.next();
					}
						driver.switchTo().window(subWindowHandler); // switch to popup window
						                                            // perform operations on popup
						//driver.findElement(By.name("name")).sendKeys("subramanya");
						driver.findElement(By.name("code")).clear();
						driver.findElement(By.name("code")).sendKeys("1234");
						driver.findElement(By.xpath("//form/div[3]/button[2]")).click();
						driver.switchTo().window(parentWindowHandler);
						
		driver.findElement(By.id("searchQuery")).clear();
		
		
	}
	
	
	public void branchdelete() {
		
		driver.findElement(By.id("searchQuery")).sendKeys("subramanya");
		driver.findElement(By.xpath("//div/div[2]/form/button")).click();
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/button[3]")).click();
		
		//switch to subwindow
				String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
				String subWindowHandler = null;

				Set<String> handles = driver.getWindowHandles(); // get all window handles
				Iterator<String> iterator = handles.iterator();
					while (iterator.hasNext()){
						    subWindowHandler = iterator.next();
					}
						driver.switchTo().window(subWindowHandler);// switch to popup window
						                                            // perform operations on popup
						
						//WebDriverWait wait = new WebDriverWait(driver, 10);
						//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[2]")));
						//driver.findElement(By.xpath("//button[2]")).click();
						driver.findElement(By.className("ng-scope")).click();
						driver.switchTo().window(parentWindowHandler);
		
	}
	
	public void staffcheck() {
		
		driver.findElement(By.xpath("//ul/li[2]/ul/li[2]/a/span[2]")).click();
		driver.findElement(By.className("ng-scope")).click();
	
	}
	
	public void staffcreate() {
		
				driver.findElement(By.xpath("//div[1]/div/div[1]/button")).click();
				
				//switch to subwindow
				String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
				String subWindowHandler = null;

				Set<String> handles = driver.getWindowHandles(); // get all window handles
				Iterator<String> iterator = handles.iterator();
					while (iterator.hasNext()){
							subWindowHandler = iterator.next();
					}
				driver.switchTo().window(subWindowHandler); // switch to popup window
				                                            // perform operations on popup
				driver.findElement(By.name("name")).sendKeys("subramanya");
				
				
			//	WebElement branch = driver.findElement(By.name("related_branch"));
				Select dropdown = new Select(driver.findElement(By.name("related_branch")));
				
				dropdown.selectByVisibleText("electrical");
				//dropdown.selectByValue("electronics");
				
				driver.findElement(By.xpath("//form/div[3]/button[2]")).click();
					
				driver.switchTo().window(parentWindowHandler);  // switch back to parent window
	}
	
	public void staffsearch() {
		
		driver.findElement(By.id("searchQuery")).sendKeys("subramanya");
		driver.findElement(By.xpath("//div/div[2]/form/button")).click();
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/button[1]")).click();
		driver.findElement(By.xpath("//div[3]/div[1]/div/button")).click();
		
	}
	
	
	public void staffedit() {
		
		driver.findElement(By.id("searchQuery")).sendKeys("subramanya");
		driver.findElement(By.xpath("//div/div[2]/form/button")).click();
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/button[2]")).click();

	
	}
	
	
	public void staffdelete() {
		
	}
	
	public void endprocess() {
		
		driver.close();
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	/*	WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1:8080/#/");
		driver.manage().window().maximize();
		// WebElement loginlink =
		// driver.findElement(By.cssSelector("a[href='#/login']"));
		WebElement loginlink = driver.findElement(By
				.xpath("//div/div[1]/a[@href='#/login']"));

		loginlink.click();
		WebElement loginname = driver.findElement(By.id("username"));
		loginname.sendKeys("admin");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("admin");

		WebElement buttonclick = driver.findElement(By.xpath("//form/button"));
		buttonclick.click();

		WebElement entitycheck = driver.findElement(By
				.xpath("//ul/li[2]/a/span/span[2]"));
		entitycheck.click();
		WebElement entityclick = driver.findElement(By
				.className("dropdown-toggle"));
		entityclick.click();
		// *[@id='navbar-collapse']/ul/li[2]/a/span/span[2][text()='Entities']
		// *[@id='navbar-collapse']/ul/li[2]/a/span
		// *[@id='navbar-collapse']/ul/li[2]/a/span/span[2]
		// id('navbar-collapse')/ul/li[2]/a
		// id('navbar-collapse')/ul/li[2]/a/span/span[2]
		// id('navbar-collapse')/ul/li[2]/a[@className='dropdown-toggle']
		// ul/li[2]/a/span/span[2]

		WebElement branchcheck = driver.findElement(By
				.xpath("//ul/li[2]/ul/li[1]/a/span[2]"));
		branchcheck.click();
		WebElement branchclick = driver.findElement(By.className("ng-scope"));
		branchclick.click();

		WebElement branchcreate = driver.findElement(By
				.xpath("//div[3]/div[1]/div/div[1]/div/div[1]/button"));
		branchcreate.click();

		// switch to subwindow
		String parentWindowHandler = driver.getWindowHandle(); // Store your
																// parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window
															// handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()) {
			subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
													// perform operations on
													// popup
		WebElement branchname = driver.findElement(By.name("name"));
		branchname.sendKeys("subbu");

		WebElement branchcode = driver.findElement(By.name("code"));
		branchcode.sendKeys("111");

		WebElement savebranch = driver.findElement(By
				.xpath("//form/div[3]/button[2]"));
		savebranch.click();

		driver.switchTo().window(parentWindowHandler); // switch back to parent
														// window

		WebElement branchsearch = driver.findElement(By.id("searchQuery"));
		branchsearch.sendKeys("subbu");

		WebElement branchsearchcheck = driver.findElement(By
				.xpath("//div/div[2]/form/button"));
		branchsearchcheck.click();

		WebElement branchview = driver.findElement(By
				.xpath("//table/tbody/tr[1]/td[4]/button[1]"));
		branchview.click();

		WebElement branchreturn = driver.findElement(By
				.xpath("//div[3]/div[1]/div/button"));
		branchreturn.click();

		// edit the search items

		// delete branch details

		// WebElement branchedit =
		// driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/button[2]"));
		// branchedit.click();

		WebElement branchdelete = driver.findElement(By
				.xpath("//table/tbody/tr[1]/td[4]/button[3]"));
		branchdelete.click();

		// goto subwindow and delete

		Thread.sleep(10000);

		driver.close();*/

	}

}
