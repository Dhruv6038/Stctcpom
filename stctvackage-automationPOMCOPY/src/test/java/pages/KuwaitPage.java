package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;

public class KuwaitPage extends BasePage{

	public KuwaitPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
private By LITETypePlan = By.xpath("/html//strong[@id='lite']");
	
	
	
	private By ActualCurrencyPricePlanLite = By.xpath("/html//div[@id='lite_tierCurrency']");
	
	private By ActualTypePlanClassic = By.xpath("/html//strong[@id='classic']");

	private By ActualCurrencyPricePlanClassic = By.xpath("/html//div[@id='classic_tierCurrency']");
	
	private By ActualTypePlanPremium = By.xpath("/html//strong[@id='premium']");
	
	private By ActualCurrencyPricePlanPremium = By.xpath("/html//div[@id='premium_tierCurrency']");
	
private By CountrySelection = By.xpath("//span[@id='arrow']/img");
	
	private By KuwaitSelection = By.xpath("//div[@id='kw-contry-flag']/img[@alt='kw']");
	
	private By EnglishLinkTextBtn = By.linkText("English");
	


	public KuwaitPage loadurl() {
		
		loadurl("/");
		
		return this;
		
		
	}	


	public KuwaitPage clickEnglishbtn() {
		
		 driver.findElement(EnglishLinkTextBtn).click();
		 
		 return new KuwaitPage(driver);
	}

	
	
	public void clickctrybtn() {
		
		driver.findElement(CountrySelection).click();
		
		}


	public KuwaitPage clickKuwaitbtn() {
		
	driver.findElement(KuwaitSelection).click();
		
		return new KuwaitPage(driver);
	
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
	


