package com.example.tests;

import com.thoughtworks.selenium.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import java.util.regex.Pattern;

public class SeleniumIDE2WebDriver extends SeleneseTestNgHelper {
	@Test public void testSeleniumIDE2WebDriver() throws Exception {
		selenium.open("/fcc/login");
		selenium.type("id=username", "zhi");
		selenium.type("id=password", "Adadadad1");
		selenium.click("//input[@value='Login']");
		selenium.waitForPageToLoad("60000");
		selenium.click("link=Player Accounts");
		selenium.waitForPageToLoad("60000");
		selenium.click("link=Add New");
		selenium.waitForPageToLoad("60000");
		String username = selenium.getExpression(selenium.getEval("var date = new Date();date.getDate() + '-' + (date.getMonth()+1) + '-' + date.getFullYear() + '_' + date.getHours() + '_' + date.getMinutes() + '_' + date.getSeconds();"));
		System.out.println(username);
		Thread.sleep(3000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("Address")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.type("id=username", username);
		selenium.type("id=username", "asdf");
		selenium.type("id=password", "Cyb3r4rt$");
		selenium.type("id=confirmPassword", "Cyb3r4rt$");
		selenium.type("id=nickname", "Tron");
		selenium.type("id=lastName", "Dell'Aquila");
		selenium.type("id=firstName", "Brian");
		selenium.select("id=gender", "label=Male");
		selenium.type("id=email", username + "@cyberarts.com");
		selenium.click("id=dob");
		selenium.type("id=dob", "1912-01-09");
		selenium.type("id=phone", selenium.getEval("Math.floor(Math.random()*1000000000)"));
		selenium.click("id=country");
		selenium.select("id=country", "label=Aland Islands");
		selenium.type("id=address", "123 Post St.");
		Thread.sleep(5000);
		selenium.click("link=add");
		selenium.select("id=customFields_array1_array1", "label=Other");
		Thread.sleep(2000);
		selenium.type("css=#customFields_array1_array1DropDownContainer > input[type=\"text\"]", "Mobile Phone");
		selenium.keyPress("css=#customFields_array1_array1DropDownContainer > input[type=\"text\"]", "\\13");
		selenium.select("id=customFields_array1_array1", "label=Mobile Phone");
		selenium.click("id=customFields_array1_array2");
		selenium.type("id=customFields_array1_array2", selenium.getEval("Math.floor(Math.random()*1000000000)"));
		Thread.sleep(5000);
		selenium.click("//fieldset[@id='PLAYER_INFO']/div[16]/button");
		Thread.sleep(20000);
		verifyTrue(selenium.isTextPresent("Player ID"));
		verifyEquals(selenium.getTitle(), "Player Details");
		verifyTrue(selenium.isTextPresent(username + "@cyberarts.com"));
		// //Verify tabs loading
		selenium.click("link=Details");
		Thread.sleep(5000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("FlagsEdit")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		verifyTrue(selenium.isTextPresent("exact:Last Name *"));
		verifyTrue(selenium.isTextPresent("exact:First Name *"));
		verifyTrue(selenium.isTextPresent("PlayerEdit"));
		verifyTrue(selenium.isTextPresent("exact:Gender *"));
		verifyTrue(selenium.isTextPresent("exact:Email *"));
		verifyTrue(selenium.isTextPresent("exact:DOB *"));
		verifyTrue(selenium.isTextPresent("exact:Country *"));
		verifyTrue(selenium.isTextPresent("Additional Fieldsadd"));
		verifyTrue(selenium.isTextPresent("Reset passwordEdit"));
		verifyTrue(selenium.isTextPresent("exact:New password *"));
		verifyTrue(selenium.isTextPresent("exact:Confirm password *"));
		verifyTrue(selenium.isTextPresent("exact:Flags:"));
		selenium.click("xpath=(//a[contains(text(),'Finance')])[2]");
		Thread.sleep(4000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("Manual Adjustment")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		Thread.sleep(4000);
		Thread.sleep(4000);
		verifyTrue(selenium.isTextPresent("Deposits & Withdrawals"));
		verifyTrue(selenium.isElementPresent("id=manual-deposit"));
		verifyTrue(selenium.isTextPresent("Software Version"));
		verifyTrue(selenium.isTextPresent("Filters"));
		verifyTrue(selenium.isElementPresent("id=manual-adjustment"));
		verifyTrue(selenium.isTextPresent("exact:Start date *"));
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("exact:End date (inclusive) *")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		verifyTrue(selenium.isTextPresent("Apply"));
		selenium.click("link=Gaming Activity");
		Thread.sleep(5000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("Hand History")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		Thread.sleep(5000);
		Thread.sleep(2000);
		verifyTrue(selenium.isTextPresent("Game History"));
		verifyTrue(selenium.isTextPresent("Software Version"));
		verifyTrue(selenium.isTextPresent("Operator"));
		verifyTrue(selenium.isTextPresent("Filters"));
		verifyTrue(selenium.isTextPresent("exact:Start Date *"));
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("exact:End Date *")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		verifyTrue(selenium.isTextPresent("Apply"));
		verifyTrue(selenium.isTextPresent("Hand History"));
		verifyTrue(selenium.isTextPresent("exact:start time *"));
		verifyTrue(selenium.isTextPresent("exact:end time *"));
		verifyTrue(selenium.isTextPresent("Clear"));
		Thread.sleep(5000);
		selenium.click("link=Loyalty & Retention");
		Thread.sleep(25000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("Manage VIP Program")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		verifyTrue(selenium.isTextPresent("Current Tier"));
		verifyTrue(selenium.isTextPresent("XP Multiplier"));
		verifyTrue(selenium.isTextPresent("XP Required to Retain Current Tier"));
		verifyTrue(selenium.isTextPresent("XP Earned This Month"));
		verifyTrue(selenium.isTextPresent("XP Earned this Year"));
		verifyTrue(selenium.isTextPresent("XP Required to Reach Next Yearly Tier"));
		verifyTrue(selenium.isTextPresent("Upgrade VIP Tier"));
		verifyTrue(selenium.isTextPresent("Upgrade VIP Tier to"));
		verifyTrue(selenium.isTextPresent("Upgrade"));
		selenium.click("link=Responsible Gaming");
		Thread.sleep(20000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("Responsible Gaming History")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		verifyTrue(selenium.isElementPresent("//fieldset[@id='responsibleGamingOuterFieldset']/legend"));
		verifyTrue(selenium.isTextPresent("LimitsEdit"));
		verifyTrue(selenium.isTextPresent("Deposit Limit Week"));
		verifyTrue(selenium.isElementPresent("//fieldset[@id='RESPONSIBLEGAMING_SELF_EXCLUSION']/legend"));
		verifyTrue(selenium.isTextPresent("Players may temporarily self-exclude themselves from access to the system by selecting from the time periods below. Once this action is taken, it may not be undone until this time period has expired."));
		verifyTrue(selenium.isElementPresent("id=closeAccount"));
		verifyTrue(selenium.isElementPresent("id=saveExclusionPeriod"));
		selenium.click("link=Fraud & Collusion");
		Thread.sleep(20000);
		verifyEquals(selenium.getText("//div[@id='ui-tabs-7']/fieldset[5]/legend"), "Shared Cash Game Hands Details");
		verifyTrue(selenium.isTextPresent("This account is ENABLED"));
		verifyTrue(selenium.isElementPresent("id=eject-player"));
		verifyTrue(selenium.isTextPresent("Audit Flags"));
		verifyTrue(selenium.isTextPresent("Folds Nuts"));
		verifyTrue(selenium.isTextPresent("Folds After Betting Against A Field"));
		verifyTrue(selenium.isTextPresent("Win/Loss by Gaming Activity"));
		verifyTrue(selenium.isTextPresent("Win/Loss by Hand"));
		verifyEquals(selenium.getText("//div[@id='ui-tabs-7']/fieldset[5]/legend"), "Shared Cash Game Hands Details");
		verifyTrue(selenium.isTextPresent("exact:From 00 00 *"));
		verifyTrue(selenium.isTextPresent("exact:Through 23 59 *"));
		verifyTrue(selenium.isElementPresent("link=Disable"));
		selenium.click("link=Notes");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("Player Notes")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		verifyTrue(selenium.isTextPresent("ID"));
		verifyTrue(selenium.isTextPresent("Type"));
		verifyTrue(selenium.isTextPresent("Date & Time Created"));
		// //Edit details
		selenium.click("link=Details");
		Thread.sleep(5000);
		selenium.click("link=Edit");
		Thread.sleep(1000);
		selenium.type("id=address", "123 Post St. B");
		selenium.type("id=nickname", "Tron Nick");
		selenium.click("//fieldset[@id='PLAYER_INFO']/div[11]/button");
		Thread.sleep(3000);
		// //Add flags
		selenium.click("link=Details");
		Thread.sleep(5000);
		selenium.click("xpath=(//a[contains(text(),'Edit')])[3]");
		Thread.sleep(5000);
		selenium.addSelection("id=box1View", "label=Age & Identity Verified");
		selenium.click("id=to2");
		selenium.addSelection("id=box1View", "label=Mobile Phone Verified");
		selenium.click("id=to2");
		selenium.addSelection("id=box1View", "label=Email Verified");
		selenium.click("css=option[title=\"Email Verified\"]");
		selenium.click("id=to2");
		selenium.addSelection("id=box1View", "label=Can contact");
		selenium.click("id=to2");
		selenium.addSelection("id=box1View", "label=Has completed full registration");
		selenium.click("id=to2");
		selenium.click("//fieldset[@id='FLAGS_AND_AWARDS']/div[3]/button");
		Thread.sleep(9000);
		// //Charge
		selenium.click("xpath=(//a[contains(text(),'Finance')])[2]");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("Manual Adjustment")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("exact:End date (inclusive) *")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("id=manual-adjustment");
		Thread.sleep(5000);
		selenium.select("id=currencyIsoName", "label=4 - USD");
		selenium.type("id=amount", "999");
		selenium.click("id=messageToPlayer");
		selenium.type("id=messageToPlayer", "Message to player is 999");
		selenium.type("id=memo", "999");
		selenium.click("id=adjust_button");
		Thread.sleep(5000);
		selenium.click("css=span.ui-icon.ui-icon-closethick");
		Thread.sleep(5000);
		selenium.click("id=manual-adjustment");
		Thread.sleep(11000);
		selenium.select("id=currencyIsoName", "label=40 - XPP");
		selenium.click("css=#currencyIsoName > option[value=\"XPP\"]");
		Thread.sleep(5000);
		selenium.type("id=amount", "200");
		selenium.type("id=memo", "200XPP");
		selenium.type("id=messageToPlayer", "Message to player 1200");
		selenium.click("id=adjust_button");
		Thread.sleep(2500);
		Thread.sleep(5000);
		verifyEquals(selenium.getText("id=div-feedback"), "Transfer successful");
	}
}
