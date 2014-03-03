package com.SeleniumSite;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageFunc.HomePage;
import com.pageFunc.SeleniumWebdriverPage;

public class HomePageCases {
	
	//Case ID: 001
	@Test
	public void verifyHome() throws MalformedURLException {
		
		DesiredCapabilities myIECapabiliy = DesiredCapabilities.internetExplorer();
		WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4443"), myIECapabiliy);
		//WebDriver driver = new InternetExplorerDriver();
		
		HomePage homePage;
		
		homePage = new HomePage(driver);
		Assert.assertEquals(homePage.verifyHomePage(), true);
		
	}
	
	//Case ID: 002
	@Test
	public void OpenSlmWbdPage(){
		
		WebDriver driver = new FirefoxDriver();
		
		HomePage home;
		try {
			home = new HomePage(driver);	
			SeleniumWebdriverPage seleniumWebdriverPage = home.clickSelenium_Webdriverlnk();			
			Assert.assertEquals(seleniumWebdriverPage.verfyIsSlmWbdPage(),true);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("THERE is error!");			
			e.printStackTrace();
			
			
		} finally {
			//System.out.println("--case2 --Case over in finally!");
			//driver.close();
		}
	}			
		
}
