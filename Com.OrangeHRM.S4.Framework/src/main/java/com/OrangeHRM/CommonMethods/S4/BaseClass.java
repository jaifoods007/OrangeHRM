package com.OrangeHRM.CommonMethods.S4;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.OrangeHRM.Utiliites.S4.Reporter;
import com.OrangeHRM.Utiliites.S4.Utilities;



public class BaseClass extends Reporter  {
	
	public static ChromeDriver driver;
	
@BeforeMethod
public void LaunchApp() {
		
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	String baseURL ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	driver.get(baseURL);
	
	//Maximize the window
	
	driver.manage().window().maximize();
	
	
	//Title
	
	String title = driver.getTitle();
	System.out.println("Title of the page is:" +title);
	
	
}

@DataProvider (name ="getdata")
public Object[][] getlogindata() throws IOException {
	
	return Utilities.exceldataread();
	
}



@AfterMethod
public void teardown() {
	driver.close();
}


}
