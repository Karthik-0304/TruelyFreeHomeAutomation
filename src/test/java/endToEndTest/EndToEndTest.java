package endToEndTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseClass;
import locators.Locators;

public class EndToEndTest extends BaseClass {
	String productName = "COOFANDY Mens Muscle";

	@Test(priority = 1)
	public void login() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(Locators.LOGIN_BTN).click();
		driver.findElement(Locators.CREATE_ACC).click();
		driver.findElement(Locators.SELECT_COUNTR).click();
		driver.findElement(Locators.IND_NO).click();
		String noString="  9382003423";
		WebElement phone = wait.until(ExpectedConditions.elementToBeClickable(Locators.registerPhoneInput));
		phone.click();
		for(char c : noString.toCharArray())
        {
            phone.sendKeys(String.valueOf(c));
            Thread.sleep(100);
        }
		wait.until(ExpectedConditions.elementToBeClickable(Locators.CONTINUE_BTN)).click();
		Thread.sleep(5000);
		WebElement otpfiledElement=wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.OTP_NO));
		otpfiledElement.sendKeys("1111");
		driver.findElement(Locators.FIRST_NAME).sendKeys("Karthik");
		driver.findElement(Locators.LAST_NAME_BY).sendKeys("Siva");
		driver.findElement(Locators.EMAIL_IF_BY).sendKeys("karthiks27292@gmail.com");
		wait.until(ExpectedConditions.elementToBeClickable(Locators.CREATE_ACC)).click();

	}
	
	@Test(priority = 2)
	public void Brandselection() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(Locators.LOGIN_BTN).click();
		//driver.findElement(Locators.CREATE_ACC).click();
		driver.findElement(Locators.SELECT_COUNTR).click();
		driver.findElement(Locators.IND_NO).click();
		String noString="  9382003423";
		WebElement phone = wait.until(ExpectedConditions.elementToBeClickable(Locators.ENTER_NO_BY));
		phone.click();
		for(char c : noString.toCharArray())
        {
            phone.sendKeys(String.valueOf(c));
            Thread.sleep(100);
        }
		wait.until(ExpectedConditions.elementToBeClickable(Locators.CONTINUE_LOGIN_BY)).click();
		Thread.sleep(5000);
		WebElement otpfiledElement=wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.OTP_NO));
		otpfiledElement.sendKeys("1111");
		
		WebElement brand=driver.findElement(Locators.BRAND_BY);
		Actions actions = new Actions(driver);
		actions.moveToElement(brand).perform();
		WebElement brandsmenu = driver.findElement(Locators.brandsMenu);
		actions.moveToElement(brandsmenu).build().perform();
		List<WebElement> alphabets = driver.findElements(Locators.alphabetList);
		wait.until(ExpectedConditions.visibilityOfAllElements(alphabets));
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
	
	@Test(priority = 3)
	public void ProductSelection() throws InterruptedException {
		Brandselection();
		List<WebElement> listOfItems = driver.findElements(Locators.productList);
		for (WebElement element : listOfItems) {
			if (element.getText().contains(productName)) {
				element.click();
				break;
			}
		}
		
	}
	
	@Test
	public void AddTocart() throws InterruptedException {
		ProductSelection();
		driver.findElement(Locators.ADD_TO_CART_BTN).click();
	}
	
	@Test
	public void VerifyAddtoCart() throws InterruptedException {
		AddTocart();
		driver.findElement(Locators.CART_BTN_BY).click();
		
	}
	
	@Test
	public void Checkout() throws InterruptedException {
		VerifyAddtoCart();
		driver.findElement(Locators.CHECKOUT_BY).click();
		
	}
	
	@Test
	public void Address() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		String addString="24 Battery Pl";
		String fnameString="Karthik";
		String lnameString="Siva";
		String pincodeString="10004";
		
		Checkout();
		WebElement fnamElement= wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.FIRST_NAME_BY));
		fnamElement.sendKeys(fnameString);
		driver.findElement(Locators.LAST_NAME_BY2).sendKeys(lnameString);
		driver.findElement(Locators.ADDRESS_BY).sendKeys(addString);
		driver.findElement(Locators.PINCODE_BY).sendKeys(pincodeString);
		driver.findElement(Locators.CITY_ARR_BY).click();
		driver.findElement(Locators.NEW_YORK_BY).click();
		driver.findElement(Locators.SAVE_AND_CONTINUE_BY).click();
		
		
	}
	
	@Test
	public void Payment() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		String cardnoString="4242 4242 4242 4242";
		String cvvString="111";
		String expirayString="0528";
		
		
		Address();
		Thread.sleep(2000);
		WebElement frame1=driver.findElement(Locators.IFRAM_BY);
		driver.switchTo().frame(frame1);
		driver.findElement(Locators.CARDNO_BY).sendKeys(cardnoString);
		driver.switchTo().defaultContent();
		
		WebElement frame2=driver.findElement(Locators.Iframe_2);
		driver.switchTo().frame(frame2);
		driver.findElement(Locators.CVV_BY).sendKeys(cvvString);
		driver.switchTo().defaultContent();
		
		driver.findElement(Locators.EXPIRYDATE_BY).sendKeys(expirayString);
		driver.findElement(Locators.CARDHOLDENAME_BY).sendKeys("Karthik");
		driver.findElement(Locators.PALCEORDER_BTN_BY).click();
		
	}
	
	@Test
	public void logout() throws InterruptedException {
		
		login();
		driver.findElement(By.xpath("//a[contains(@href,'account')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		
	}
	
}
