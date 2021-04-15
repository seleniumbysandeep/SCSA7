package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;
import com.actitime.generics.WebDriverCommonLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		FileLib f=new FileLib();
		String CustomerName = f.getExcelData("CreateCustomer", 1, 0);
		String customerDescp = f.getExcelData("CreateCustomer", 1, 1);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.getTasktab().click();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustomerOption().click();
		t.getCustomerNametbx().sendKeys(CustomerName);
		t.getCustomerDesctbx().sendKeys(customerDescp);   
		t.getSelectCustomerDD().click();    
		t.getOurcompany().click();
		t.getCreateCustomerBtn().click();
		WebDriverCommonLib w=new WebDriverCommonLib();
		w.ElementPresent(driver, t.getActualCustCreated(),CustomerName);
		String ActualText = t.getActualCustCreated().getText();
		Assert.assertEquals(ActualText, CustomerName);
		Reporter.log("Customer is created successfully");

	}
}
