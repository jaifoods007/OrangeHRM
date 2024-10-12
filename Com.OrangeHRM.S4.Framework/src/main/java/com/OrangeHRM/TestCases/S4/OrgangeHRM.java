package com.OrangeHRM.TestCases.S4;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OrangeHRM.CommonMethods.S4.BaseClass;
import com.OrangeHRM.Pages.S4.DashboardPage;
import com.OrangeHRM.Pages.S4.LoginPage;

public class OrgangeHRM extends BaseClass {
	
@BeforeTest
	public void testinputs() {
	
	testcaseName ="Login functionality";
	testcaseDec ="To Validate whether user is able to login";
    author ="Automation Tester";
	category="smoketest";
		
	}


@Test (dataProvider ="getdata")	
public void loginHRM(String username, String password ) {

	LoginPage lp = new LoginPage();
	lp.enterusername(username);
	lp.enterpassword(password);
	lp.clickbtn();
	
	DashboardPage dp = new DashboardPage();
	dp.clickadminlink(); 
	
//	LoginPage lp = new LoginPage();
	
	//lp.enterusername(username).enterpassword(password).clickbtn().clickadminlink();
	
	
} 


}
