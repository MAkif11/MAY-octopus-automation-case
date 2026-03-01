package com.may.octopus.pages.demoblaze;

import com.may.octopus.config.Config;
import com.may.octopus.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By productsGrid = By.id("tbodyid");
    private final By cartLink = By.id("cartur");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        driver.get(Config.baseUrlDemoBlaze());
        return this;
    }

    public boolean isLoaded() {
        return isDisplayed(productsGrid);
    }

    public ProductDetailPage openProductByName(String name) {
        click(By.linkText(name));
        return new ProductDetailPage(driver);
    }

    public CartPage openCart() {
        click(cartLink);
        return new CartPage(driver);
    }
}