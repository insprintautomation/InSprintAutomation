package com.web.automation.testng;

import com.web.automation.pageobjects.CartPage;
import com.web.automation.pageobjects.CheckoutPage;
import com.web.automation.pageobjects.InventoryPage;
import com.web.automation.pageobjects.LoginPage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PageObjects {

    protected LoginPage loginPage = new LoginPage();
    protected InventoryPage inventoryPage = new InventoryPage();
    protected CartPage cartPage = new CartPage();
    protected CheckoutPage checkoutPage = new CheckoutPage();

}