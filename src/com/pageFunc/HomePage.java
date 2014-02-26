package com.pageFunc;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pageData.HomePageData;
/**\
 * @author Moon
 *
 */
public class HomePage {
	
	//functions in here
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver =driver;
		driver.navigate().to(HomePageData.homeLink);
		PageFactory.initElements(driver, this);				
	}

	public SeleniumWebdriverPage clickSelenium_Webdriverlnk() {
		seleniumWebdriverLlinkElement.click();
		return new SeleniumWebdriverPage(driver);
	}	
	
	
	
	
	
	@FindBy(linkText="Selenium WebDriver")
	private WebElement seleniumWebdriverLlinkElement;
}
