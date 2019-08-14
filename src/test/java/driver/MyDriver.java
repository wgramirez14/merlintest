package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class MyDriver {

	private WebDriver driver;

	public MyDriver() {
		
		String driverPath = "C:\\eclipse-jee-2018-09-win32-x86_64\\workspace\\automationResources\\drivers\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("test-type");
		options.addArguments("--start-maximized");
			options.addArguments("--disable-web-security");
		options.addArguments("--allow-running-insecure-content");*/
		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\williamr\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");

		/*FirefoxOptions firefoxOptions = new FirefoxOptions();
		/*firefoxOptions.addArguments("disable-infobars");
		firefoxOptions.addArguments("test-type");
		firefoxOptions.addArguments("--start-maximized");
		/*firefoxOptions.addArguments("--disable-web-security");
		firefoxOptions.addArguments("--allow-running-insecure-content");*/
		//driver = new FirefoxDriver();
	}

	public WebDriver getDriver() {
		return this.driver;
	}
}
