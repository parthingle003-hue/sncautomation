package com.snc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	 private WebDriver driver;

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    private By peanutButter = By.xpath("//a[.//h2[contains(text(),'Snc Peanut Butter')]]");
	    
	    public void clickOnPeanutButter() {
	    	driver.findElement(peanutButter).click();
	    }
}
