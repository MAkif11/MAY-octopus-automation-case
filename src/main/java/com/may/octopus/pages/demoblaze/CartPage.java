package com.may.octopus.pages.demoblaze;

import com.may.octopus.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private final By cartRows = By.cssSelector("#tbodyid tr");
    private final By placeOrderBtn = By.cssSelector("button.btn-success");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasProducts() {
        try {
            wait.until(d -> !d.findElements(cartRows).isEmpty());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public OrderModal clickPlaceOrder() {
        click(placeOrderBtn);
        return new OrderModal(driver);
    }
}