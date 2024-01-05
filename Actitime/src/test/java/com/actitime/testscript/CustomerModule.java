package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule 
{
	@Test
	public void CreateCustomer()
	{
		Reporter.log("create Customer",true);
	}
	@Test
	public void DeleteCustomer()
	{
		Reporter.log("Delete Customer", true);
	}

}
