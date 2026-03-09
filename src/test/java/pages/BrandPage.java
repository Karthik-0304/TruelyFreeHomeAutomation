package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;
import locators.Locators;

public class BrandPage extends BaseClass {

    public void selectBrand() {

        WebElement brand = driver.findElement(Locators.BRAND_BY);

        Actions actions = new Actions(driver);
        actions.moveToElement(brand).perform();

        WebElement brandsmenu = driver.findElement(Locators.brandsMenu);
        actions.moveToElement(brandsmenu).perform();

        List<WebElement> alphabets = driver.findElements(Locators.alphabetList);

        for (WebElement alphabet : alphabets) {

            if (alphabet.getText().equals("a")) {
                alphabet.click();
            }
        }

        List<WebElement> brands = driver.findElements(Locators.brandList);

        for (WebElement braElement : brands) {

            if (braElement.getText().equals("Adidas")) {
                braElement.click();
                break;
            }
        }
    }
}