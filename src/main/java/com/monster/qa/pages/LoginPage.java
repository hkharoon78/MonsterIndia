package com.monster.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.monster.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id="username_login")
	WebElement username;
	@FindBy(id="password_input")
	WebElement password;
	@FindBy(id="button")
	WebElement loginBtn;
	@FindBy(xpath="//a[text()='Sign Up' and @class='btn btn_purple nobg pull-left hidden-xs hidden-sm']")
	WebElement signUpBtn;
	@FindBy(xpath="//img[@itemprop='logo']")
	WebElement monsterLogo;
	
	//initialization the page objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitel()
	{
		return driver.getTitle();
	}
	
	public boolean validateMonsterImage()
	{
		return monsterLogo.isDisplayed();
	}
	public HomePage login(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	

}
