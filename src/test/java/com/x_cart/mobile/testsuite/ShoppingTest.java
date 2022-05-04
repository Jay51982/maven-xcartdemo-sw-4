package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.HotDealsBestSellersPage;
import com.x_cart.mobile.pages.HotDealsSalesPage;
import com.x_cart.mobile.testbase.TestBase;
import org.openqa.selenium.interactions.Mouse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    /*verifySaleProductsArrangeAlphabetically

           1.1 Mouse hover on the “Hot deals” link
           1.2 Mouse hover on the “Sale”  link and click
           1.3 Verify the text “Sale”
           1.4 Mouse hover on “Sort By” and select “Name A-Z”
           1.5 Verify that the product arrange alphabetically
   */
    HotDealsSalesPage hotDealsSalesPage = new HotDealsSalesPage();
    HotDealsBestSellersPage hotDealsBestSellersPage = new HotDealsBestSellersPage();

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForIPhone() throws InterruptedException {
        //        1.1 Mouse hover on the “Hot deals” link
        Thread.sleep(1000);
        hotDealsBestSellersPage.mouseHoverToHotdeals();

        //        1.2 Mouse hover on the “Bestsellers”  link and click
        hotDealsBestSellersPage.clickToBestSellersTab();

        //        1.3 Verify the text “Bestsellers”
        Thread.sleep(1000);
        String expectedMessage = "Bestsellers";
        String actualMessage = hotDealsBestSellersPage.getBestSellersTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "BestSellers page not displayed");

        //        1.4 Mouse hover on “Sort By” and select “Name Z-A”
        Thread.sleep(1000);
        hotDealsBestSellersPage.clickToNameZ_A();

        String expectedMessage1 = "Name Z - A";
        String actualMessage1 = hotDealsBestSellersPage.getNameZ_ATabText();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Name Z-A page not displayed");

        //        1.5 Click on “Add to cart” button of the product “IPhone SE”
        Thread.sleep(1000);
        hotDealsBestSellersPage.clickToAddToCart();

        //        1.6 Verify the message “Product has been added to your cart” display in  green bar
        String expectedMessage2 = "Product has been added to your cart";
        String actualMessage2 = hotDealsBestSellersPage.getAddToCartMessageVerifyText();
        Assert.assertEquals(expectedMessage2, actualMessage2, "Product added to cart message not displayed");

        //        1.7 Click on X sign to close the message
        Thread.sleep(1000);
        hotDealsBestSellersPage.clickOnXsign();

        //        1.8 Click on “Your cart” icon and Click on “View cart” button
        Thread.sleep(1000);
        hotDealsBestSellersPage.clickOnYourCartNViewCart();

        //1.9 Verify the text “Your shopping cart - 1 item”
        Thread.sleep(1000);
        String expectedMessage3 = "Your shopping cart - 1 item";
        String actualMessage3 = hotDealsBestSellersPage.getShoppingCart_1ItemText();
        Assert.assertEquals(expectedMessage3, actualMessage3, "Your Shopping cart message not displayed");

        // 1.10 Verify the Subtotal $299.00
        Thread.sleep(1000);
        String expectedMessage4 = "$299.00";
        String actualMessage4 = hotDealsBestSellersPage.getSubTotalText();
        Assert.assertEquals(expectedMessage4, actualMessage4, "Subtotal message not displayed");

        //1.11 Verify the total $309.73
        Thread.sleep(1000);
        String expectedMessage5 = "$309.73";
        String actualMessage5 = hotDealsBestSellersPage.getTotalText();
        Assert.assertEquals(expectedMessage5, actualMessage5, "Total message not displayed");

        // 1.12 Click on “Go to checkout” button
        Thread.sleep(1000);
        hotDealsBestSellersPage.clickOnCheckOut();

        //1.13 Verify the text “Log in to your account”
        Thread.sleep(1000);
        String expectedMessage6 = "Log in to your account";
        String actualMessage6 = hotDealsBestSellersPage.getLogInToYourAccountText();
        Assert.assertEquals(expectedMessage6, actualMessage6, "Login to your account - not displayed");

        //1.14 Enter Email address
        Thread.sleep(1000);
        hotDealsBestSellersPage.enterEmailId("abc@gmail.com");

        //1.15 Click on “Continue” Button
        Thread.sleep(1000);
        hotDealsBestSellersPage.clickOnContinue();

        //1.16 Verify the text “Secure Checkout”
        Thread.sleep(1000);
        String expectedMessage7 = "Secure Checkout";
        String actualMessage7 = hotDealsBestSellersPage.getSecureCheckOutText();
        Assert.assertEquals(expectedMessage7, actualMessage7, "Secure Checkout - not displayed");

        //1.17 Fill all the mandatory fields
        Thread.sleep(1000);
        hotDealsBestSellersPage.enterFirstName("Dhirubhai");
        hotDealsBestSellersPage.enterLastName("Ambani");
        hotDealsBestSellersPage.enterStreetName("Anatalia");
        hotDealsBestSellersPage.enterCityName("London");
        hotDealsBestSellersPage.enterCountryCode("United Kingdom");
        hotDealsBestSellersPage.enterStateName("Westminster");
        hotDealsBestSellersPage.enterZipName("W1 2DN");

        //1.20 Select the Delivery Method to “Local Shipping”
        hotDealsBestSellersPage.clickOnLocalShipping();

        //1.21 Select Payment Method “COD”
        Thread.sleep(1000);
        hotDealsBestSellersPage.clickOnPaymentMethod();

        //1.22 Verify the total $311.03.00
//        Thread.sleep(1000);
//        String expectedMessage8 = "$311.03";
//        String actualMessage8 = hotDealsBestSellersPage.getFinalTotalText();
//        Assert.assertEquals(expectedMessage8, actualMessage8, "$311.03 - not displayed");

        //1.23 Click on “Place Order” Button
        Thread.sleep(1000);
        hotDealsBestSellersPage.clickOnPlaceOrder();

        //1.24 Verify the text “Thank you for your order”
        Thread.sleep(1000);
        String expectedMessage9 = "Thank you for your order";
        String actualMessage9 = hotDealsBestSellersPage.getThankYouText();
        Assert.assertEquals(expectedMessage9, actualMessage9, "$311.03 - not displayed");

    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {

        //1.1 Mouse hover on the “Hot deals” link
        hotDealsBestSellersPage.mouseHoverToHotdeals();

        //1.2 Mouse hover on the “Bestseller”  link and click
        hotDealsBestSellersPage.clickToBestSellersTab();

        //1.3 Verify the text “Bestsellers”
        String expectedMessage = "Bestsellers";
        String actualMessage = hotDealsBestSellersPage.getBestSellersTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "BestSellers page not displayed");

        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        hotDealsBestSellersPage.clickToNameA_Z();
        String expectedMessage1 = "Name A - Z";
        String actualMessage1 = hotDealsBestSellersPage.getNameA_ZTabText();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Name Z-A page not displayed");

        //1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
        Thread.sleep(1000);
        hotDealsBestSellersPage.clickToVinyIdolzAddToCart();

        //1.6 Verify the message “Product has been added to your cart” display in  green bar
        Thread.sleep(1000);
        String expectedMessage2 = "Product has been added to your cart";
        String actualMessage2 = hotDealsBestSellersPage.getAddToCartMessageVerifyText();
        Assert.assertEquals(expectedMessage2, actualMessage2, "Product added to cart message not displayed");

        //1.7 Click on X sign to close the message
        Thread.sleep(1000);
        hotDealsBestSellersPage.clickOnXsign();

        //1.8 Click on “Your cart” icon and Click on “View cart” button
        Thread.sleep(1000);
        hotDealsBestSellersPage.clickOnYourCartNViewCart();

        //1.9 Verify the text “Your shopping cart - 1 item”
        Thread.sleep(1000);
        String expectedMessage3 = "Your shopping cart - 1 item";
        String actualMessage3 = hotDealsBestSellersPage.getShoppingCart_1ItemText();
        Assert.assertEquals(expectedMessage3, actualMessage3, "Your Shopping cart message not displayed");

        //1.10 Click on “Empty your cart” link
        Thread.sleep(1000);
        hotDealsBestSellersPage.clickOnEmptyYourCart();

        //1.11 Verify the text “Are you sure you want to clear your cart?” on alert
        Thread.sleep(2000);
        hotDealsBestSellersPage.callSwitchToAlertMethod();
        String expectedMessage4 = "Are you sure you want to clear your cart?";
        String actualMessage4 = hotDealsBestSellersPage.getTextFromAlertMessage();
        Assert.assertEquals(expectedMessage4, actualMessage4, "Clear your cart - message not displayed");

        //1.12 Click “Ok” on alert
        Thread.sleep(1000);
        hotDealsBestSellersPage.clickOnAcceptAlert();

        //1.13 Verify the message “Item(s) deleted from your cart”
        Thread.sleep(2000);
        String expectedMessage5 = "Item(s) deleted from your cart";
        String actualMessage5 = hotDealsBestSellersPage.getitemDeletedFromYourCartText();
        Assert.assertEquals(expectedMessage5, actualMessage5, "Clear your cart - message not displayed");

        //1.15 Verify the text “Your cart is empty”
        Thread.sleep(2000);
        String expectedMessage6 = "Your cart is empty";
        String actualMessage6 = hotDealsBestSellersPage.getYourCartIsEmptyText();
        Assert.assertEquals(expectedMessage6, actualMessage6, "Your cart is empty - message not displayed");

    }

}




