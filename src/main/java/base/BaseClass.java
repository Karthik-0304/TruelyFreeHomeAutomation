package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
