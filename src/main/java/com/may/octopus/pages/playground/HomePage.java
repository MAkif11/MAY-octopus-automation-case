package com.may.octopus.pages.playground;

import com.may.octopus.config.Config;
import com.may.octopus.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By textInputLink = By.linkText("Text Input");
    private final By dynamicIdLink = By.linkText("Dynamic ID");
    private final By loadDelayLink = By.linkText("Load Delay");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        driver.get(Config.baseUrlPlayground());
        return this;
    }

    public TextInputPage goToTextInput() {
        click(textInputLink);
        return new TextInputPage(driver);
    }

    public DynamicIdPage goToDynamicId() {
        click(dynamicIdLink);
        return new DynamicIdPage(driver);
    }

    public LoadDelayPage goToLoadDelay() {
        click(loadDelayLink);
        return new LoadDelayPage(driver);
    }
}