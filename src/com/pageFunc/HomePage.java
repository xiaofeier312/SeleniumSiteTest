package com.pageFunc;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pageData.HomePageData;
import com.utility.MyDriver;
/**\
 * @author Moon
 *
 */
public class HomePage {
	
	//functions in here
	private WebDriver driver;
	
	public HomePage(WebDriver driver) throws InterruptedException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Thread.sleep(3000);
		
		System.out.println("2. Debug P0 bug!!!!! driver is null?_" + (driver == null));
		driver.get(HomePageData.homeLink);
					
	}

	public SeleniumWebdriverPage clickSelenium_Webdriverlnk() {
		seleniumWebdriverLlinkElement.click();
		return new SeleniumWebdriverPage(driver);
	}	
	
	public boolean verifyHomePage() {
		System.out.println("Step1");
		return HomeTextline2.isDisplayed();
	}
	
	
	
	@FindBy(linkText="Browser Automation")
	private WebElement HomeTextline2;
	@FindBy(linkText="Selenium WebDriver")
	private WebElement seleniumWebdriverLlinkElement;
}
