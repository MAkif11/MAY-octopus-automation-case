package com.may.octopus.config;

public class Config {

    public static String browser() {
        return ConfigLoader.get("browser");
    }

    public static boolean isHeadless() {
        return Boolean.parseBoolean(ConfigLoader.get("headless"));
    }

    public static String baseUrlSauceDemo() {
        return ConfigLoader.get("baseUrl.saucedemo");
    }

    public static String baseUrlDemoBlaze() {
        return ConfigLoader.get("baseUrl.demoblaze");
    }

    public static String baseUrlPlayground() {
        return ConfigLoader.get("baseUrl.playground");
    }
}