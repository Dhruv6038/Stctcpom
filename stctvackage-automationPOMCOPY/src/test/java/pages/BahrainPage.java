package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;

public class BahrainPage extends BasePage {

	public BahrainPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
private By LITETypePlan = By.xpath("/html//strong[@id='lite']");

private By CountrySelection = By.xpath("//span[@id='arrow']/img");

private By BahrainSelection = By.xpath("//div[@id='bh-contry-flag']/img[@alt='bh']");
	
	
	
	private By ActualCurrencyPricePlanLite = By.xpath("/html//div[@id='lite_tierCurrency']");
	
	private By ActualTypePlanClassic = By.xpath("/html//strong[@id='classic']");

	private By ActualCurrencyPricePlanClassic = By.xpath("/html//div[@id='classic_tierCurrency']");
	
	private By ActualTypePlanPremium = By.xpath("/html//strong[@id='premium']");
	
	private By ActualCurrencyPricePlanPremium = By.xpath("/html//div[@id='premium_tierCurrency']");
	
	private By EnglishLinkTextBtn = By.linkText("English");
	

public BahrainPage loadurl() {
	
	loadurl("/");
	
	return this;
	
	
}	


public BahrainPage clickEnglishbtn() {
	
	 driver.findElement(EnglishLinkTextBtn).click();
	 
	 return new BahrainPage(driver);
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


public void clickctrybtn() {
	
	driver.findElement(CountrySelection).click();
	
	}


public BahrainPage clickBahrainbtn() {
	
driver.findElement(BahrainSelection).click();
	
	return new BahrainPage(driver);
	
}
	

}
