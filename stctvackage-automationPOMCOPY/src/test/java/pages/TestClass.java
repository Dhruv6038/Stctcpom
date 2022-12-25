package pages;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;

public class TestClass extends BaseTest {

	//using extend keyword to inherit the BaseTest class
	
	@Test (priority =1)
	public void ksaValidations() {
	
		
		
		
	HomePage homepage = new HomePage(driver).load();
	
    homepage.clickEnglishbtn();
	
	KsaPage ksapage = new KsaPage(driver);
	
	
	 String ActualTextPlanLite = ksapage.getAttributePlanLite();
	 
	 String ExpectedTextPlanLite = "LITE";
	 
	 Assert.assertEquals(ActualTextPlanLite, ExpectedTextPlanLite);
		
 System.out.println("KSA Actual Plan Type :" + ActualTextPlanLite + "\n" + "KSA Expected Plan type :" + ExpectedTextPlanLite + "\n");


 

	String ActualCPPlanLite = ksapage.getAttributePriceandCurrencyLite();
	
	String ExpectedCPPlanLite = "From 15 SAR/month";
	
	Assert.assertEquals(ActualCPPlanLite, ExpectedCPPlanLite);
	
	System.out.println("KSA Actual Currency and price for LITE Account :" + ActualCPPlanLite + "\n" + "KSA Expected Currency and price for LITE Account :" + ExpectedCPPlanLite + "\n");
	
	

	String ActualTPlanClassic  = ksapage.getAttributePlanClassic();
	
	String ExpectedTextPlanClassic = "CLASSIC";
	
	Assert.assertEquals(ActualTPlanClassic, ExpectedTextPlanClassic);
	
	System.out.println("KSA Actual Plan Type :" + ActualTPlanClassic + "\n" + "KSA Expected Plan type :" + ExpectedTextPlanClassic + "\n");
	
	// Locating the price and currency text for Classic Account.

	
	
	String ActualCPPlanClassic = ksapage.getAttributePriceandCurrencyClassic();
	
	String ExpectedCPPlanClassic = "From 25 SAR/month";
	
	Assert.assertEquals(ActualCPPlanClassic, ExpectedCPPlanClassic);
	

	System.out.println("KSA Actual Currency and price for ClASSIC Account :" + ActualCPPlanClassic + "\n" + "KSA Expected Currency and price for ClASSIC Account :" + ExpectedCPPlanClassic + "\n");

 

	String ActualTPlanPremium  = ksapage.getAttributePlanPremium();
	
	String ExpectedTextPlanPremium = "PREMIUM";
	
	Assert.assertEquals(ActualTPlanPremium, ExpectedTextPlanPremium);
	
	
	
	System.out.println("KSA Actual Plan Type :" + ActualTPlanPremium + "\n" + "KSA Expected Plan type :" + ExpectedTextPlanPremium + "\n");

	
	//Locating the price and currency text for premium account
	
	

	
	String ActualCPPlanPremium = ksapage.getAttributePriceandCurrencyPremium();
	
	String ExpectedCPPlanPremium = "60 SAR/month";
	
	Assert.assertEquals(ActualCPPlanPremium, ExpectedCPPlanPremium);
	
	System.out.println("KSA Actual Currency and price for PREMIUM Account :" + ActualCPPlanPremium + "\n" + "KSA Expected Currency and price for PREMIUM Account :" + ExpectedCPPlanPremium + "\n");

	
	}
	
	@Test
	public void BahrainValidation() {
	
		BahrainPage bahrainpage = new BahrainPage(driver).loadurl();
		
		
			
			
	    bahrainpage.clickEnglishbtn();
	    
	    bahrainpage.clickctrybtn();
	    
	    bahrainpage.clickBahrainbtn();
	    
	    
	    
	     
		
		

	String ActualTextPlanLite  = bahrainpage.getAttributePlanLite();
	
	String ExpectedTextPlanLite = "LITE";
	
	Assert.assertEquals(ActualTextPlanLite, ExpectedTextPlanLite);
	
	System.out.println("Bahrain Actual plan type :" + ActualTextPlanLite + "\n" + "Bahrain Expected plan type :" + ExpectedTextPlanLite + "\n");

	

	
	String ActualCPPlanLite = bahrainpage.getAttributePriceandCurrencyLite();
	
	String ExpectedCPPlanLite = "2 BHD/month";
	
	Assert.assertEquals(ActualCPPlanLite, ExpectedCPPlanLite);
	
	System.out.println("Bahrain Actual Currency and price for Lite Account :" + ActualCPPlanLite + "\n" + "Bahrain Expected Currency and price for Lite Account :" + ExpectedCPPlanLite + "\n");

	
	// COUNTRY = Bahrain
	//PLAN TYPE = CLASSIC
	
	//selenium has class webElement that we can use to store elements in our code
	

	
	String ActualTPlanClassic  = bahrainpage.getAttributePlanClassic();
	
	String ExpectedTextPlanClassic = "CLASSIC";
	
	Assert.assertEquals(ActualTPlanClassic, ExpectedTextPlanClassic);
	
	System.out.println("Bahrain Actual plan type :" + ActualTPlanClassic + "\n" +
			"Bahrain Expected plan type :" + ExpectedTextPlanClassic + "\n");

	
	

	
	String ActualCPPlanClassic = bahrainpage.getAttributePriceandCurrencyClassic();
	
	String ExpectedCPPlanClassic = "3 BHD/month";
	
	Assert.assertEquals(ActualCPPlanClassic, ExpectedCPPlanClassic);
	
	System.out.println("Bahrain Actual Currency and price for Classic Account :" + ActualCPPlanClassic + "\n" +
			"Bahrain Expected Currency and price for Classic Account :" + ExpectedCPPlanClassic + "\n");

	
	
	//Country = Bahrain
	//PlanType = PREMIUM
	
	
	

	String ActualTPlanPremium  = bahrainpage.getAttributePlanPremium();
	
	String ExpectedTextPlanPremium = "PREMIUM";
	
	Assert.assertEquals(ActualTPlanPremium, ExpectedTextPlanPremium);
	
	System.out.println("Bahrain Actual plan type :" + ActualTPlanPremium + "\n" +
			"Bahrain Expected plan type :" + ExpectedTextPlanPremium + "\n");
	
	

	
	String ActualCPPlanPremium = bahrainpage.getAttributePriceandCurrencyPremium();
	
	String ExpectedCPPlanPremium = "6 BHD/month";
	
	Assert.assertEquals(ActualCPPlanPremium, ExpectedCPPlanPremium);
	
	System.out.println("Bahrain Actual Currency and price for PREMIUM Account :" + ActualCPPlanPremium + "\n" +
			"Bahrain Expected Currency and price for PREMIUM Account :" + ExpectedCPPlanPremium + "\n");
	
	
	}
	@Test 
	public void KuwaitValidation() {
		
		
		KuwaitPage kuwaitpage = new KuwaitPage(driver).loadurl();
		

		
		  kuwaitpage.clickEnglishbtn();
			
	   
	    
	  kuwaitpage.clickctrybtn();
	  
	
	    
	    kuwaitpage.clickKuwaitbtn();
	    
	    
	    

		String ActualTextPlanLite  = kuwaitpage.getAttributePlanLite();	
		
		String ExpectedTextPlanLite = "LITE";
		
		Assert.assertEquals(ActualTextPlanLite, ExpectedTextPlanLite);
		
		System.out.println("Kuwait Actual Plan Type :" + ActualTextPlanLite + "\n" + "Kuwait Expected Plan type :" + ExpectedTextPlanLite + "\n");
		

		
		
		String ActualCPPlanLite = kuwaitpage.getAttributePriceandCurrencyLite();
		
		String ExpectedCPPlanLite = "1.2 KWD/month";
		
		Assert.assertEquals(ActualCPPlanLite, ExpectedCPPlanLite);
		
		System.out.println("Kuwait Actual Currency and price for Lite Account :" + ActualCPPlanLite + "\n" + "Kuwait Expected Currency and price for Lite Account :" + ExpectedCPPlanLite + "\n");
		System.out.println();
		
		
		
		// COUNTRY = Kuwait
		//PLAN TYPE = CLASSIC
		
		//selenium has class webElement that we can use to store elements in our code
		

		
		String ActualTPlanClassic  = kuwaitpage.getAttributePlanClassic();
		
		String ExpectedTextPlanClassic = "CLASSIC";
		
		Assert.assertEquals(ActualTPlanClassic, ExpectedTextPlanClassic);
		
		System.out.println("Kuwait Actual Plan Type :" + ActualTPlanClassic + "\n" + "Kuwait Expected Plan type :" + ExpectedTextPlanClassic + "\n");
		

		
		

		
		String ActualCPPlanClassic = kuwaitpage.getAttributePriceandCurrencyClassic();
		
		String ExpectedCPPlanClassic = "2.5 KWD/month";
		
		Assert.assertEquals(ActualCPPlanClassic, ExpectedCPPlanClassic);
		
		System.out.println("Kuwait Actual Currency and price for Classic Account :" + ActualCPPlanClassic + "\n" + "Kuwait Expected Currency and price for Classic Account :" + ExpectedCPPlanClassic + "\n");
		
		
		
		//Country = Kuwait
		//PlanType = PREMIUM
		
		
		

		
		String ActualTPlanPremium  = kuwaitpage.getAttributePlanPremium();
		
		String ExpectedTextPlanPremium = "PREMIUM";
		
		Assert.assertEquals(ActualTPlanPremium, ExpectedTextPlanPremium);
		
		System.out.println("Kuwait Actual Plan Type :" + ActualTPlanPremium + "\n" + "Kuwait Expected Plan type :" + ExpectedTextPlanPremium + "\n");
		
		
		

		
		String ActualCPPlanPremium = kuwaitpage.getAttributePriceandCurrencyPremium();
		
		String ExpectedCPPlanPremium = "4.8 KWD/month";
		
		Assert.assertEquals(ActualCPPlanPremium, ExpectedCPPlanPremium);
		
		System.out.println("Kuwait Actual Currency and price for PREMIUM Account :" + ActualCPPlanPremium + "\n" + "Kuwait Expected Currency and price for PREMIUM Account :" + ExpectedCPPlanPremium + "\n");
		
		
			
			
			
			
		
		
		
		
		
		
	}
	
	
}
