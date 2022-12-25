package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Base.BasePage;



public class KsaPage extends BasePage {

	// Define the UI elements using the By class from selenium
	// with the private access modifier we are making sure that the field is not accessible outside the ksaPage class
	
	private By LITETypePlan = By.xpath("/html//strong[@id='lite']");
	
	
	
	private By ActualCurrencyPricePlanLite = By.xpath("/html//div[@id='lite_tierCurrency']");
	
	private By ActualTypePlanClassic = By.xpath("/html//strong[@id='classic']");

	private By ActualCurrencyPricePlanClassic = By.xpath("/html//div[@id='classic_tierCurrency']");
	
	private By ActualTypePlanPremium = By.xpath("/html//strong[@id='premium']");
	
	private By ActualCurrencyPricePlanPremium = By.xpath("/html//div[@id='premium_tierCurrency']");
	

	
	public KsaPage(WebDriver driver) { //created a parameterized constructor with argument 'WebDriver driver'
		super(driver); //using the super keyword 
		
		// it is passing the driver to the constructor of the base page.
		// so this way the driver in the base page is getting set by the home page.
		
		
	}
	
	
	
	
	
	public String getAttributePlanLite() {
		
		return driver.findElement(LITETypePlan).getText();
		
		
	}
	
	
	public String getAttributePriceandCurrencyLite() {
		
		return driver.findElement(ActualCurrencyPricePlanLite).getText();
		
		
	}
	
	public String getAttributePlanClassic() {
		
		return driver.findElement(ActualTypePlanClassic).getText();
		
		
	}
	
	public String getAttributePriceandCurrencyClassic() {
		
		return driver.findElement(ActualCurrencyPricePlanClassic).getText();
		
		
	}
	
	public String getAttributePlanPremium() {
		
		return driver.findElement(ActualTypePlanPremium).getText();
		
		
	}
	

public String getAttributePriceandCurrencyPremium() {
		
		return driver.findElement(ActualCurrencyPricePlanPremium).getText();
		
		
	}



}
