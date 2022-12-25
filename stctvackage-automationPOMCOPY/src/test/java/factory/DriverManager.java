package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	//creating a method that will return the web driver.
	
	//the job of this method is to initialize the driver and return the web driver object.
	
	// we are abstracting the driver initialization logic
	
	public WebDriver initializeDriver() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
