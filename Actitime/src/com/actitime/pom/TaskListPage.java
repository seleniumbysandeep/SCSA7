package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[.='Add New']")
private WebElement addNewBtn;

@FindBy(xpath="//div[.='+ New Customer']")
private WebElement newCustomerOption;

@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement customerNametbx;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement CustomerDesctbx;

@FindBy(xpath="(//div[contains(text(),'Select Customer')])[1]")
private WebElement selectCustomerDD;

@FindBy(xpath="//div[@class='itemRow cpItemRow ' and text()='Our company']")
private WebElement ourcompany;

@FindBy(xpath="//div[.='Create Customer']")
private WebElement CreateCustomerBtn;

@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
private WebElement ActualCustCreated;

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getActualCustCreated() {
	return ActualCustCreated;
}

public WebElement getAddNewBtn() {
	return addNewBtn;
}

public WebElement getNewCustomerOption() {
	return newCustomerOption;
}

public WebElement getCustomerNametbx() {
	return customerNametbx;
}

public WebElement getCustomerDesctbx() {
	return CustomerDesctbx;
}

public WebElement getSelectCustomerDD() {
	return selectCustomerDD;
}

public WebElement getOurcompany() {
	return ourcompany;
}

public WebElement getCreateCustomerBtn() {
	return CreateCustomerBtn;
}



}
