package com.progressiveInsurance;


	
	
	
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class NoThankSnapShot {
		
		WebDriver driver;
		
		@FindBy(xpath="//input[@type='radio' and @value='N']")
		WebElement enrollsnapYes;
		
		@FindBy(xpath="//input[@analytics-id='SnapshotEnrollment40Edit_SnapshotPolicyEnrollment_N']")
		WebElement enrollsnapNo;
		@FindBy(xpath="//input[@analytics-id='SnapshotEnrollment40Edit_SnapshotPolicyEnrollment_N']")
		WebElement enrollsnapNos;
		
		@FindBy(xpath="//input[@id='SnapshotEnrollment40Edit_embedded_questions_list_SnapshotEnrollmentExperience_M']")
		WebElement mobileApp;
		
		@FindBy(xpath="//button[text()='Continue']")
		WebElement clickboxbu;
		
		@FindBy(xpath ="//loading-button[@data-automation-id='forwardNavigation']")                                          // "//button[text()='No thanks, just auto']")
		WebElement nothanksjustauto; 
		
		public  NoThankSnapShot (WebDriver driver) {
			
			this.driver=driver;
			
			
			PageFactory.initElements(driver, this);
			
			}
		public void Snapclick3() {
			enrollsnapYes.click();}
			
		
		public void Snapclick() {
			enrollsnapNo.click();
			
			
			
		}
		public void Snapclicks() {
			enrollsnapNo.click();
			
			
			
		}
		
		public void no_Thanks_Just_Auto() {
			nothanksjustauto.click();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	
	
	
	
	


