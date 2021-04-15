package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static WebDriver driver;
@BeforeClass
public void openBrowser() {
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverCommonLib w=new WebDriverCommonLib();
	w.ElementPresentInGui(driver);
	
}
@AfterClass
public void closeBrowser() {
	driver.close();
}
@BeforeMethod
public void login() throws IOException {
	FileLib f=new FileLib();
	String URL = f.getPropertyData("url");
	String un = f.getPropertyData("username");
	String pw = f.getPropertyData("password");
	driver.get(URL);
	LoginPage l=new LoginPage(driver);
	l.setLogin(un, pw);
}

@AfterMethod
public void logout() {
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setLgout();
}

}
