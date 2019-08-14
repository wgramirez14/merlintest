package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

	private WebDriver driver;
	private WebDriverWait wait;

	public BasePage(WebDriver pDriver) {
		PageFactory.initElements(pDriver, this);
		wait = new WebDriverWait(pDriver, 10);
		driver = pDriver;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void dispose() {
		if (driver != null) {
			driver.quit();
		}
	}
	
	public void waitForPageLoad(WebDriver driver) {
		System.out.println("Wating for ready state complete");
		(new WebDriverWait(driver, 5)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				JavascriptExecutor js = (JavascriptExecutor) d;
				String readyState = js.executeScript("return document.readyState").toString();
				System.out.println("Ready State: " + readyState);
				return (Boolean) readyState.equals("complete");
			}
		});
	}
}