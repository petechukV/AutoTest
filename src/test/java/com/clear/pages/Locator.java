package com.clear.pages;

import org.openqa.selenium.WebDriver;

public class Locator extends ClearMainPage {

    public Locator(WebDriver driver) {
        super(driver);
    }
    static String LOCATOR_SEARCH_PAGE = "//input[@id='search']";
    static String LOCATOR_SEARCH_BUTTON = "//button[@class='action search']";
    static String LOCATOR_SEARCH_HOME = "//a[@id='open-search']";
    static String LOCATOR_SEARCH_RESULT = "//ol[@class='products list items product-items']";

    static String LOCATOR_HOME_MAIL = "//button[@id='buttonClose-right-first']";
    static String LOCATOR_HOME_MENU = "//header/div[1]/button[1]";
    static String LOCATOR_HOME_POLICE = "//button[@id='btn-cookie-allow']";
    static String LOCATOR_HOME_CART = "//a[@class='action showcart']";
    static String LOCATOR_HOME_CARD_VIEW = "//span[contains(text(),'View Cart')]";
    static String LOCATOR_HOME_ACCOUNT = "//div/a[@class='account']";

    static String LOCATOR_CATEGORY_SORT = "//span[@class='current']";
    static String LOCATOR_CATEGORY_PRODUCT = "//li[@class='productItem']";

    static String LOCATOR_PRODUCT = "//ol[1]/li[1]/a[@class='product photo product-item-photo']";
    static String LOCATOR_PRODUCT_CART = "//button[@id='product-addtocart-button']";

    static String LOCATOR_CHECKOUT_SECURE = "//span[contains(text(),'Checkout Securely')]";
    static String LOCATOR_CHECKOUT_ADDRESS = "//button[@class='addres_manually']";
    static String LOCATOR_CHECKOUT_SHIPPING_VENDOR = "//ul[1]/li[1]/label[1]";
    static String LOCATOR_CHECKOUT_CONTINUE = "//button[contains(text(),'Continue')]";
    static String LOCATOR_CHECKOUT_PAYMENT_CARD = "//input[@id='vnecoms_stripe_cc_number']";
    static String LOCATOR_CHECKOUT_PAYMENT_DATE = "//input[@id='vnecoms_stripe_expiration']";
    static String LOCATOR_CHECKOUT_PAYMENT_YER = "//input[@id='vnecoms_stripe_expiration_yr']";
    static String LOCATOR_CHECKOUT_PAYMENT_CV2 = "//input[@id='vnecoms_stripe_cc_cid']";
    static String LOCATOR_CHECKOUT_PAYMENT_MAKE = "//button[@class='button action primary']";

    static String LOCATOR_LOGIN_LOG = "//input[@id='ajaxlogin-email']";
    static String LOCATOR_LOGIN_PAS = "//input[@id='ajaxlogin-pass']";
    static String LOCATOR_LOGIN_BUTTON = "//button[@id='ajaxlogin-send']";

    static String LOCATOR_LOGIN_HOME_LOG = "//input[@id='email']";
    static String LOCATOR_LOGIN_HOME_PAS = "//input[@id='pass']";
    static String LOCATOR_LOGIN_HOME_BUTTON = "//button[@class='action login primary']";
    static String LOCATOR_LOGOUT_SINGUP = "//a[contains(text(),'Sign Out')]";

    static String LOCATOR_CREATE_BUTTON = "//span[contains(text(),'Sign up')]";
    static String LOCATOR_CREATE_FIRSTNAME = "//input[@id='firstname']";
    static String LOCATOR_CREATE_LASTNAME = "//input[@id='lastname']";
    static String LOCATOR_CREATE_MAIL = "//input[@id='email_address']";
    static String LOCATOR_CREATE_PASS = "//input[@id='password']";
    static String LOCATOR_CREATE_CONFPASS = "//input[@id='password-confirmation']";
    static String LOCATOR_CREATE_CBUTTON = "//button[@class='action submit primary']";
    static String LOCATOR_CREATE_POLICE = "//input[@id='privacy_policy']";
}