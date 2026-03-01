package com.may.octopus.pages.playground;

import com.may.octopus.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoadDelayPage extends BasePage {

    private final By button = By.cssSelector(".btn.btn-primary");

    public LoadDelayPage(WebDriver driver) {
        super(driver);
    }

    public boolean isButtonVisible() {
        return isVisible(button);
    }

    public LoadDelayPage clickButton() {
        click(button);
        return this;
    }
}