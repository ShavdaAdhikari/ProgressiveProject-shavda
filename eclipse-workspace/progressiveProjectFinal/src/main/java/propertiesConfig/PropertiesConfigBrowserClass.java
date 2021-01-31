package propertiesConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.google.HomePageGoogle;
import screenShotUtil.ScreenShot;




public class PropertiesConfigBrowserClass {
	
	
	public WebDriver driver;
		
		//store value of browser
		public static String BrowserName=null;
		
		
		

		public void setUpTest() {
			
			
			
			 PropertiesFile.getProperties();
			
			if(BrowserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ".libs/libs/chromedriver");

			driver=new ChromeDriver();
			
			
			}else if(BrowserName.equalsIgnoreCase("firefox")) {
				
			System.setProperty("webdriver.gecko.driver", ".libs/libs/geckodriver");
			
			driver=new FirefoxDriver();
			}
			else {System.out.println("Invalid Browser Name");}
			}

	


		    @Test            //typeit and hit contl space
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
			
			
			screenShot.takeSnapShot(driver, "GoogleHomepage");
			
				
				
				
				
				
			}
			catch(Exception e) {
				e.getLocalizedMessage();
			}
		
			
			
		try {
			HomePageGoogle homePage=new HomePageGoogle(driver);	
			ScreenShot shot=new ScreenShot();
			
			homePage.search("what is TestNg");
			shot.takeSnapShot(driver,"TestNg Result is ready for snap shot");	       
			//PropertiesFile.setProperties();
		}catch(Exception e) {
			e.getLocalizedMessage();
			e.getStackTrace();
		}
		
	}
	
	
		public void GoogleSearch() {
			
			ExtentReports extent=new ExtentReports();
			//extent.attachReporter(htmlReporter);
			
			ExtentTest test1=extent.createTest("Google");
			
			test1.info("Executing googleTest");
			
			
			
			navigateToGoogleHomePage();
			
			test1.pass("successfully navigate to google page");
			
			
		}
			
		

		public void AfterTest() {
			driver.close();
			driver.quit();
			
		}
	}
		
		








