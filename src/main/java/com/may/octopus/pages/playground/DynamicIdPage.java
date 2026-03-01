package com.may.octopus.pages.playground;

import com.may.octopus.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicIdPage extends BasePage {

    private final By button = By.xpath("//button[normalize-space()='Button with Dynamic ID']");

    public DynamicIdPage(WebDriver driver) {
        super(driver);
    }

    public DynamicIdPage clickDynamicButton() {
        click(button);
        return this;
    }

    public boolean isButtonVisible() {
        return isVisible(button);
    }
}