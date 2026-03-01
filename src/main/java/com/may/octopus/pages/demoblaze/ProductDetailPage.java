package com.may.octopus.pages.demoblaze;

import com.may.octopus.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    private final By title = By.cssSelector("#tbodyid h2");
    private final By addToCartLink = By.linkText("Add to cart");
    private final By cartLink = By.id("cartur");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public ProductDetailPage waitUntilLoaded() {
        wait.until(d -> d.getCurrentUrl().contains("prod.html"));
        find(title);
        find(addToCartLink);

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

    public ProductDetailPage addToCartAndAcceptAlert() {
        click(addToCartLink);
        acceptAlertIfPresent();
        return this;
    }

    public CartPage goToCart() {
        click(cartLink);
        return new CartPage(driver);
    }
}