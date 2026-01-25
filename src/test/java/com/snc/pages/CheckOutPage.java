package com.snc.pages;

import java.time.Duration;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
public class CheckOutPage {

	private WebDriver driver;
	private WebDriverWait  wait;

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	public void fillBillingDetails() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("billing_first_name"))).sendKeys("Parth");

		driver.findElement(By.id("billing_last_name")).sendKeys("Ingle");
		driver.findElement(By.id("billing_company")).sendKeys("NA");

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");

		// Country dropdown
		driver.findElement(By.id("select2-billing_country-container")).click();

		WebElement searchBox = ((FluentWait<WebDriver>) wait)
				.until(ExpectedConditions.visibilityOfElementLocated(By.className("select2-search__field")));
		searchBox.sendKeys("India");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='India']"))).click();

		driver.findElement(By.id("billing_address_1")).sendKeys("Dwarka Queens Park");
		driver.findElement(By.id("billing_address_2")).sendKeys("Pimple Saudagar Pune");
		driver.findElement(By.id("billing_city")).sendKeys("Pune");

		// State dropdown
		driver.findElement(By.id("select2-billing_state-container")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Maharashtra']"))).click();

		driver.findElement(By.id("billing_postcode")).sendKeys("411027");
		driver.findElement(By.id("billing_phone")).sendKeys("9763208042");
		driver.findElement(By.id("billing_email")).sendKeys("parthingle003@gmail.com");

		driver.findElement(By.id("order_comments")).sendKeys("Pack the parcel with bill");

		driver.findElement(By.id("payment_method_cod")).click();
		//driver.findElement(By.id("place_order")).click();
	}
}
