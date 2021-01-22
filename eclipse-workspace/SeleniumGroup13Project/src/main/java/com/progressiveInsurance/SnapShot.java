package com.progressiveInsurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SnapShot {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@type='radio' and @value='Y']")
	WebElement enrollsnapYes;
	
	@FindBy(xpath="(//input[@type='radio' and @value='N'])[1]")
	WebElement enrollsnapNo;
	//@FindBy(xpath = "//button[text()='No, thanks']")
	//WebElement nothankssnap; 

	//@FindBy(xpath="//input[@id='SnapshotEnrollment40Edit_embedded_questions_list_SnapshotPolicyEnrollment_N']")
	//WebElement enrollsnapNo;
	
	@FindBy(xpath="//input[@id='SnapshotEnrollment40Edit_embedded_questions_list_SnapshotEnrollmentExperience_M']")
	WebElement mobileApp;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement clickboxbu;
	
	@FindBy(xpath = "//button[text()='No thanks, just auto']")
	WebElement nothanksjustauto; 
	
	public SnapShot(WebDriver driver) {
		
		this.driver=driver;
		
		
		PageFactory.initElements(driver, this);
		
		}
	
	
	public void SnapandContinue() throws Exception {
		enrollsnapNo.click();
		
		Thread.sleep(2000);
		clickboxbu.click();
		
		
	}
	
	
	public void no_Thanks_Just_Auto() {
		nothanksjustauto.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
