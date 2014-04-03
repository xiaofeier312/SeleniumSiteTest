package com.SeleniumSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.Test;

import com.utility.MyDriver;






public class TestSuite extends MyDriver {
	
	@Test
	public void testBasic() {
		driver.get("http://www.baidu.com");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		WebDriver driver = new FirefoxDriver();
//		
//		driver.get("http://www.baidu.com");
//		
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		driver.navigate().to("http://www.seleniumhq.org/docs/03_webdriver.jsp");
//		
//		WebElement docTabElement = driver.findElement(By.id("menu_documentation"));
//		
//		docTabElement.click();
//		
//		
////		try {
////			driver.wait();
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		
//		WebElement webDriverButtonElement = null;
//		
//		try {
//			webDriverButtonElement = driver.findElement(By.linkText("Selenium WebDriver"));
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
//		
//		if(webDriverButtonElement == null) {
//			System.out.println("webDriverButtonElement is null: ");
//		}else {
//			System.out.println(webDriverButtonElement.getLocation());
//			System.out.println("find it");
//		}
//		
//		driver.close();
//		
//		
//		
//		//WebDriverWait wait = new WebDriverWait(driver, 11);
//		
	}

}
