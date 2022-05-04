package com.x_cart.mobile.pages;


import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class NewPage extends Utility {

    By newTabText = By.xpath("//*[@id=\"page-title\"]");

    public String getNewTabText(){
        return getTextFromElement(newTabText);
    }
}
