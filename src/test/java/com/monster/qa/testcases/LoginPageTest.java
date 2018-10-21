package com.monster.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.monster.qa.base.TestBase;
import com.monster.qa.pages.HomePage;
import com.monster.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		 loginPage=new LoginPage();
	}
	@Test(priority=1)
	public void loginPageTitelTest()
	{
		String title=loginPage.validateLoginPageTitel();
		
		Assert.assertEquals(title, "Sign in to Monsterindia.com - Find & Apply Jobs Online ");
		
	}
	@Test(priority=2)
	public void monsterPageLogo()
	{
		boolean flag=loginPage.validateMonsterImage();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void loginTest()
	{
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
