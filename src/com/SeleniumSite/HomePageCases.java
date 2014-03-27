package com.SeleniumSite;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageFunc.HomePage;
import com.pageFunc.SeleniumWebdriverPage;

public class HomePageCases {
	
//	public static void main(String[] args) {
//		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
//		
//		
//		DesiredCapabilities myIECapabiliy = DesiredCapabilities.internetExplorer();
//		myIECapabiliy.setJavascriptEnabled(true);
//		//myIECapabiliy.setBrowserName("internal explorer");
//		myIECapabiliy.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//		//myIECapabiliy.setCapability("webdriver.ie.driver", "C:\\IEDriverServer.exe");
//		
//		WebDriver driver=null;
//		try {
//			System.out.println("Case ID: 0000001");
//			//System.setProperty("webdriver.ie.driver", "C:/IEDriverServer.exe");
//			System.out.println(System.getProperty("webdriver.ie.driver"));
//			
//			
//			driver = new RemoteWebDriver(new URL("http://192.168.0.118:4442/wd/hub"), myIECapabiliy);
//						
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//						
//			HomePage homePage;
//			
//			homePage = new HomePage(driver);
//			Assert.assertEquals(homePage.verifyHomePage(), true);
//			
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//
//		}
//		//WebDriver driver = new InternetExplorerDriver();
//		
//
//	}
	
	//Case ID: 001
	@org.testng.annotations.Parameters("emailName")
	@Test
	public void verifyHome(String myEmailString) throws MalformedURLException {
		System.setProperty("webdriver.ie.driver", ".\\lib\\IEDriverServer.exe");
		System.out.println("recving myEmail: " + myEmailString);
		
		DesiredCapabilities myIECapabiliy = DesiredCapabilities.internetExplorer();
		myIECapabiliy.setJavascriptEnabled(true);
		myIECapabiliy.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.108:4445/wd/hub"), myIECapabiliy);
		//WebDriver driver = new InternetExplorerDriver();
		System.out.println("Case ID: 0001");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		HomePage homePage;
		
		homePage = new HomePage(driver);
		Assert.assertEquals(homePage.verifyHomePage(), true);
		driver.close();
		

		
	}
	
	//Case ID: 002
	@Test
	public void OpenSlmWbdPage() throws MalformedURLException{
		
		System.setProperty("webdriver.ie.driver", "F:\\JavaWorkSpace\\SeleniumSiteTest\\lib\\IEDriverServer.exe");
		//WebDriver driver = new FirefoxDriver();
		DesiredCapabilities myIECapabiliy = DesiredCapabilities.internetExplorer();
		myIECapabiliy.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		myIECapabiliy.setJavascriptEnabled(true);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.108:4445/wd/hub"), myIECapabiliy);
		//WebDriver driver = new InternetExplorerDriver();
		
		HomePage home;
		try {
			home = new HomePage(driver);	
			SeleniumWebdriverPage seleniumWebdriverPage = home.clickSelenium_Webdriverlnk();
			System.out.println("assert is NOT over!");
			Assert.assertEquals(seleniumWebdriverPage.verfyIsSlmWbdPage(),true);
			System.out.println("assert is over!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("THERE is error!");			
			e.printStackTrace();
			
			
		} finally {
			System.out.println("--case2 --Case over in finally!");
			driver.close();
		}
	}			
		
}
