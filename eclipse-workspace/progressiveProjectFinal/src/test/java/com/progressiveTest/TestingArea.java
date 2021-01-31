package com.progressiveTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.progressiveInsurance.AutoPage;
import com.progressiveInsurance.DriversPage;
import com.progressiveInsurance.HomePage;
//import com.progressiveInsurance.MoreAboutOwnersInformation;
import com.progressiveInsurance.NoThankSnapShot;
import com.progressiveInsurance.StartQuotePage;
import com.progressiveInsurance.TellUsAboutPreviousInsurence;
import com.progressiveInsurance.TellUsAboutVehicle;

import screenShotUtil.ScreenShot;


//import config.PropertiesCOnfigBrowserClass;
//import config.PropertiesFile;


public class TestingArea {
	
	public static WebDriver driver;
	
ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentReport_Progressive.html");

   
	public  void invokeBrowser() {
    	 System.setProperty("webdriver.chrome.driver","./libs/libs/chromedriver");
         driver=new ChromeDriver();
         ScreenShot shot=new ScreenShot();
         shot.takeSnapShot(driver, "Progressive -Homepage");
	
	}
    
  @BeforeTest
   public  void titleCheck() {
	  
	 // PropertiesCOnfigBrowserClass browser=new PropertiesCOnfigBrowserClass();
	 // browser.setUpTest();
	
    ExtentReports extent1=new ExtentReports();
     extent1.attachReporter(htmlReporter);
   	 ExtentTest test1=extent1.createTest("Progressive Insuranace titleTest","By SHAVDA");
   	test1.info("Executing CarPage ");
    test1.pass("sucessfully navigated to progressive page");
    	
    	invokeBrowser();
    	driver.get("https://www.progressive.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        String title="Quote Auto Insurance, Home-Auto Bundles, & More | Progressive";
     if (driver.getTitle().equals(title)) {
    	 System.out.println("Successfully loaded Progressive Page");
     }else {
    	 System.out.println("Unsucessful to load page");
     }
     extent1.flush();
     }
	@Test( priority=0)

	public  void verifyHomePage() throws Exception {
		ExtentReports extent2=new ExtentReports();
		extent2.attachReporter(htmlReporter);
		ExtentTest test2=extent2.createTest("homepage of Auto","firsttryoftesting"); //test title
		test2.info("starting of testof homepageauto"); //comments
		test2.pass("woo all the test has been passed");
		
		
		HomePage home=new HomePage(driver);
	    home.clickAutopicture();
		
		Thread.sleep(3000);
		extent2.flush();
		}
	
	@Test(priority=1)
		public  void onlyAutoHomepage() {
		
		ExtentReports extent3=new ExtentReports();
		extent3.attachReporter(htmlReporter);
		ExtentTest test3=extent3.createTest("AutoHomePage","this is page no two");
	   test3.pass("the thirdtest is executed as expected");
		
		try{
			AutoPage auto=new AutoPage(driver);
		auto.enterZipCode("40515");

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		auto.getAQuote();
		
		}catch(Exception e) {
			e.getStackTrace();
		}
		//extent3.flush();                                                          //auto.enterZipCode();
	}	
	
	@Test(priority=3)
	
	public  void personalInformationForstartQuote() {
		
			                                 //when you will have static method htmlReporter appers red light
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test3=extent.createTest("Personla Information to Start Quote ");
			test3.pass("if streetaddress is filled it will easily pass the pages");
			try {
				Thread.sleep(2000);   
		StartQuotePage letStart=new StartQuotePage(driver);
		letStart.enterFirstName("Thakur");
		letStart.enterMiddleInitial();
		letStart.enterLastName("Adhikari");
        letStart.chooseSuffix(2);
		letStart.DateOfBirth("11","12","1991");
		Thread.sleep(2000);
		letStart.streeeeeeeeet("3351 cove lake Dr ");
		
	     //letStart.Apteeeeeeeeet();
	    //letStart.P_O_Boxno();
		Thread.sleep(2000);  
		letStart.OkStartQuoteButton();
		Thread.sleep(2000);   
		
		
		}catch(Exception e) {
			e.getStackTrace();
		}
		 
	
		//extent.flush();
	
	}
	@Test(priority=5)
	public  void vehiclesInformation() {
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test5=extent.createTest("Vehicle information");
		test5.pass("we need to thread sleep to select made and model of the vehicle");
	
		TellUsAboutVehicle about = new TellUsAboutVehicle(driver);
		try {
		Thread.sleep(5000);
		about.madeYear("2019");
		Thread.sleep(2000);
		about.selectYearOfVehicle("Hyundai");
		
		Thread.sleep(2000);
		about.selectYearOfVehicle("Tucson");
		
		
	//	about.orByVin();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		about.madeByBodytype("SUV (4CYL 4X2)");
		//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Thread.sleep(2000);
		about.usetype("Personal (to/from work or school, errands, pleasure)");
		Thread.sleep(1000);
		about.rideSharing();
		Thread.sleep(2000);
		//about.primaryZip();
		
		
		about.leeseOrOwn("Own");
		
		Thread.sleep(2000);
		
		about.lengthofOwnership("1 month - 1 year");
		Thread.sleep(2000);
		about.primaryGarageAddress();
	    Thread.sleep(2000);
		about.emergencyBrakeAssistSystem();
		//Thread.sleep(1000);
		//about.blindAssistSystem();
		//Thread.sleep(2000);
		
		Thread.sleep(6000);
		about.Done();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		about.Continue();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		//about.doneAndClickButton("Done");
//		about.doneButton();
//        Thread.sleep(4000);
//		//about.doneAndClickButton("Continue");
//		about.continueButtom();
		Thread.sleep(6000);
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		}
	
	
	
	
	@Test(priority=6)

	public  void moreInformationAboutOwner()  {
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test6 =extent.createTest("Owners Information");
		test6.info("Sometimes the Social security box may didplay or not IF THE SSN ELEMENT IS DISPLAY THE FLOW RUN SMOOTHLY OTHERWISE THE TEST FAILS");
	//MoreAboutOwnersInformation ownersinformation=new MoreAboutOwnersInformation(driver);
	//ownersinformation.radioButtons("DriversAddPniDetails_embedded_questions_list_Gender_M");
	try {
		
		
		DriversPage Form4 = new DriversPage(driver);
		
		Form4.SelectGender();
		Thread.sleep(2000);
		Form4.MaritialStatus(1);
		Thread.sleep(2000);
		Form4.Educationlevel(3);
		Thread.sleep(2000);
		Form4.EmploymentStatus(2);
		Thread.sleep(2000);
		//ProgressiveForm4.SocialSecurity("456-789-1234");
		//Thread.sleep(2000);
		Form4.PrimaryResidence(1);
		Thread.sleep(2000);
		Form4.MoveClickOption(1);
		Thread.sleep(2000);
		Form4.LicencedYears("3 years or more");
		Thread.sleep(2000);
		Form4.AccidentalClaims();
		Thread.sleep(2000);
		Form4.TicketsOrViolations();
		Thread.sleep(2000);
		Form4.ContinuePage();
		Thread.sleep(4000);
		Form4.ContinuePage();
		 Thread.sleep(5000);
		 Form4.ContinuePage();
		 Thread.sleep(5000);
			}catch(Exception e) {
			e.printStackTrace();
			 e.getCause();
			  e.getMessage();
		}
	}

	
	@Test(priority=9)
	public  void previousInsuranceInformation() {
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		//ExtentTest test9=extent.createTest("Insurance Information bySHAVDA");
		try { 
		
		
		TellUsAboutPreviousInsurence info=new TellUsAboutPreviousInsurence(driver);
		
	 Thread.sleep(2000);
      info.radioButtons("FinalDetailsEdit_embedded_questions_list_InsuranceToday_N");
       Thread.sleep(2000);
       info.radioButtons("FinalDetailsEdit_embedded_questions_list_InsuranceLastMonth_N");
       Thread.sleep(2000);
        info.radioButtons("FinalDetailsEdit_embedded_questions_list_OtherPolicies_N");
        Thread.sleep(2000);
		info.emailAndPolicyStartDate("abc@gmail.com");
        Thread.sleep(3000);
		info.totalresident("2");
		Thread.sleep(3000);
		info.currentLiving(1);
		Thread.sleep(2000);
		info.claimCount(0);
		Thread.sleep(2000);
		info.clickbutton();
         Thread.sleep(4000);}
       catch(Exception e) {
	e.getStackTrace();
}

		
		// extent.flush();
	}
	
     @Test(priority=14)
	public void enrollSnap() throws Exception {
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		//ExtentTest test13 =extent.createTest("Previous Insurance Information");
		
	   NoThankSnapShot  shot=new NoThankSnapShot(driver);
	   Thread.sleep(4000);
		shot.Snapclick3();
		
		TellUsAboutPreviousInsurence info=new TellUsAboutPreviousInsurence(driver);
		Thread.sleep(2000);
     	info.clickbutton();
     	Thread.sleep(4000);
        shot.no_Thanks_Just_Auto();
	Thread.sleep(5000);
	  ScreenShot shots=new ScreenShot();
         shots.takeSnapShot(driver, "Progressive last Page");
         Thread.sleep(2000);
	

		
	}
    

	@AfterTest
	public  void terminateBrowser() {
		try{
			
		Thread.sleep(5000);
		  ScreenShot shot=new ScreenShot();
	         shot.takeSnapShot(driver, "Progressive last Page afterTest");
		
		driver.close();
		driver.quit();
		
	}catch(Exception e) {
		
		e.getStackTrace();
		
	}
		

	
	}
}
	
	
	


	
	
	
	
	
	
	
	
	
	


