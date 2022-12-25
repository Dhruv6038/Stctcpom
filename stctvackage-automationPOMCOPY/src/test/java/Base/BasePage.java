package Base;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	public WebDriver driver;
	
	//creating a parameterized constructor that will take web driver as an argument and we can assign the value
	// to the webDriver instance variable using the this keyword.
	
	public BasePage(WebDriver driver) {
		
		
		this.driver = driver;
		
		
	}
	
	public void loadurl(String endpoint) {
		
		
		driver.get("https://www.stctv.com/" + endpoint);

		
		//end point the relative path after the base url.
	}
	
	

	
	

}
