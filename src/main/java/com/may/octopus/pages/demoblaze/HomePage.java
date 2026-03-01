package com.may.octopus.pages.demoblaze;

import com.may.octopus.config.Config;
import com.may.octopus.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        driver.get(Config.baseUrlDemoBlaze());
        return this;
    }

    public ProductDetailPage openProductByName(String name) {
        click(By.linkText(name));
        return new ProductDetailPage(driver);
    }
}