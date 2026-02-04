package com.snc.pages.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderDetailsPage {

    WebDriver driver;

    // ✅ Correct constructor
    public OrderDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    By orderStatus = By.id("order_status");
    By updateBtn = By.id("save");

    public void changeOrderStatus(String status) {
        Select select = new Select(driver.findElement(orderStatus));
        select.selectByVisibleText(status);
        driver.findElement(updateBtn).click();
    }

    public String getCurrentStatus() {
        return new Select(driver.findElement(orderStatus))
                .getFirstSelectedOption()
                .getText();
    }
}
