package com.may.octopus.pages.saucedemo;

import com.may.octopus.config.Config;
import com.may.octopus.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginBtn = By.id("login-button");
    private final By error = By.cssSelector("[data-test='error']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage open() {
        driver.get(Config.baseUrlSauceDemo());
        return this;
    }

    public boolean isLoaded() {
        return isVisible(username) && isVisible(password) && isVisible(loginBtn);
    }

    public InventoryPage login(String user, String pass) {
        type(username, user);
        type(password, pass);
        click(loginBtn);
        return new InventoryPage(driver);
    }

    public String errorMessage() {
        return getText(error);
    }
}