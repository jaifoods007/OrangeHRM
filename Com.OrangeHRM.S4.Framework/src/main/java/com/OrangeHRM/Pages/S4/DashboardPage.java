package com.OrangeHRM.Pages.S4;

import org.openqa.selenium.By;

import com.OrangeHRM.CommonMethods.S4.BaseClass;

public class DashboardPage extends BaseClass {
	
	public AdminPage clickadminlink() {
		driver.findElement(By.linkText("Admin")).click();
		return new AdminPage();
		
	}
	
	public PIMPage clickPIMLink() {
		driver.findElement(By.linkText("PIM")).click();
		return new PIMPage();
	}

}
