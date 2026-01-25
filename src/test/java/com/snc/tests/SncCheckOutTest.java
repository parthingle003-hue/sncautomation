package com.snc.tests;

import org.testng.annotations.Test;

import com.snc.base.TestBase;
import com.snc.pages.CheckOutPage;
import com.snc.pages.HomePage;
import com.snc.pages.ProductPage;

public class SncCheckOutTest extends TestBase {
	
	@Test
	public void CheckOutTest() {
	driver.get("https://sncnutrition.com/");
	
	HomePage home=new HomePage(driver);
	home.clickOnPeanutButter();
	
	ProductPage page=new ProductPage(driver);
	page.addToCartAndCheckOut();
	
	CheckOutPage checkout =new CheckOutPage(driver);
	checkout.fillBillingDetails();
	
	
	System.out.println("\n"
			+ "	Pack the parcel with bill");
	
	

}
}
