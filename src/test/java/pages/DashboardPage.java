package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

	public DashboardPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"dashboard\"]/div[2]/div[3]/div/div[1]")
	private WebElement dashboardMessage;

	public WebElement getDashboardMessage() {
		return dashboardMessage;
	}
}
