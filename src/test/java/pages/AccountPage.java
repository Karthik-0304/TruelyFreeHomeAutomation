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

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    Actions actions = new Actions(driver);

	    WebElement profile = wait.until(
	        ExpectedConditions.visibilityOf(driver.findElement(Locators.PROFILE_BTN)));

	    actions.moveToElement(profile).build().perform();
	    
//	    WebElement movetoElement=wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.toscrollBy));
//	    actions.moveToElement(movetoElement).build().perform();

	    WebElement logout = wait.until(
	        ExpectedConditions.elementToBeClickable(Locators.LOGOUT_BTN));

	    actions.moveToElement(logout).click().perform();
	    
	    WebElement logoutbtn = wait.until(
		        ExpectedConditions.elementToBeClickable(Locators.logoutBy));
	    
	    actions.moveToElement(logoutbtn).click().perform();
	}
}