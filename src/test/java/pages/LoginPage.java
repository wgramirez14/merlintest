package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		
		super(driver);
		driver.get("https://merlinjobs.com/employer/login");
	}
	
	@FindBy(id = "email")
	private WebElement emailAddressField;
	
	@FindBy(id = "password1")
	private WebElement passwordField;
	
	@FindBy(id = "create")
	private WebElement loginButton;

	@FindBy(xpath = "/html/body/merl-floating-banner/div/div[1]")
	private WebElement message;
	
	
	public WebElement getEmailAddressField() {
		return emailAddressField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	
	public WebElement getMessage() {
		return message;
	}

	public void login () {
		
		getWait().withTimeout(Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(emailAddressField));
		emailAddressField.sendKeys("wgramirez29@gmail.com");
		
		getWait().withTimeout(Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(passwordField));
		passwordField.sendKeys("F60201memo*");
		
		getWait().withTimeout(Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
		
		

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//waitForPageLoad(getDriver());
		
		//return new DashboardPage(getDriver());
	}
}
