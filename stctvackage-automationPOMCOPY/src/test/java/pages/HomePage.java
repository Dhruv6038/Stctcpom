package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private By EnglishLinkTextBtn = By.linkText("English");
	
	
	
	
	
	
	public HomePage load() {
		
		loadurl("/");
		return this;
		

	}
	
	
	

	public KsaPage clickEnglishbtn() {
		
		 driver.findElement(EnglishLinkTextBtn).click();
		 
		 return new KsaPage(driver);
	}
	
	
}
