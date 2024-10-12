package com.OrangeHRM.Pages.S4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.OrangeHRM.CommonMethods.S4.BaseClass;

public class PIMPage extends BaseClass {

	@Test

    public PIMPage click_add_employee_button()
    {
    	driver.findElement(By.className("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
    	return this;
    }
    
    public PIMPage Firstname(String Krishna) {
    	
    	driver.findElement(By.xpath("//body//following::div[28]//input[1]")).sendKeys("Krishna");
       	return this;
    }
	
public PIMPage middlename(String Moorthy) {
    	    	
    	driver.findElement(By.xpath("//body//following::div[28]//input[2]")).sendKeys("Moorthy");
    	return this;
    }
	

public PIMPage Lastname() {
	
	driver.findElement(By.xpath("//body//following::div[28]//input[3]")).sendKeys("Manoharan");
	
	return this;
}

	public PIMPage Save()
	
	{
	
	driver.findElement(By.xpath("//body//following::div[28]//button[2]")).click();
	return this;
	
	}
		
}

