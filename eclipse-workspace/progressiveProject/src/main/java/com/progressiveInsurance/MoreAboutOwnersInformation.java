package com.progressiveInsurance;


	
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;


	public class MoreAboutOwnersInformation {
		WebDriver driver;
		
		
	By radioButton =By.xpath("//input[@type='radio']");

	By maritalStatus=By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_MaritalStatus']//option");

	By female =By.xpath("//input[@type='radio' and @value ='F']");

	By education=By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_HighestLevelOfEducation']//option");

	By employment=By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_EmploymentStatus']//option");

	By primaryResidence=By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_PrimaryResidence']//option");

	By moveOutside=By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_HasPriorAddress']//option");

	By socialSecurity=By.xpath("//input[@input-format='ssn']");

	By license=By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_LicenseStatus']/option");

	By licenseYear=By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_DriverYearsLicensed']//option");

	By armedForce=By.xpath("(//input[@type='radio' and @value='N'])[1]");

	By accident=By.xpath("(//input[@type='radio' and @value='N'])[2]");

	By ticket=By.xpath("(//input[@type='radio' and @value='N'])[3]");

	By buttonContinue=By.xpath("//button[text()='Continue']");

	//By male =By.xpath("//div[1]/input[@name='viewModel_embedded_questions_list_Gender']");



	public MoreAboutOwnersInformation(WebDriver driver) {
	this.driver=driver;
		
	}



	public void radioButtons(String buttonclick) {
		List<WebElement>listbutton=driver.findElements(radioButton);
		 for(int i=0;i<listbutton.size();i++) 
		 {
			WebElement element=listbutton.get(i);
			
			String ids=element.getAttribute("id");
		if(ids.equals(buttonclick)) {
			
			element.click();
			break;}
		}
		}




	public void marital_status(String status) {
		List<WebElement>liststatus=driver.findElements(maritalStatus);
		 for(int i=0;i<liststatus.size();i++) {
			
			WebElement element=liststatus.get(i);
			
		if(element.getText().equals(status)) {
			
			element.click();
			break;}
			}
		 }


	public void education_status(String edustatus) {
		List<WebElement>liststatus=driver.findElements(education);
		 for(int i=0;i<liststatus.size();i++) {
			
			WebElement element=liststatus.get(i);
			
		if(element.getText().equals(edustatus)) {
			
			element.click();
			break;}
			}
		 }


	public void employment_status(String employstatus) {
		List<WebElement>liststatus=driver.findElements(employment);
		 for(int i=0;i<liststatus.size();i++) {
			
			WebElement element=liststatus.get(i);
			
		if(element.getText().equals(employstatus)) {
			
			element.click();
			break;}
			}
		 }



	public void resident_status(String residentstatus) {
		List<WebElement>liststatus=driver.findElements(primaryResidence);
		 for(int i=0;i<liststatus.size();i++) {
			
			WebElement element=liststatus.get(i);
			
		if(element.getText().equals(residentstatus)) {
			
			element.click();
			break;}
			}
		 }





	public void Outside_Move_Status(String movementstatus) {
		List<WebElement>liststatus=driver.findElements(moveOutside);
		 for(int i=0;i<liststatus.size();i++) {
			
			WebElement element=liststatus.get(i);
			
		if(element.getText().equals(movementstatus)) {
			
			element.click();
			break;}
			}
		 }

	public void License_Status(String licensestatus) {
		List<WebElement>liststatus=driver.findElements(license);
		 for(int i=0;i<liststatus.size();i++) {
			
			WebElement element=liststatus.get(i);
			
		if(element.getText().equals(licensestatus)) {
			
			element.click();
			break;}
			}
		 }



	public void License_Year(String licenYear) {
		List<WebElement>liststatus=driver.findElements(licenseYear);
		 for(int i=0;i<liststatus.size();i++) {
			
			WebElement element=liststatus.get(i);
			
		if(element.getText().equals(licenYear)) {
			
			element.click();
			break;}
			}
		 }

	//public void YearofLicense(int index) {
//		WebElement year= driver.findElement(licenseYear);
//		Select sselectts=new Select(year);
//		sselectts.selectByIndex(index);}








	//public void licenceStatus() {
//		WebElement element=driver.findElement(license);
//		element.sendKeys(Keys.TAB);
	//}



	public void activeArmy() {
		WebElement element=driver.findElement(armedForce);
		element.click();
	}



	public void Accident_Claim_Damaage() {
		WebElement element=driver.findElement(accident);
		element.click();
	}

	public void Ticket_Violation() {
		WebElement element=driver.findElement(ticket);
		element.click();
	}

	public void continueButton()  {
		WebElement element=driver.findElement(buttonContinue);
		element.click();

		
	}

		
















		

		
		
		

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



