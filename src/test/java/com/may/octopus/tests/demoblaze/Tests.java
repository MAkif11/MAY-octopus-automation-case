package com.may.octopus.tests.demoblaze;

import com.may.octopus.base.BaseTest;
import com.may.octopus.pages.demoblaze.CartPage;
import com.may.octopus.pages.demoblaze.HomePage;
import com.may.octopus.pages.demoblaze.ProductDetailPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests extends BaseTest {

    @Test
    void shouldAddProductToCart() {
        HomePage home = new HomePage(driver()).open();

        ProductDetailPage product = home.openProductByName("Samsung galaxy s6");
        assertTrue(product.isLoaded(), "Product detail page should be loaded");

        product.addToCartAndAcceptAlert();

        CartPage cart = product.goToCart();
        assertTrue(cart.hasProducts(), "Cart should contain at least one product");
    }

    @Test
    void shouldOpenPlaceOrderModal() {
        HomePage home = new HomePage(driver()).open();

        ProductDetailPage product = home.openProductByName("Samsung galaxy s6");
        product.waitUntilLoaded();

        product.addToCartAndAcceptAlert();

        CartPage cart = product.goToCart();
        assertTrue(cart.hasProducts(), "Cart should contain at least one product");

        assertTrue(cart.clickPlaceOrder().isLoaded(), "Order modal should be visible");
    }
}