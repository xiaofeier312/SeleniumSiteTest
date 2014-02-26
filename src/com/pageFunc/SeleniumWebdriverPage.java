package com.pageFunc;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.pageData.SeleniumWebdriverPageData;

public class SeleniumWebdriverPage {
	
	private WebDriver driver;
	
	public SeleniumWebdriverPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verfyIsSlmWbdPage() {
		System.out.println("URL : " + driver.getCurrentUrl());
		//Assert.assertEquals( driver.getCurrentUrl(), SeleniumWebdriverPageData.SeleniumWebdriverLink);
		return driver.getCurrentUrl().equals(SeleniumWebdriverPageData.SeleniumWebdriverLink);
	}
}
