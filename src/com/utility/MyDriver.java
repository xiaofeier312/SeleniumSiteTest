package com.utility;

import java.sql.Driver;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;

public class MyDriver  {
	
	protected WebDriver driver;
	protected String win7IE8Address = "http://192.168.0.133:4442/wd/hub";
	
	@Parameters({"emailName"})
	public String giveBrowserType(String emailname) {
		
	}

	
	
	
}
