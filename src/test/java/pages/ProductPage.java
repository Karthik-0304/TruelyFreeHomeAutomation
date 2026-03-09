package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import base.BaseClass;
import locators.Locators;

public class ProductPage extends BaseClass {

    public void selectProduct(String productName){

        List<WebElement> listOfItems = driver.findElements(Locators.productList);

        for (WebElement element : listOfItems){

            if(element.getText().contains(productName)){

                element.click();
                break;
            }
        }
    }

    public void addToCart(){

        click(Locators.ADD_TO_CART_BTN);
    }
}