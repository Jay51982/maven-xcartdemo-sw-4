package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HotDealsBestSellersPage extends Utility {


    By hotdealslink = By.xpath("//div[@id='header-area']//span[@class='primary-title']");
    By bestSellersTab = By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]");
    By bestSellersTabTextVerify = By.xpath("//h1[@id='page-title']");
    By sortByLink = By.xpath("//span[@class='sort-by-label']");
    By nameZ_ATab = By.xpath("//a[normalize-space()='Name Z - A']");
    //By NameA_ZTabText = By.xpath("//span[contains(text(),'Name A - Z')]");
    By NameZ_ATabText = By.xpath("//span[contains(text(),'Name Z - A')]");
    By nameA_ZTab = By.xpath("//a[normalize-space()='Name A - Z']");
    By nameA_ZTabText = By.xpath("//span[contains(text(),'Name A - Z')]");


    By priceHigh_Low = By.xpath("//a[normalize-space()='Price High - Low']");
    By priceHigh_LowText = By.xpath("//span[contains(text(),'Price High - Low')]");

    By rates = By.xpath("//a[normalize-space()='Rates']");
    By ratesText = By.xpath("//span[contains(text(),'Rates')]");

    By iPhone = By.xpath("//img[contains(@alt,'iPhone 5S')]");
    By addToCart = By.xpath("//button[contains(@class,'regular-button add-to-cart product-add2cart productid-42')]//span[contains(text(),'Add to cart')]");

    By addToCartMessageVerify = By.xpath("//li[contains(@class,'info')]");
    By xsign = By.xpath("//a[@title='Close']");

    By yourCart = By.xpath("//div[@title='Your cart']");
    By viewCart = By.xpath("//a[@class='regular-button cart']");

    By shoppingCart1ItemText = By.xpath("//h1[@id='page-title']");
    By subTotal = By.xpath("//ul[@class='sums']/li/span");
    By total = By.xpath("//li[@class='total']/span/span[1]");
    By checkOut = By.xpath("//button[contains(@class,'regular-button regular-main-button checkout')]");
    By logInToYourAccountText = By.xpath("//h3[normalize-space()='Log in to your account']");
    By emailField = By.xpath("//input[@id='email']");
    By continueBtn = By.xpath("//span[contains(text(),'Continue')]");
    By secureCheckOutText = By.xpath("//h1[@class='title']");
    By firstName = By.xpath("//input[@id='shippingaddress-firstname']");
    By lastName = By.xpath("//input[@id='shippingaddress-lastname']");
    By streetName = By.xpath("//input[@id='shippingaddress-street']");
    By cityName = By.xpath("//input[@id='shippingaddress-city']");
    By countryCode = By.xpath("//select[@id='shippingaddress-country-code']");
    By stateName = By.xpath("//input[@id='shippingaddress-custom-state']");
    By zipCode = By.xpath("//input[@id='shippingaddress-zipcode']");
    By localShipping = By.xpath("//input[@id='method128']");
    By paymentMethod = By.xpath("//input[@id='pmethod6']");
    By finalTotalText = By.xpath("//span[normalize-space()='311'//div[@class='total clearfix']//span[@class='part-decimal'][normalize-space()='03']]");
    By placeOrder = By.xpath("//span[normalize-space()='Place order: $311.03']");
    By thankYouText = By.xpath("//h1[@id='page-title']");
    By addVinylToCart = By.xpath("//div[@class='product productid-13 ']//span[contains(text(),'Add to cart')]");
    By vinlyIdolz = By.xpath("//img[@alt='Vinyl Idolz: Ghostbusters']");
    By emptyYourCartLink = By.xpath("//a[@class='clear-bag']");
    By itemDeletedFromYourCartText = By.xpath("//li[@class='info']");
    By yourCartIsEmptyText = By.xpath("//h1[@id='page-title']");

    public String getYourCartIsEmptyText() {
        return getTextFromElement(yourCartIsEmptyText);
    }

    public String getitemDeletedFromYourCartText() {
        return getTextFromElement(itemDeletedFromYourCartText);
    }

    public void callSwitchToAlertMethod() {
        switchToAlert();
    }

    public String getTextFromAlertMessage() {
        return getTextFromAlert();
    }

    public void clickOnAcceptAlert() {
        acceptAlert();
    }

    public void clickOnEmptyYourCart() {
        clickOnElement(emptyYourCartLink);
    }

    public String getThankYouText() {
        return getTextFromElement(thankYouText);
    }

    public void clickOnPlaceOrder() {
        clickOnElement(placeOrder);
    }

    public String getFinalTotalText() {
        return getTextFromElement(finalTotalText);
    }

    public void clickOnPaymentMethod() {
        clickOnElement(paymentMethod);
    }

    public void clickOnLocalShipping() {
        clickOnElement(localShipping);
    }

    public void enterStateName(String sname) {
        sendTextToElement(stateName, sname);
    }

    public void enterZipName(String fname) {
        sendTextToElement(zipCode, fname);
    }

    public void enterCountryCode(String cCode) {
        sendTextToElement(countryCode, cCode);
    }

    public void enterCityName(String cname) {
        sendTextToElement(cityName, cname);
    }

    public void enterStreetName(String strname) {
        sendTextToElement(streetName, strname);
    }

    public void enterLastName(String lname) {
        sendTextToElement(lastName, lname);
    }

    public void enterFirstName(String fname) {
        sendTextToElement(firstName, fname);
    }

    public String getSecureCheckOutText() {
        return getTextFromElement(secureCheckOutText);
    }

    public void clickOnContinue() {
        clickOnElement(continueBtn);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public String getLogInToYourAccountText() {
        return getTextFromElement(logInToYourAccountText);
    }

    public String getShoppingCart_1ItemText() {
        return getTextFromElement(shoppingCart1ItemText);
    }

    public void clickOnCheckOut() {
        clickOnElement(checkOut);
    }

    public String getSubTotalText() {
        return getTextFromElement(subTotal);
    }

    public String getTotalText() {
        return getTextFromElement(total);
    }

    public void clickOnYourCartNViewCart() {
        mouseHoverToElementAndClick(yourCart);
        clickOnElement(viewCart);
    }
    public void clickOnXsign() {
        clickOnElement(xsign);
    }

    public String getAddToCartMessageVerifyText() {

        return getTextFromElement(addToCartMessageVerify);
    }
    public void clickToAddToCart() {
        mouseHoverToElement(iPhone);
        clickOnElement(addToCart);
    }
    public void clickToVinyIdolzAddToCart() {
        mouseHoverToElement(vinlyIdolz);
        clickOnElement(addVinylToCart);
    }

    public void mouseHoverToHotdeals() {
        mouseHoverToElement(hotdealslink);
    }

    public void clickToBestSellersTab() {
        mouseHoverToElement(bestSellersTab);
        clickOnElement(bestSellersTab);
    }

    public String getNameZ_ATabText() {

        return getTextFromElement(NameZ_ATabText);
    }

    public void clickToNameZ_A() {
        mouseHoverToElement(sortByLink);
        clickOnElement(nameZ_ATab);
    }

    public String getNameA_ZTabText() {

        return getTextFromElement(nameA_ZTabText);
    }

    public void clickToNameA_Z() {
        mouseHoverToElement(sortByLink);
        clickOnElement(nameA_ZTab);
    }

    public void clickToPriceHigh_Low() {
        mouseHoverToElement(sortByLink);
        clickOnElement(priceHigh_Low);
    }

    public String getPriceHigh_LowTabText() {

        return getTextFromElement(priceHigh_LowText);
    }

    public void clickToRates() {
        mouseHoverToElement(sortByLink);
        clickOnElement(rates);
    }

    public String getRatesTabText() {

        return getTextFromElement(ratesText);
    }

    public String getBestSellersTabText() {

        return getTextFromElement(bestSellersTabTextVerify);
    }


//        public String getContactUsTabText(){
//        return getTextFromElement(contactUsTabText);
//    }
}
