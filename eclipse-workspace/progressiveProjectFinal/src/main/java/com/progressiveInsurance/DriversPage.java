package com.progressiveInsurance;


	
	import java.util.List;

	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

	
	public class DriversPage {
		
		WebDriver driver;
		
		By radioButton =By.xpath("//input[@type='radio']");
		
//			By maritalStatus=By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_MaritalStatus']//option");
		
//			By female =By.xpath("//input[@type='radio' and @value ='F']");
		//
//			By education=By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_HighestLevelOfEducation']//option");
		//
//			By employment=By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_EmploymentStatus']//option");
		//
//			By primaryResidence=By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_PrimaryResidence']//option");
		//
//			By moveOutside=By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_HasPriorAddress']//option");
		//
//			By socialSecurity=By.xpath("//input[@input-format='ssn']");
		//
//			By license=By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_LicenseStatus']/option");
		//
//			By licenseYear=By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_DriverYearsLicensed']//option");
		//
//			By armedForce=By.xpath("(//input[@type='radio' and @value='N'])[1]");
		//
//			By accident=By.xpath("(//input[@type='radio' and @value='N'])[2]");
		//
//			By ticket=By.xpath("(//input[@type='radio' and @value='N'])[3]");
		//
//			By buttonContinue=By.xpath("//button[text()='Continue']");
		//
//			//By male =By.xpath("//div[1]/input[@name='viewModel_embedded_questions_list_Gender']");
		//
		//
		
		By selectgender = By.xpath("//input[@ value ='M']");
		
		By maritialstatus= By.xpath("//select[@analytics-id='DriversAddPniDetails_MaritalStatus']");
		
		By educationlevel=By.xpath("//select[@analytics-id='DriversAddPniDetails_HighestLevelOfEducation']");
		
		By Empstatus= By.xpath("//select[@analytics-id='DriversAddPniDetails_EmploymentStatus']");
		
	    By primaryresidence = By.xpath("//select[@analytics-id='DriversAddPniDetails_PrimaryResidence']");
	    
		By moveoption = By.xpath("//select[@analytics-id='DriversAddPniDetails_HasPriorAddress']");
		
		By licensestatus = By.xpath("//select[@analytics-id='DriversAddPniDetails_LicenseStatus']");
		
		By yearlicensed = By.xpath("//select[@analytics-id='DriversAddPniDetails_DriverYearsLicensed']");
		
		By accidentclaims = By.xpath("//input[@analytics-id='DriversAddPniDetails_HasAccidentsOrClaims_N']");
		
		By ticketsorviolations = By.xpath("//input[@analytics-id='DriversAddPniDetails_HasTicketsOrViolations_N']");
		
		By continueoption = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
		
		
			
		// OverLoaded
			
		public DriversPage (WebDriver driver) {
			this.driver = driver;
		}
		//Creating a method that lets us interact with elements
		
		public void SelectGender () {
			WebElement element = driver.findElement(selectgender);
			element.click();
			
		}
		
		public void MaritialStatus (int Index) {
			WebElement element = driver.findElement(maritialstatus);
			Select choosestatus = new Select(element);
			choosestatus.selectByIndex(Index);
		}

		public void Educationlevel (int Index) {
			WebElement element = driver.findElement(educationlevel);
			Select chooseEdulevel = new Select(element);
		     chooseEdulevel.selectByIndex(Index);
				
		}
		
		public void EmploymentStatus (int Index) {
			WebElement element = driver.findElement(Empstatus);
			Select chooseEmpstatus = new Select(element);
		     chooseEmpstatus.selectByIndex(Index);
			
		}
		
		
		public void PrimaryResidence (int Index) {
			WebElement element = driver.findElement(primaryresidence);
			Select chooseResidence = new Select(element);
		     chooseResidence.selectByIndex(Index);
		}
		public void MoveClickOption (int Index) {
			WebElement element = driver.findElement(moveoption);
			Select chooseMoveOption = new Select(element);
		     chooseMoveOption.selectByIndex(Index);
		}
		public void LicencedYears (String LDyear) {
			WebElement yearlicensed = driver.findElement(By.xpath("//select[@analytics-id='DriversAddPniDetails_DriverYearsLicensed']"));
			 yearlicensed.click();
				yearlicensed.sendKeys(Keys.RETURN);
				yearlicensed.sendKeys(LDyear);
				
				yearlicensed.sendKeys(Keys.TAB);	
			
			//WebElement element = driver.findElement(licensestatus);
			//Select chooseLicense = new Select(element);
		    // chooseLicense.selectByIndex(Index);
		}
		public void AccidentalClaims () {
			WebElement element = driver.findElement(accidentclaims);
			element.click();
		}
		public void TicketsOrViolations () {
			WebElement element = driver.findElement(ticketsorviolations);
			element.click();
		}
		 public void ContinuePage() {
			 WebElement element = driver.findElement(continueoption);
				element.click();
		 }
		
	}

	
	
	
	
	
	
	

//
//
//	public void marital_status(String status) {
//		List<WebElement>liststatus=driver.findElements(maritalStatus);
//		 for(int i=0;i<liststatus.size();i++) {
//			
//			WebElement element=liststatus.get(i);
//			
//		if(element.getText().equals(status)) {
//			
//			element.click();
//			break;}
//			}
//		 }
//
//
//	public void education_status(String edustatus) {
//		List<WebElement>liststatus=driver.findElements(education);
//		 for(int i=0;i<liststatus.size();i++) {
//			
//			WebElement element=liststatus.get(i);
//			
//		if(element.getText().equals(edustatus)) {
//			
//			element.click();
//			break;}
//			}
//		 }
//
//
//	public void employment_status(String employstatus) {
//		List<WebElement>liststatus=driver.findElements(employment);
//		 for(int i=0;i<liststatus.size();i++) {
//			
//			WebElement element=liststatus.get(i);
//			
//		if(element.getText().equals(employstatus)) {
//			
//			element.click();
//			break;}
//			}
//		 }
//
//
//
//	public void resident_status(String residentstatus) {
//		List<WebElement>liststatus=driver.findElements(primaryResidence);
//		 for(int i=0;i<liststatus.size();i++) {
//			
//			WebElement element=liststatus.get(i);
//			
//		if(element.getText().equals(residentstatus)) {
//			
//			element.click();
//			break;}
//			}
//		 }
//
//
//
//
//
//	public void Outside_Move_Status(String movementstatus) {
//		List<WebElement>liststatus=driver.findElements(moveOutside);
//		 for(int i=0;i<liststatus.size();i++) {
//			
//			WebElement element=liststatus.get(i);
//			
//		if(element.getText().equals(movementstatus)) {
//			
//			element.click();
//			break;}
//			}
//		 }
//
//	public void License_Status(String licensestatus) {
//		List<WebElement>liststatus=driver.findElements(license);
//		 for(int i=0;i<liststatus.size();i++) {
//			
//			WebElement element=liststatus.get(i);
//			
//		if(element.getText().equals(licensestatus)) {
//			
//			element.click();
//			break;}
//			}
//		 }
//
//
//
//	public void License_Year(String licenYear) {
//		List<WebElement>liststatus=driver.findElements(licenseYear);
//		 for(int i=0;i<liststatus.size();i++) {
//			
//			WebElement element=liststatus.get(i);
//			
//		if(element.getText().equals(licenYear)) {
//			
//			element.click();
//			break;}
//			}
//		 }
//
//	//public void YearofLicense(int index) {
////		WebElement year= driver.findElement(licenseYear);
////		Select sselectts=new Select(year);
////		sselectts.selectByIndex(index);}
//
//
//
//
//
//
//
//
//	//public void licenceStatus() {
////		WebElement element=driver.findElement(license);
////		element.sendKeys(Keys.TAB);
//	//}
//
//
//
//	public void activeArmy() {
//		WebElement element=driver.findElement(armedForce);
//		element.click();
//	}
//
//
//
//	public void Accident_Claim_Damaage() {
//		WebElement element=driver.findElement(accident);
//		element.click();
//	}
//
//	public void Ticket_Violation() {
//		WebElement element=driver.findElement(ticket);
//		element.click();
//	}
//
//	public void continueButton()  {
//		WebElement element=driver.findElement(buttonContinue);
//		element.click();
//
//		
//	}

		
















		

		
		
		

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	



