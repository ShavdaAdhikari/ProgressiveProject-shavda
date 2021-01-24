package com.progressiveProjectTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.progressiveInsurance.AutohomePage;
import com.progressiveInsurance.HomePage;
import com.progressiveInsurance.MoreAboutOwnersInformation;
import com.progressiveInsurance.SnapShot;
import com.progressiveInsurance.StartQuotePage;
import com.progressiveInsurance.TellUsAboutVehicle;
import com.progressiveInsurance.TellUsaboutPreviousInsurance;

public class TestingArea {
	
	public static WebDriver driver;
	
ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentReport.html");

//	public static void main(String[] args) {
//		try { invokeBrowser();
//		 titleCheck();
//		 verifyHomePage();
//		 
//		 
//		 onlyAutoHomepage();
//		 Thread.sleep(5000);
//		 personalInformationForstartQuote();
//		 
//		 Thread.sleep(5000);
//		 vehiclesInformation();
//		 Thread.sleep(3000);
//		 moreInformationAboutOwner();
//		 Thread.sleep(2000);
//		 previousInsuranceInformation();
//		 Thread.sleep(2000);
//		 Nothanksauto();                         
//		//terminateBrowser();
//		}catch(Exception e) {
//			e.getLocalizedMessage();
//			e.getStackTrace();
//		}
//	}
   
	public static void invokeBrowser() {
    	 System.setProperty("webdriver.chrome.driver","./libbs/libs/chromedriver");
         driver=new ChromeDriver();}
    
  @BeforeTest
    public  void titleCheck() {
    ExtentReports extent=new ExtentReports();
   //	ExtentReports extent=new ExtentReports();
   	extent.attachReporter(htmlReporter);
   	
   	ExtentTest test1=extent.createTest("Progressive Insuranace Test","By SHAVDA");
   	test1.info("Executing CarPage Progressive Insuranace Test");
    	
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
   //  extent.flush();
     }
	@Test( priority=0)

	public  static void verifyHomePage() {
		ExtentReports extent=new ExtentReports();
		//extent.attachReporter(htmlReporter);
		ExtentTest test2=extent.createTest("homepage of Auto","firsttryoftesting"); //test title
		test2.info("starting of testof auto"); //comments
		test2.pass("woo");
		
		
		HomePage home=new HomePage(driver);
		
		//TellUsAboutVehicle about = new TellUsAboutVehicle(driver);
		//about.doneAndClickButton("Auto");
		
		home.clickAutopicture();
		
		//extent.flush();
		}
	
	@Test(priority=1)
		public  void onlyAutoHomepage() {
		
		ExtentReports extent=new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		ExtentTest test3=extent.createTest("AutoHomePage","this is page no two");
	test3.pass("the test is executed as expected");
		
		try{AutohomePage auto=new AutohomePage(driver);
		auto.enterZipCode("40515");
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//		auto.bundleAddHome();
//	Thread.sleep(1000);
//	auto.bundleAddCondo();
//		Thread.sleep(1000);
//		auto.bundleAddRenter();
//		//auto.learnMoreOr();
		
		Thread.sleep(1000);
		auto.getAQuote();
		Thread.sleep(2000);
		}catch(Exception e) {
			e.getStackTrace();
		}
		//extent.flush();                                                          //auto.enterZipCode();
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
		//letStart.chooseSuffix("SR");
		letStart.chooseSuffix(2);
		letStart.DateOfBirth("11","12","1991");
		Thread.sleep(2000);
		letStart.streeeeeeeeet("3351 cove lake Dr ");
		
		//letStart.enterStreetName("513LucilleDr");
		//letStart.choosestreet("128 covelake");
		//letStart.Apteeeeeeeeet();
//		letStart.cityofMailing();
//		letStart.ZipcodeNo();
		//letStart.city();
		//letStart.zip();
		//Thread.sleep(2000);
		//letStart.P_O_Boxno();
		Thread.sleep(4000);
		letStart.OkStartQuoteButton();
		
		Thread.sleep(2000);
		}catch(Exception e) {
			e.getStackTrace();
		}
		 
	
		//extent.flush();
	
	}
	@Test(priority=5)
	public  void vehiclesInformation() throws InterruptedException {
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test5=extent.createTest("Vehicle information");
		test5.pass("we need to thread sleep to select made and model of the vehicle");
		test5.fail("if the equiped antittheft is  displayed the test will fail.");
		
		TellUsAboutVehicle about = new TellUsAboutVehicle(driver);
		//about.selectyear(" 2017 ");
		Thread.sleep(2000);
		about.selectYearOfVehicle("2017");
		Thread.sleep(3000);
		about.selectYearOfVehicle("Hyundai");
		Thread.sleep(3000);
		about.selectYearOfVehicle("Tucson");
		
		
		//about.orChooseByVin();
		Thread.sleep(3000);
		about.madeByBodytype("SUV (4CYL 4X2)");
		Thread.sleep(3000);
		about.usetype("Personal (to/from work or school, errands, pleasure)");
		//Thread.sleep(1000);
		//about.rideSharing();
		//Thread.sleep(2000);
		//about.primaryZip();
		Thread.sleep(2000);
		about.leeseOrOwn("Own");
		Thread.sleep(2000);
		about.lengthofOwnership("1 month - 1 year");
		//Thread.sleep(2000);
		//about.eQuipedAntiThef();VehiclesNew_embedded_questions_list_GaragingSameAsMailingAddress_Y
		Thread.sleep(2000);
		about.garageAddress("VehiclesNew_embedded_questions_list_GaragingSameAsMailingAddress_Y");
		Thread.sleep(2000);
		about.garageAddress("VehiclesNew_embedded_questions_list_AutomaticEmergencyBraking_Y");
		Thread.sleep(2000);
		about.garageAddress("VehiclesNew_embedded_questions_list_BlindSpotWarning_Y");
		
		Thread.sleep(2000);
		about.doneAndClickButton("Done");
		Thread.sleep(2000);
		about.doneAndClickButton("Continue");
		Thread.sleep(3000);
		
		 
		
		
		//about.adanotherVehicle();
		}
	
	@Test(priority=6)
	
	public  void moreInformationAboutOwner() throws InterruptedException {
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test6 =extent.createTest("Owners Information");
		test6.info("Sometimes the Social security box may didplay or not IF THE SSN ELEMENT IS DISPLAY THE FLOW RUN SMOOTHLY OTHERWISE THE TEST FAILS");
	MoreAboutOwnersInformation ownersinformation=new MoreAboutOwnersInformation(driver);
	ownersinformation.radioButtons("DriversAddPniDetails_embedded_questions_list_Gender_M");
	Thread.sleep(2000);
	ownersinformation.radioButtons("DriversAddPniDetails_embedded_questions_list_MilitaryStatus_N");
	Thread.sleep(2000);
	ownersinformation.radioButtons("DriversAddPniDetails_embedded_questions_list_HasAccidentsOrClaims_N");
	Thread.sleep(2000);
	ownersinformation.radioButtons("DriversAddPniDetails_embedded_questions_list_HasTicketsOrViolations_N");
	ownersinformation.marital_status("Single");
	Thread.sleep(2000);
	ownersinformation.education_status("Graduate work or graduate degree");
	Thread.sleep(2000);
	ownersinformation.employment_status("Not working/Other");
	
	//ownersinformation.socialSecurityNo("694122345");
	Thread.sleep(2000);
	ownersinformation.resident_status("Own home");
	Thread.sleep(2000);
	ownersinformation.Outside_Move_Status("No");
	Thread.sleep(2000);
	
	ownersinformation.License_Year("3 years or more");
//	Thread.sleep(2000);
//	ownersinformation.activeArmy();
//	Thread.sleep(2000);
//	//ownersinformation.Accident_Claim_Damaage();;
//	Thread.sleep(2000);
//	//ownersinformation.Ticket_Violation();
//	Thread.sleep(2000);
	TellUsAboutVehicle about = new TellUsAboutVehicle(driver);
	about.doneAndClickButton("Continue");
	Thread.sleep(2000);
	
	Thread.sleep(2000);
	about.doneAndClickButton("Continue");
	Thread.sleep(2000);
	about.doneAndClickButton("Continue");
	 
	//extent.flush();
	}
     @Test(priority=9)
	public  void previousInsuranceInformation() throws Exception {
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test9=extent.createTest("Insurance Information bySHAVDA");
		
		
TellUsaboutPreviousInsurance info=new TellUsaboutPreviousInsurance(driver);
		
		
MoreAboutOwnersInformation ownersinformation=new MoreAboutOwnersInformation(driver);
ownersinformation.radioButtons("FinalDetailsEdit_embedded_questions_list_InsuranceToday_N");
		      
		Thread.sleep(2000);
		ownersinformation.radioButtons("FinalDetailsEdit_embedded_questions_list_InsuranceLastMonth_N");
		Thread.sleep(2000);
		ownersinformation.radioButtons("FinalDetailsEdit_embedded_questions_list_OtherPolicies_N");
//		info.thirtyDaysLapse();
//		Thread.sleep(2000);
//		info.bodilyInjureLimit(2);
//		Thread.sleep(2000);
//		info.nonOrLastMonthPolicy();
//		Thread.sleep(1000);
		//Thread.sleep(2000);
		//info.emailAndPolicyStartDate("abc@gmail.com");
		Thread.sleep(2000);
		info.membersLiveInHome("4");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		info.totalClaimCount("0");
		TellUsAboutVehicle about = new TellUsAboutVehicle(driver);
		about.doneAndClickButton("Continue");
		
		 extent.flush();
	}
	
     @Test(priority=14)
	public /*static*/ void Nothanksauto() throws Exception {
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test13 =extent.createTest("Previous Insurance Information");
		
//		SnapShot shot=new SnapShot(driver);
//		Thread.sleep(2000);
		MoreAboutOwnersInformation ownersinformation=new MoreAboutOwnersInformation(driver);
		ownersinformation.radioButtons("SnapshotEnrollment40Edit_embedded_questions_list_SnapshotPolicyEnrollment_N");
		 Thread.sleep(3333);
		 
		 TellUsAboutVehicle about = new TellUsAboutVehicle(driver);
			about.doneAndClickButton("Continue");
			Thread.sleep(3333);
			about.doneAndClickButton("No thanks, just auto");
		 
		
	}
	
	

//	@AfterTest
//	public  void terminateBrowser() {
//		try{
//			
//		Thread.sleep(10000);	
//		driver.close();
//		driver.quit();
//	}catch(Exception e) {
//		
//		e.getStackTrace();
//		
//	}
//		

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

