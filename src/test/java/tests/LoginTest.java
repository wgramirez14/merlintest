package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void login () {
		
		LoginPage loginPage = getLoginPage();
		loginPage.login();
		
		
		//DashboardPage dashboardPage = loginPage.login();
		
		Assert.assertTrue(loginPage.getMessage().getText().contains("As part of our commitment to maintaining a secure platform, we review new accounts before granting full access"));
		
		
	}
}
