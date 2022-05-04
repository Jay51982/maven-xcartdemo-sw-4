package com.x_cart.mobile.pages;


import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ContactUsPage extends Utility {

    By contactUsTabText = By.xpath("//h1[@id='page-title']");

    public String getContactUsTabText(){
        return getTextFromElement(contactUsTabText);
    }
}
