package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import locators.Locators;

public class AccountPage extends BaseClass {

	public void logout(){

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    Actions actions = new Actions(driver);

	    WebElement profile = wait.until(
	        ExpectedConditions.visibilityOfElementLocated(Locators.PROFILE_BTN));

	    actions.moveToElement(profile).perform();

	    WebElement logout = wait.until(
	        ExpectedConditions.elementToBeClickable(Locators.LOGOUT_BTN));

	    actions.moveToElement(logout).click().perform();
	}
}