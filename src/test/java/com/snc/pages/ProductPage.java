package com.snc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	private WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	By addtoCartBtn = By.name("add-to-cart");
	By cartIcon = By.cssSelector("i.czico-028-shopping-basket");
	By checkOutBtn = By.xpath("//a[contains(text(),'Proceed to checkout')]");

	public void addToCartAndCheckOut() {
		driver.findElement(addtoCartBtn).click();
		
		driver.findElement(cartIcon).click();
		driver.findElement(checkOutBtn).click();
	}

	

}
