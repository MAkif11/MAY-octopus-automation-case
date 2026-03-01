package com.may.octopus.tests.playground;

import com.may.octopus.base.BaseTest;
import com.may.octopus.pages.playground.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests extends BaseTest {

    @Test
    void textInput_shouldUpdateButtonText() {
        HomePage home = new HomePage(driver()).open();

        TextInputPage page = home.goToTextInput();
        page.setButtonName("OCTOPUS").clickButton();

        assertEquals("OCTOPUS", page.buttonText());
    }

    @Test
    void dynamicId_shouldFindButtonWithoutUsingId() {
        HomePage home = new HomePage(driver()).open();

        DynamicIdPage page = home.goToDynamicId();
        assertTrue(page.isButtonVisible(), "Dynamic button should be visible");
        page.clickDynamicButton();
    }

    @Test
    void loadDelay_shouldWaitAndClickButton() {
        HomePage home = new HomePage(driver()).open();

        LoadDelayPage page = home.goToLoadDelay();
        assertTrue(page.isButtonVisible(), "Button should appear after delay");
        page.clickButton();
    }
}