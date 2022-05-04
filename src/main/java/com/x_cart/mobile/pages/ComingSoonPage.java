package com.x_cart.mobile.pages;


import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ComingSoonPage extends Utility {

    By comingSoonTabText = By.xpath("//h1[@id='page-title']");

    public String getComingSoonTabText(){
        return getTextFromElement(comingSoonTabText);
    }
}
