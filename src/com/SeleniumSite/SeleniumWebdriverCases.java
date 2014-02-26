package com.SeleniumSite;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.pageFunc.HomePage;
import com.pageFunc.SeleniumWebdriverPage;

public class SeleniumWebdriverCases {
	
	@Test
	public void verifyHome() {
		WebDriver driver = new FirefoxDriver();
		
		HomePage homePage;
		
		homePage = new HomePage(driver);
		Assert.assertEquals(homePage.verifyHomePage(), true);
		
	}
	
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
				
		
		
		
//		testInterface testInterface ;
//		testInterface.fff();
	}

}

interface testInterface {
	abstract void fff();
}