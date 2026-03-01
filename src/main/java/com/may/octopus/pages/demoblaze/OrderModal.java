package com.may.octopus.pages.demoblaze;

import com.may.octopus.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderModal extends BasePage {

    private final By modal = By.id("orderModal");
    private final By modalTitle = By.id("orderModalLabel");
    private final By purchaseBtn = By.cssSelector("#orderModal .btn.btn-primary");

    public OrderModal(WebDriver driver) {
        super(driver);
    }

    public OrderModal waitUntilLoaded() {
        find(modalTitle);
        find(purchaseBtn);
        return this;
    }

    public boolean isLoaded() {
        try {
            waitUntilLoaded();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}