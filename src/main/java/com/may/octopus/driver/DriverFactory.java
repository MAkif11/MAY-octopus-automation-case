package com.may.octopus.driver;

import com.may.octopus.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    public static WebDriver createDriver() {

        String browser = Config.browser();

        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();

            boolean headless = Config.isHeadless();

            if (headless) {
                options.addArguments("--headless=new");
                options.addArguments("--window-size=1920,1080");
            } else {
                options.addArguments("--start-maximized");
            }

            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");

            return new ChromeDriver(options);
        }

        throw new RuntimeException("Unsupported browser: " + browser);
    }
}