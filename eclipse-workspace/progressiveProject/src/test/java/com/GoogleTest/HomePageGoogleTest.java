package com.GoogleTest;


	
	
	
	
	
	

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.HomePageGoogle;

import screenShotUtil.ScreenShot;




public class HomePageGoogleTest {      


WebDriver driver;

ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentReport_google.html");
	
	@BeforeTest                     //typeit and hit contl space
	public void BeforeTest() {
		
	
		
		
	            System.setProperty("webdriver.chrome.driver","./libs/libs/chromedriver");
	              driver=new ChromeDriver();
              driver.manage().deleteAllCookies();
           
	}
	public void navigateToGoogleHomePage() {
		try {
		HomePageGoogle homePage=new HomePageGoogle(driver);	
		ScreenShot screenShot= new ScreenShot();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//Assert.assertTrue(homePage.IsPageOpened());
		//take snapshot
		screenShot.takeSnapShot(driver, "GoogleHomepage");
		
			
			
			
			
			
		}
		catch(Exception e) {
			e.getLocalizedMessage();
		}
	}
		
		
	
	@Test
	public void GoogleSearch() {
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1=extent.createTest("Google");
		
		test1.info("Executing googleTest");
		
		
		
		navigateToGoogleHomePage();
		
		test1.pass("successfully navigate to google page");
		
		
		
		try {
			HomePageGoogle homePage=new HomePageGoogle(driver);	
			ScreenShot shot=new ScreenShot();
			
			homePage.search("what is TestNg");
	        shot.takeSnapShot(driver, "TestNg Result is ready for snap shot");
	      
			
		}catch(Exception e) {
			e.getLocalizedMessage();
			e.getStackTrace();
		}
	extent.flush();	
	}
	
	
	@AfterTest
	public void AfterTest() {
		driver.close();
		driver.quit();
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	


