package com.may.octopus.pages.saucedemo;

import com.may.octopus.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage {

    private final By inventoryContainer = By.id("inventory_container");

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoaded() {
        return isDisplayed(inventoryContainer) && driver.getCurrentUrl().contains("inventory");
    }
}