package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import locators.Locators;

public class LoginPage extends BaseClass {

    public void loginUser() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        click(Locators.LOGIN_BTN);
        click(Locators.SELECT_COUNTR);
        click(Locators.IND_NO);

        String noString = "9382003423";

        WebElement phone = wait.until(
        ExpectedConditions.elementToBeClickable(Locators.ENTER_NO_BY));

        phone.sendKeys(noString);

        click(Locators.CONTINUE_LOGIN_BY);

        Thread.sleep(3000);

        WebElement otp = wait.until(
        ExpectedConditions.visibilityOfElementLocated(Locators.OTP_NO));

        otp.sendKeys("1111");
    }
}