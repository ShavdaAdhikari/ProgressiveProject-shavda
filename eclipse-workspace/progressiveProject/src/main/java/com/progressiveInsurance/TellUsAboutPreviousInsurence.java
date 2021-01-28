package com.progressiveInsurance;


	
	
	
	
	
	
	
	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class TellUsAboutPreviousInsurence {
		WebDriver driver;
		
	 @FindBy(id ="FinalDetailsEdit_embedded_questions_list_PrimaryEmailAddress" )
		 WebElement elemet;
	 
	 @FindBy(xpath="//loading-button[@data-automation-id='forwardNavigation']")
		WebElement clickbu;

		 public TellUsAboutPreviousInsurence (WebDriver driver) {
			this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		}
		
		
		public void totalresident(String number) {
		WebElement element=driver.findElement(By.xpath("//select[@id='FinalDetailsEdit_embedded_questions_list_TotalResidents']"));
		element.click();
		element.sendKeys(Keys.RETURN);
		element.sendKeys(number);
		
		element.sendKeys(Keys.TAB);}
		

		public void currentLiving(int index) {
			WebElement element=driver.findElement(By.xpath("//select[@id='FinalDetailsEdit_embedded_questions_list_CurrentResidence']"));//findElement("//select[@id='FinalDetailsEdit_embedded_questions_list_CurrentResidence']");
		Select elementsss=new Select(element);
		elementsss.selectByIndex(index);}

		
		
		public void claimCount(int index) {
			WebElement element=driver.findElement(By.xpath("//select[@id='FinalDetailsEdit_embedded_questions_list_TotalPipClaimsCount']"));
		Select elementss=new Select(element);
		elementss.selectByIndex(index);}


	public void emailAndPolicyStartDate(String email) throws InterruptedException{
		elemet.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		elemet.sendKeys(email);
		elemet.sendKeys(Keys.RETURN);
		elemet.sendKeys(Keys.TAB);
		}


		
	public void clickbutton() {
		
		clickbu.click();
	}

		
		
		
		
		
		
		
		
		
		
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


