package com.utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyDriver  {
	
	protected WebDriver driver = null;
	protected DesiredCapabilities capabilities = null;
	protected String win7IE8Address = "http://192.168.0.125:5555/wd/hub";
	protected String win7ChromeAddress = "http://192.168.0.125:5555/wd/hub";
	
	
	//ALL drivers is here
	@org.testng.annotations.Parameters({"browser"})
	@BeforeTest(alwaysRun=true, groups="smokeTest")
	public WebDriver myDriver(String myBrowser) {
		
		System.out.println("browser is_" + myBrowser +"; driver is null?_" + ( driver== null));
		
		if(myBrowser.equals("win7IE8")) {
			capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setPlatform(Platform.VISTA);
			capabilities.setJavascriptEnabled(true);
			capabilities.setBrowserName("*iexplore");
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			
			try {
				 driver= new RemoteWebDriver(new URL(win7IE8Address), capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			return driver;
		}else if (myBrowser.equals("Win7Chrome")) {
			capabilities = DesiredCapabilities.chrome();
			capabilities.setJavascriptEnabled(true);
			capabilities.setBrowserName("Chrome");
			
			try {
				driver = new RemoteWebDriver(new URL(win7ChromeAddress), capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			return driver;
		}else {
			System.out.println("Browser Parameter is wrong!!");
			
			return driver;
		}
	}

	//alwasy close driver
	@AfterTest(alwaysRun=true)
	public void closeEachDriver() {
		if(driver != null){
			driver.close();
			System.out.println("driver is closed()");
		}
	}
	
	
}
