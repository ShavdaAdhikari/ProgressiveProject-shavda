package com.progressiveInsurance;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TellUsaboutPreviousInsurance {
	
	WebDriver driver;
	
	 @FindBy(id ="FinalDetailsEdit_embedded_questions_list_PrimaryEmailAddress" )
	 WebElement elemet;
	
	@FindBy(xpath="(//input[@type='radio' and @value='Y'])[1]")
	WebElement avilabilityToday;
	
	@FindBy(xpath="(//input[@type='radio' and @value='Y'])[2]")
	WebElement daysLapse;
	
	@FindBy(xpath="(//input[@type='radio' and @value='N'])[3]")
	WebElement nonautoPolicy;
	
	@FindBy(xpath="(//input[@type='radio' and @value='N'])[4]")
	WebElement lastMonthPolicy;
	
	//@FindBy(xpath="//input[@id='FinalDetailsEdit_embedded_questions_list_AdvancedShopperPolicyEffectiveDate']")
	//WebElement policyStartDate;
	
	@FindBy(xpath = "//select[@id='FinalDetailsEdit_embedded_questions_list_RecentAutoInsuranceCompanyPeriod']")
	WebElement Duration_with_other_company; 
	
	@FindBy(xpath="//select[@id='FinalDetailsEdit_embedded_questions_list_BodilyInjuryLimits']")
	WebElement bodilylimit;
	
	//@FindBy(xpath="//input[@type='text' and @id='FinalDetailsEdit_embedded_questions_list_PrimaryEmailAddress']")
	//WebElement emailofclint;
	
	//@FindBy(xpath="//select[@id='FinalDetailsEdit_embedded_questions_list_TotalResidents']")
	//WebElement liveinHome;
	
	@FindBy(xpath="//select[@id='FinalDetailsEdit_embedded_questions_list_CurrentResidence']")
     WebElement currentResidence;
	
	@FindBy(xpath="//select[@analytics-id='FinalDetailsEdit_TotalResidents']//option")
	List<WebElement> liveinHome;
	
	
	@FindBy(xpath="//select[@id='FinalDetailsEdit_embedded_questions_list_TotalPipClaimsCount']/option")
	List<WebElement> totalclaimcount;
	
	@FindBy(xpath="//button[text()='Continue']")
			WebElement clickbu;
	
	////input[@id='FinalDetailsEdit_embedded_questions_list_AdvancedShopperPolicyEffectiveDate']
	
	public TellUsaboutPreviousInsurance(WebDriver driver) {
		this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
	}
	
	
	public void membersLiveInHome(String number) {
		List<WebElement>listingofHome=liveinHome;
		 for(int i=0;i<listingofHome.size();i++) 
		 {
			WebElement element=listingofHome.get(i);
			
			
		if(element.equals(number)) {
			
			element.click();
			break;}
		}
		}
	
	public void totalClaimCount(String number) {
		List<WebElement>listingofHome=totalclaimcount;
		 for(int i=0;i<listingofHome.size();i++) 
		 {
			WebElement element=listingofHome.get(i);
			
			
		if(element.equals(number)) {
			
			element.click();
			break;}
		}
		}
	
	
	public void insuranceofToday() throws Exception {
		clickbu.click();
		Thread.sleep(3000);
        avilabilityToday.click();
        
		}
	
	
	public void Duration_With_Other_Company(int indexforotherCompany) {
		Select element=new Select(Duration_with_other_company);
		element.selectByIndex(indexforotherCompany);
		
	}
	
	
	public void thirtyDaysLapse() {
		daysLapse.click();
	}
	
	
	public void bodilyInjureLimit(int indexbodilylimit) {
	Select element1=new Select(bodilylimit);
	element1.selectByIndex(indexbodilylimit);}
	
public void nonOrLastMonthPolicy() throws Exception {
		
	nonautoPolicy.click();
	Thread.sleep(2000);
	lastMonthPolicy.click();

	}

public void emailAndPolicyStartDate(String email){
	
	//policyStartDate.sendKeys(startDate);
	//Thread.sleep(2000);
	//System.out.println(emailofclint.isEnabled());
	elemet.click();
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	elemet.sendKeys(email);
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	elemet.sendKeys(Keys.RETURN);
	
}
	

//public void numberOfResidentinHome(String value ,String noofclaim) throws InterruptedException {
//	Select element=new Select(liveinHome);
//	element.selectByValue(value);
//	Thread.sleep(2000);

//	Select element2=new Select(totalclaimcount);
//	element2.selectByValue(noofclaim);
//}
//	
	
public void clickbutton() {
	
	clickbu.click();
}

	
	
	
	
	
	
	
	
	
	
	

}
