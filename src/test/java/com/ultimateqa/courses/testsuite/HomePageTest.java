package com.ultimateqa.courses.testsuite;


import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.setNavigateToLoginPageWithClick();
        String expectedText = "Welcome Back!";
         String actualText = homePage.getWelcomeText();
          Assert.assertEquals(actualText, expectedText, "Message not displayed");

    }}

