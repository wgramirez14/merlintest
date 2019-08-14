package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import driver.MyDriver;
import pages.LoginPage;


public class BaseTest {

	protected MyDriver driver;
	protected LoginPage loginPage;

	@BeforeTest(alwaysRun = true)
	public void beforeSuite() {
		
		driver = new MyDriver();
		loginPage = new LoginPage(driver.getDriver());
	}

   @AfterTest(alwaysRun = true)
	public void afterSuite() {
		loginPage.dispose();
		driver.getDriver().quit();
	}
   
   public LoginPage getLoginPage() {
		return loginPage;
	}
}
