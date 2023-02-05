package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.AddCustomerPage;
import com.inetbanking.pageObject.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass
{
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		
		addcust.clickAddNewcustomer();
		
		logger.info("providing customer details.....");
		
		addcust.custName("Lukesh");
		addcust.custGender("male");
		addcust.custdob("10", "13", "1990");
		Thread.sleep(3000);
		addcust.custaddress("INDIA");
		addcust.custCity("YTL");
		addcust.custState("Maharashtra");
		addcust.custpinno("4453013");
		addcust.custtelephoneNo("7385993597");
		
		
		String email= randomestring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custPassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean res= driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res == true) 
		{
			Assert.assertTrue(true);
			logger.info("Test case Passed....");
		}
		else 
		{
			logger.info("Test case Failed....");
			captureScreen(driver, "AddCustomerPage");
			Assert.assertTrue(false);
		}
	}
}
