package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import locators.Locators;

public class CheckoutPage extends BaseClass {

    public void checkout(){

        click(Locators.CHECKOUT_BY);
    }

    public void placeOrder(){

        click(Locators.PALCEORDER_BTN_BY);
    }
    
    public void Address() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String addString = "24 Battery Pl";
        String fnameString = "Karthik";
        String lnameString = "Siva";
        String pincodeString = "10004";

        WebElement fnamElement = wait.until(
            ExpectedConditions.visibilityOfElementLocated(Locators.FIRST_NAME_BY));

        fnamElement.sendKeys(fnameString);

        type(Locators.LAST_NAME_BY2, lnameString);
        type(Locators.ADDRESS_BY, addString);
        type(Locators.PINCODE_BY, pincodeString);

        click(Locators.CITY_ARR_BY);
        click(Locators.NEW_YORK_BY);
        click(Locators.SAVE_AND_CONTINUE_BY);
    }
}