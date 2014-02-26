package com.SeleniumSite;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.WebDriverWait;





public class TestSuite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.seleniumhq.org/docs/03_webdriver.jsp");
		
		WebElement docTabElement = driver.findElement(By.id("menu_documentation"));
		
		docTabElement.click();
		
		
//		try {
//			driver.wait();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		WebElement webDriverButtonElement = null;
		
		try {
			webDriverButtonElement = driver.findElement(By.linkText("Selenium aaaWebDriver"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		if(webDriverButtonElement == null) {
			System.out.println("webDriverButtonElement is null: ");
		}else {
			System.out.println("find it");
		}
		
		driver.close();
		
		
		
		//WebDriverWait wait = new WebDriverWait(driver, 11);
		
	}

}
