package com.utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
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
	protected String win7 = "http://192.168.0.125:5555/wd/hub";
	protected String win7ChromeAddress = "http://192.168.0.125:5555/wd/hub";
	
	
	//ALL drivers is here
	@org.testng.annotations.Parameters({"browser"})
	@BeforeTest(alwaysRun=true, groups="smokeTest")
	public WebDriver myDriver(String myBrowser) throws MalformedURLException {
		
		//System.out.println("browser is_" + myBrowser +"; driver is null?_" + ( driver== null));
		try {
			Thread.sleep(2000);
			System.out.println("waiting for initialising driver");
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		if(myBrowser.equals("win7IE8")) {
			
			System.out.println("runing in:(win7IE8)_" + myBrowser);
			capabilities = new DesiredCapabilities("*iexplore", "8", Platform.VISTA);
			
			//capabilities = DesiredCapabilities.internetExplorer();
			
			//capabilities.setPlatform(Platform.VISTA);
			capabilities.setJavascriptEnabled(true);
			//capabilities.setBrowserName("*iexplore");
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			
			try {
				 driver= new RemoteWebDriver(new URL(win7), capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
			
			return driver;
		}else if (myBrowser.equals("Win7Chrome")) {
			System.out.println("runing in:(chromeWin7) _" + myBrowser);
			//System.setProperty("webdriver.chrome.driver", "//lib//chromedriver.exe");
			
			capabilities = new DesiredCapabilities("chrome", "33", Platform.VISTA);
			capabilities.setJavascriptEnabled(true);
			capabilities.setBrowserName("chrome");
			//capabilities.setBrowserName("Chrome");
			
			//capabilities.setCapability(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, true);
			
			
			try {
				driver = new RemoteWebDriver(new URL(win7), capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
			
			System.out.println("Driver is " + capabilities.getBrowserName());
			
			return driver;
		}else if(myBrowser.equals("win7firefox")) {
			capabilities = new DesiredCapabilities("firefox", "27", Platform.VISTA);
			capabilities.setJavascriptEnabled(true);
			
			driver = new RemoteWebDriver(new URL(win7), capabilities);
			
			driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
			
			return driver;
		}else{
			System.out.println("Browser Parameter is wrong!!");
			
			return driver;
		}
	}

	//always close driver
	@AfterTest(alwaysRun=true)
	public void closeEachDriver() {
		if(driver != null){
			driver.close();
			System.out.println("driver is closed()");
		}
	}
	
	
}
