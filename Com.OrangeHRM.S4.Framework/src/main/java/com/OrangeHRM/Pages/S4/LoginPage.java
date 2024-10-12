package com.OrangeHRM.Pages.S4;

import org.openqa.selenium.By;

import com.OrangeHRM.CommonMethods.S4.BaseClass;

public class LoginPage extends BaseClass {
	
public LoginPage enterusername(String username) {
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
	return this;	
}

public LoginPage enterpassword(String password) {
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	return this;
}

public DashboardPage clickbtn() {
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	return new DashboardPage();
	
}
	
	
 

	
	
	
	  
}
