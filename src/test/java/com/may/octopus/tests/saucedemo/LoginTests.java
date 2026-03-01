package com.may.octopus.tests.saucedemo;

import com.may.octopus.base.BaseTest;
import com.may.octopus.pages.saucedemo.InventoryPage;
import com.may.octopus.pages.saucedemo.LoginPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTests extends BaseTest {

    @Test
    void shouldOpenLoginPage() {
        LoginPage loginPage = new LoginPage(driver()).open();
        assertTrue(loginPage.isLoaded(), "Login page should be loaded");
    }

    @Test
    void shouldLoginWithValidCredentials() {
        LoginPage loginPage = new LoginPage(driver()).open();
        InventoryPage inventoryPage = loginPage.login("standard_user", "secret_sauce");
        assertTrue(inventoryPage.isLoaded(), "Inventory page should be loaded after successful login");
    }

    @Test
    void shouldShowErrorForInvalidPassword() {
        LoginPage loginPage = new LoginPage(driver()).open();
        loginPage.login("standard_user", "wrong_password");
        String err = loginPage.errorMessage();
        assertNotNull(err);
        assertTrue(err.toLowerCase().contains("do not match") || err.toLowerCase().contains("locked out"),
                "Error message should indicate invalid credentials");
    }

    @Test
    void shouldShowErrorForEmptyUsername() {
        LoginPage loginPage = new LoginPage(driver()).open();
        loginPage.login("", "secret_sauce");
        String err = loginPage.errorMessage();
        assertNotNull(err);
        assertTrue(err.toLowerCase().contains("username is required"),
                "Error message should indicate missing username");
    }
}