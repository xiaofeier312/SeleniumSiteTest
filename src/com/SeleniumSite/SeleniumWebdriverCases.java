package com.SeleniumSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pageFunc.HomePage;
import com.pageFunc.SeleniumWebdriverPage;

public class SeleniumWebdriverCases {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		HomePage home;
		try {
			home = new HomePage(driver);
			SeleniumWebdriverPage seleniumWebdriverPage = home.clickSelenium_Webdriverlnk();
			System.out.println(seleniumWebdriverPage.verfyIsSlmWbdPage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("THERE is error!");
			e.printStackTrace();
		} finally {
			System.out.println("Case over in finally!");
		}
				
		
		
		
//		testInterface testInterface ;
//		testInterface.fff();
	}

}

interface testInterface {
	abstract void fff();
}