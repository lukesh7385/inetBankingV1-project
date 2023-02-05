package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[normalize-space()='New Customer']")
	@CacheLookup
	WebElement lnkAddCustomer;
	
	@FindBy(how=How.XPATH, using="//input[@name='name']")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how=How.NAME, using="rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how=How.NAME, using="dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how=How.NAME, using="addr")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(how=How.NAME, using="city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(how=How.NAME, using="state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(how=How.NAME, using="pinno")
	@CacheLookup
	WebElement txtPIN;
	
	@FindBy(how=How.NAME, using="telephoneno")
	@CacheLookup
	WebElement txtTelephoneNO;
	
	@FindBy(how=How.NAME, using="emailid")
	@CacheLookup
	WebElement txtEmailid;
	
	@FindBy(how=How.XPATH, using="//input[@name='password' and @onblur='validatepassword();' ]")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(how=How.XPATH, using="//input[@value='Submit' and @name='sub']")
	@CacheLookup
	WebElement btnSubmit;
	
	
	public void clickAddNewcustomer()
	{
		lnkAddCustomer.click();
	}
	
	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
	}
	
	public void custGender(String cgender)
	{
		rdGender.click();
	}
	
	public void custdob(String mm, String dd, String yy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void custaddress(String caddress)
	{
		txtAddress.sendKeys(caddress);
	}
	
	public void custCity(String ccity)
	{
		txtCity.sendKeys(ccity);
	}
	
	public void custState(String cstate)
	{
		txtState.sendKeys(cstate);
	}
	
	public void custpinno(String cpinno)
	{
		txtPIN.sendKeys(String.valueOf(cpinno));
	}
	
	public void custtelephoneNo(String ctelephone)
	{
		txtTelephoneNO.sendKeys(ctelephone);
	}
	
	public void custemailid(String cemailid)
	{
		txtEmailid.sendKeys(cemailid);
	}
	
	public void custPassword(String cpassword)
	{
		txtpassword.sendKeys(cpassword);
	}
	
	public void custsubmit() {
		btnSubmit.click();
	}
	
}
