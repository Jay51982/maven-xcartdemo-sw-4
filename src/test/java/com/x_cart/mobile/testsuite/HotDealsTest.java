package com.x_cart.mobile.testsuite;

import com.google.common.base.Verify;
import com.x_cart.mobile.pages.HotDealsBestSellersPage;
import com.x_cart.mobile.pages.HotDealsSalesPage;
import com.x_cart.mobile.testbase.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Mouse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {
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
    public void verifySaleProductsArrangeAlphabetically(){
       hotDealsSalesPage.mouseHoverToHotdeals();
       hotDealsSalesPage.clickToSalesTab();
        String expectedMessage = "Sale";
        String actualMessage = hotDealsSalesPage.getSalesTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "Sale page not displayed");
        hotDealsSalesPage.clickToNameA_Z();
        String expectedMessage1 = "Name A - Z";
        String actualMessage2 = hotDealsSalesPage.getNameA_ZTabText();
        Assert.assertEquals(expectedMessage1, actualMessage2, "Name A-Z page not displayed");

    }
    /*2 - verifySaleProductsPriceArrangeLowToHigh()
		2.1 Mouse hover on the “Hot deals” link
		2.2 Mouse hover on the “Sale”  link and click
		2.3 Verify the text “Sale”
		2.4 Mouse hover on “Sort By” and select “Price Low-High”
		2.5 Verify that the product’s price arrange Low to High  */

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh(){
        hotDealsSalesPage.mouseHoverToHotdeals();
        hotDealsSalesPage.clickToSalesTab();
        String expectedMessage = "Sale";
        String actualMessage = hotDealsSalesPage.getSalesTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "Sale page not displayed");
        hotDealsSalesPage.clickToPriceLow_High();
        String expectedMessage1 = "Price Low - High";
        String actualMessage2 = hotDealsSalesPage.getPriceLow_HighTabText();
        Assert.assertEquals(expectedMessage1, actualMessage2, "Price Low-High page not displayed");

    }
    /*3 - verifySaleProductsArrangeByRates()
		3.1 Mouse hover on the “Hot deals” link
		3.2 Mouse hover on the “Sale”  link and click
		3.3 Verify the text “Sale”
		3.4 Mouse hover on “Sort By” and select “Rates”
		3.5 Verify that the product’s arrange Rates   */
    @Test
    public void verifySaleProductsArrangeByRates(){
        hotDealsSalesPage.mouseHoverToHotdeals();
        hotDealsSalesPage.clickToSalesTab();
        String expectedMessage = "Sale";
        String actualMessage = hotDealsSalesPage.getSalesTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "Sale page not displayed");
        hotDealsSalesPage.clickToRates();
        String expectedMessage1 = "Rates";
        String actualMessage2 = hotDealsSalesPage.getRatesTabText();
        Assert.assertEquals(expectedMessage1, actualMessage2, "Price Low-High page not displayed");

    }

   /* 4 - verifyBestSellersProductsArrangeByZToA()
		1.1 Mouse hover on the “Hot deals” link
		1.2 Mouse hover on the “Bestsellers”  link and click
		1.3 Verify the text “Bestsellers”
        1.4 Mouse hover on “Sort By” and select “Name Z-A”
       1.5 Verify that the product arrange by Z to A  */

    @Test
    public void verifyBestSellersProductsArrangeByZToA(){
        hotDealsBestSellersPage.mouseHoverToHotdeals();
        hotDealsBestSellersPage.clickToBestSellersTab();
        String expectedMessage = "Bestsellers";
        String actualMessage =  hotDealsBestSellersPage.getBestSellersTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "BestSellers page not displayed");
        hotDealsBestSellersPage.clickToNameZ_A();
        String expectedMessage1 = "Name Z - A";
        String actualMessage2 =  hotDealsBestSellersPage.getNameZ_ATabText();
        Assert.assertEquals(expectedMessage1, actualMessage2, "Name Z-A page not displayed");

    }
/*
- verifyBestSellersProductsPriceArrangeHighToLow()
		2.1 Mouse hover on the “Hot deals” link
		2.2 Mouse hover on the “Bestsellers” link and click
		2.3 Verify the text “Bestsellers”
		2.4 Mouse hover on “Sort By” and select “Price High-Low”
		2.5 Verify that the product’s price arrange High to Low
* */

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow(){
        hotDealsBestSellersPage.mouseHoverToHotdeals();
        hotDealsBestSellersPage.clickToBestSellersTab();
        String expectedMessage = "Bestsellers";
        String actualMessage =  hotDealsBestSellersPage.getBestSellersTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "BestSellers page not displayed");
        hotDealsBestSellersPage.clickToPriceHigh_Low();
        String expectedMessage1 = "Price High - Low";
        String actualMessage2 =  hotDealsBestSellersPage.getPriceHigh_LowTabText();
        Assert.assertEquals(expectedMessage1, actualMessage2, "Name Z-A page not displayed");

    }
/*verifyBestSellersProductsArrangeByRates()
		3.1 Mouse hover on the “Hot deals” link
		3.2 Mouse hover on the “Bestsellers”  link and click
		3.3 Verify the text “Bestsellers”
		3.4 Mouse hover on “Sort By” and select “Rates”
		3.5 Verify that the product’s arrange Rates

* */
    @Test
    public void verifyBestSellersProductsArrangeByRates(){
        hotDealsBestSellersPage.mouseHoverToHotdeals();
        hotDealsBestSellersPage.clickToBestSellersTab();
        String expectedMessage = "Bestsellers";
        String actualMessage = hotDealsBestSellersPage.getBestSellersTabText();
        Assert.assertEquals(expectedMessage, actualMessage, "Sale page not displayed");
        hotDealsBestSellersPage.clickToRates();
        String expectedMessage1 = "Rates";
        String actualMessage2 = hotDealsBestSellersPage.getRatesTabText();
        Assert.assertEquals(expectedMessage1, actualMessage2, "Price Low-High page not displayed");
    }

}




