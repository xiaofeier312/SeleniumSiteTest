package com.utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.List;
import java.util.Set;

import mx4j.tools.config.DefaultConfigurationBuilder.New;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;

public class MyDriver  {
	
	protected WebDriver driver = null;
	protected DesiredCapabilities capabilities = null;
	protected String win7IE8Address = "http://192.168.0.118:4442/wd/hub";
	protected String win7ChromeAddress = "http://192.168.0.106:4443/wd/hub";
	
	@Parameters({"emailName"})
	public WebDriver myDriver(String BrowserName) {
		
		if(BrowserName.equals("Win7IE8")) {
			capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setJavascriptEnabled(true);
			capabilities.setBrowserName("IE8");
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			
			try {
				 driver= new RemoteWebDriver(new URL(win7IE8Address), capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return driver;
		}else if (BrowserName.equals("Win7Chrome")) {
			capabilities = DesiredCapabilities.chrome();
			capabilities.setJavascriptEnabled(true);
			capabilities.setBrowserName("Chrome");
			
			try {
				driver = new RemoteWebDriver(new URL(win7ChromeAddress), capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return driver;
		}else {
			System.out.println("Browser Parameter is wrong!!");
			
			return driver;
		}
	}

	
	
	
}
