package com.x_cart.mobile.pages;


import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By shippingTab = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//a[@href='shipping.html']//span[contains(text(),'Shipping')]");
    By newTab = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[4]/a/span");
    By comingSoonTab = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[5]/a/span");
    By contactUsTab = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[6]/a/span");

//    public void clickOnLoginLink(){
//        clickOnElement(loginLink);
//    }
//    public void clickOnRegisterLink(){
//
//        clickOnElement(registerLink);
//    }

    public void clickOnshippingTab(){
        clickOnElement(shippingTab);
    }

    public void clickOnNewTab(){
        clickOnElement(newTab);
    }

    public void clickOnComingSoonTab(){
        clickOnElement(comingSoonTab);
    }

    public void clickOnContactUsTab(){
        clickOnElement(contactUsTab);
    }

//    public void clickOnBooksTab(){
//        clickOnElement(booksTab);
//    }
//
//    public void clickOnJewelaryTab(){
//        clickOnElement(jewelryTab);
//    }
//
//    public void clickOnGiftCardsTab(){
//        clickOnElement(giftCardsTab);
//    }
//}

}
