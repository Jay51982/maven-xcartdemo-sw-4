package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HotDealsSalesPage extends Utility {
    /*verifySaleProductsArrangeAlphabetically

		1.1 Mouse hover on the “Hot deals” link
		1.2 Mouse hover on the “Sale”  link and click
		1.3 Verify the text “Sale”
		1.4 Mouse hover on “Sort By” and select “Name A-Z”
		1.5 Verify that the product arrange alphabetically
*/

    By hotdealslink = By.xpath("//div[@id='header-area']//span[@class='primary-title']");
    By salesTab = By.xpath("//div[@id='header-area']//span[contains(text(),'Sale')]");
    By salesTabTextVerify = By.xpath("//h1[@id='page-title']");
    By sortByLink = By.xpath("//span[@class='sort-by-label']");
    By nameA_ZTab = By.xpath("//a[normalize-space()='Name A - Z']");
    //By NameA_ZTabText = By.xpath("//span[contains(text(),'Name A - Z')]");
    By NameA_ZTabText = By.xpath("//span[contains(text(),'Name A - Z')]");

    By priceLow_High = By.xpath("//a[normalize-space()='Price Low - High']");
    By priceLow_HighText = By.xpath("//span[contains(text(),'Price Low - High')]");

    By rates = By.xpath("//a[normalize-space()='Rates']");
    By ratesText = By.xpath("//span[contains(text(),'Rates')]");

    public void mouseHoverToHotdeals(){
        mouseHoverToElement(hotdealslink);
    }
    public void clickToSalesTab(){
        mouseHoverToElement(salesTab);
        clickOnElement(salesTab);
    }
    public String getNameA_ZTabText(){

        return getTextFromElement(NameA_ZTabText);
    }
    public void clickToNameA_Z(){
        mouseHoverToElement(sortByLink);
        clickOnElement(nameA_ZTab);
            }
    public void clickToPriceLow_High(){
        mouseHoverToElement(sortByLink);
        clickOnElement(priceLow_High);
    }
    public String getPriceLow_HighTabText(){

        return getTextFromElement(priceLow_HighText);
    }

    public void clickToRates(){
        mouseHoverToElement(sortByLink);
        clickOnElement(rates);
    }
    public String getRatesTabText(){

        return getTextFromElement(ratesText);
    }
    public String getSalesTabText(){

        return getTextFromElement(salesTabTextVerify);
    }


//        public String getContactUsTabText(){
//        return getTextFromElement(contactUsTabText);
//    }
}
