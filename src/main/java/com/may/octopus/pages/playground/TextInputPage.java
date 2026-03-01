package com.may.octopus.pages.playground;

import com.may.octopus.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextInputPage extends BasePage {

    private final By input = By.id("newButtonName");
    private final By button = By.id("updatingButton");

    public TextInputPage(WebDriver driver) {
        super(driver);
    }

    public TextInputPage setButtonName(String name) {
        type(input, name);
        return this;
    }

    public TextInputPage clickButton() {
        click(button);
        return this;
    }

    public String buttonText() {
        return getText(button);
    }
}