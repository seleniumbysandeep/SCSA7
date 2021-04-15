package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	
@FindBy(id="logoutLink")
private WebElement lgout;

@FindBy(xpath="//div[.='Tasks']")
private WebElement tasktab;

public EnterTimeTrackPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setLgout() {
	 lgout.click();;
}

public WebElement getTasktab() {
	return tasktab;
}

}
