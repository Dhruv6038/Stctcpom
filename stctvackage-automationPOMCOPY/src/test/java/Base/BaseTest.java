package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import factory.DriverManager;

public class BaseTest {
	
	//creating an instance variable for the driver
	
	protected WebDriver driver; // driver object
	
	//with protected only clases which inherits the base test class will be able to see the driver object
	
	// if we use public keyword then the driver object will be available for all the classes and it may not be desired.
	
	// always gives access which is minimum. this is encapsulation/data hiding
	
	@BeforeMethod
	public void StartDriver() {
		
		//calling the driver manager class by creating the instance of the class
		//and then calling the initialize driver method that will give us the webdriver.
		
		driver = new DriverManager().initializeDriver();
		
		
		
	}
	
	
@AfterMethod
public void QuitDriver() {
		
		driver.quit();
		
		
	}
	
	
	
}
