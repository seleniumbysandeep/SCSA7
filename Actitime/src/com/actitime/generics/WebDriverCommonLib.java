package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib 
{
public void ElementPresentInGui(WebDriver driver) {
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
public void ElementPresent(WebDriver driver, WebElement element,String text) {
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.textToBePresentInElement(element, text));
}
}
