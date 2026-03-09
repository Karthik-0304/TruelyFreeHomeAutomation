package locators;


import org.openqa.selenium.By;

public class Locators {
	
	public static final By LOGIN_BTN=By.xpath("//div[@data-testid='login-account']");
	
	public static final By CREATE_ACC=By.xpath("//button[text()='Create Account']");
	
	public static final By MOBILE_NO=By.xpath("//input[@type='tel']");
	
	public static final By ENTER_NO_BY=By.id("loginPhoneInput");
	
	public static final By CONTINUE_LOGIN_BY=By.xpath("//button[@datatestid='continue-login']");
	
	public static final By SELECT_COUNTR=By.className("selected-flag");
	
	public static final By IND_NO=By.xpath("//li[@data-country-code='in']");
	
	public static final By registerPhoneInput = By.id("regPhoneInput");
	
	public static final By CONTINUE_BTN=By.xpath("//button[text()='CONTINUE']");
	
	public static final By OTP_NO=By.xpath("//input[@type='tel']");
	
	public static final By FIRST_NAME=By.xpath("//input[@data-testid='first-name-input']");
	
	public static final By LAST_NAME_BY=By.xpath("//input[@data-testid='last-name-input']");
	
	public static final By EMAIL_IF_BY=By.xpath("//input[@data-testid='email-input']");
	
	public static final By CREATE_ACC_BY=By.xpath("//button[text()='Create Account']");
	
	public static final By BRAND_BY=By.xpath("//span[text()='Brands']");

	public static final By brandsMenu = By.xpath("//div[contains(@class,'megamenu_container')]//nav//ul//li/span");

	public static final By alphabetList = By.xpath("//div[contains(@class,'alphabet_column')]//div");

	public static final By brandList = By.xpath("//div[contains(@class,'brands_list_column')]//div//a//p");
	
	public static final By productList = By.xpath("//div[@data-testid='category-products']//div//h2");
	
	public static final By ADD_TO_CART_BTN=By.id("add-to-cart-button");
	
	public static final By CART_BTN_BY=By.xpath("//li[@title='Cart']");
	
	public static final By CHECKOUT_BY=By.xpath("//button[text()='Proceed to Checkout']");
	
	public static final By FIRST_NAME_BY=By.id("firstName");
	
	public static final By LAST_NAME_BY2=By.id("lastName");
	
	public static final By ADDRESS_BY=By.xpath("//input[@data-testid='address']");
	
	public static final By PINCODE_BY=By.id("zipCode");
	
	public static final By CITY_ARR_BY=By.xpath("//div[contains(@class,'creatable-select-arrow')]");
	
	public static final By NEW_YORK_BY=By.xpath("//div[contains(@class,'creatable-select-option') and text()='New York']");
	
	public static final By SAVE_AND_CONTINUE_BY=By.xpath("//button[text()='Save and Continue']");
	
	public static final By IFRAM_BY=By.xpath("//iframe[contains(@id,'spreedly-number-frame')]");
	
	public static final By CARDNO_BY=By.id("card_number");
	
	public static final By Iframe_2=By.xpath("//iframe[contains(@id,'spreedly-cvv-frame')]");
	
	public static final By CVV_BY=By.id("cvv");
	
	public static final By EXPIRYDATE_BY=By.id("expiry_date");
	
	public static final By CARDHOLDENAME_BY=By.id("full_name");
	
	public static final By PALCEORDER_BTN_BY=By.xpath("//button[@type='button' and contains(text(),'Place Your Order')]");
	
	public static By PROFILE_BTN = By.id("profileBtn");
	
	public static By LOGOUT_BTN = By.id("logoutBtn");
	
}
