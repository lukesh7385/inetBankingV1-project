package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//input[@name='uid']")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath ="//input[@name='btnLogin']")
	@CacheLookup
	WebElement linkLogin;
	
	@FindBy(xpath="//a[normalize-space()='Log out']")
	@CacheLookup
	WebElement linkLogout;
	
	public void setUserName(String uname) {
		
		txtUserName.sendKeys(uname);
					
	}
	
	public void setPassword(String pwd) {
		
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit() {
		
		linkLogin.click();
	}
	
	public void clickLogout()
	{
		linkLogout.click();
	}

}
