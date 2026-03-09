package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--force-device-scale-factor=1");
		///options.addArguments("--disable-notifications");
		driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://trulyfreehome.dev/");
	}
	
	public void click(By locator) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

	    element.click();
	}
	public void type(By locator, String text) {
	    driver.findElement(locator).sendKeys(text);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
