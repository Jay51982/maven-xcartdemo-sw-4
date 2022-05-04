package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class TopMenuTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ShippingPage shippingPage = new ShippingPage();
    ContactUsPage contactUsPage = new ContactUsPage();
    NewPage newPage = new NewPage();
    ComingSoonPage comingSoonPage = new ComingSoonPage();


//* click on the ‘Shipping’ Tab * Verify the text ‘Shipping’
    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        homePage.clickOnshippingTab();
        String expectedMessage = "Shipping";
        String actualMessage = shippingPage.getshippingTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "Shipping page not displayed");
    }

    //    * click on the ‘New’ Tab * Verify the text ‘New’
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        homePage.clickOnNewTab();
        String expectedMessage = "New arrivals";
        String actualMessage = newPage.getNewTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "New-tab page not displayed");
    }

//* click on the ‘Coming soon’ Tab * Verify the text ‘Coming soon’
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        homePage.clickOnComingSoonTab();
        String expectedMessage = "Coming soon";
        String actualMessage = comingSoonPage.getComingSoonTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "Coming soon page not displayed");
    }
}

