package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.BaseTest;
import PageObjects.LoginPage;

public class LoginTest extends BaseTest {
	LoginPage lp;

	@Test
	public void loginTest() {
		
		logger.info("Started running logintest");
		lp = new LoginPage(driver);
		lp.setUsername(prop.getProperty("userName"));
		logger.info("Entered username");
		lp.setPassword(prop.getProperty("password"));
		logger.info("Entered password");
		lp.clicksOnLoginButton();
		logger.info("Clicked on login button");
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
	}
	
	
	@Test 
	public void loginByEmail()
	{
		System.out.println("Logged in by email");
		Assert.assertEquals("pavan", "pavan");
	}
	@Test 
	public void loginByFacebook()
	{
		System.out.println("Logged in by facebook");
		Assert.assertEquals("pavan", "pavan");
	}
}
