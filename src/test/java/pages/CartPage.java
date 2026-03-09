package pages;

import base.BaseClass;
import locators.Locators;

public class CartPage extends BaseClass {

    public void openCart(){

        click(Locators.CART_BTN_BY);
    }
}