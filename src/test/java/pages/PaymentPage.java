package pages;

import org.openqa.selenium.WebElement;

import base.BaseClass;
import locators.Locators;

public class PaymentPage extends BaseClass {

    public void makePayment() throws InterruptedException {

        String cardnoString = "4242 4242 4242 4242";
        String cvvString = "111";
        String expirayString = "0528";

        Thread.sleep(2000);

        WebElement frame1 = driver.findElement(Locators.IFRAM_BY);
        driver.switchTo().frame(frame1);
        type(Locators.CARDNO_BY, cardnoString);
        driver.switchTo().defaultContent();

        WebElement frame2 = driver.findElement(Locators.Iframe_2);
        driver.switchTo().frame(frame2);
        type(Locators.CVV_BY, cvvString);
        driver.switchTo().defaultContent();

        type(Locators.EXPIRYDATE_BY, expirayString);
        type(Locators.CARDHOLDENAME_BY, "Karthik");

        
    }
    public void placepayment() {
    	click(Locators.PALCEORDER_BTN_BY);
	}
}