package com.progressiveInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class StartQuotePage {
	
	WebDriver driver;
	
	By firstName=By.xpath("//input[@analytics-id='NameAndAddressEdit_FirstName']");
	
	By middleInitial=By.xpath("//input[@analytics-id='NameAndAddressEdit_MiddleInitial']");
	
	By lastName=By.xpath("//input[@analytics-id='NameAndAddressEdit_LastName']");
	
	//By suffix=By.xpath("//select[@analytics-id='NameAndAddressEdit_Suffix']//option");
	By suffix=By.xpath("//select[@analytics-id='NameAndAddressEdit_Suffix']");
	
	By birthDate=By.xpath("//input[@analytics-id='NameAndAddressEdit_DateOfBirth']");
	
	//By streetName=By.xpath("//input[@analytics-id='NameAndAddressEdit_MailingAddress']");
	
	
//	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_MailingAddress")
//	WebElement streenName;
	//@FindBy(How=How.ID,using=)
	//@FindBy(css = "#NameAndAddressEdit_embedded_questions_list_MailingAddress")
	//WebElement streenName;
	
	
	
	
	//By streetName=By.xpath("(//question[@data-automation-id='mailingAddress']//div[@class='placeholder'])");
	//By apartmentNo=By.xpath("//input[@analytics-id='NameAndAddressEdit_ApartmentUnit']");
	//By apartmentNo=By.xpath("//question[@data-automation-id='apartmentNumber']");
	By mailingCity=By.xpath("/input[@analytics-id='NameAndAddressEdit_City']");
	
	By zipCode=By.xpath("//input[@analytics-id='NameAndAddressEdit_ZipCode']");
	
	By P_O_BNumber=By.xpath("//input[@analytics-id='NameAndAddressEdit_MailingZipType']");
	
	By OkStartquote=By.xpath("(//button[@tabindex='-2'])[1]");
	
	
		
	
	public StartQuotePage(WebDriver driver) {
		this.driver=driver;
	}

	
	public void enterFirstName(String name) {
		driver.findElement(firstName).sendKeys(name);
	}
	
	
	public void enterMiddleInitial() {
		driver.findElement(middleInitial).sendKeys("H");
	}
	
	
	public void enterLastName(String lastname ) {
		driver.findElement(lastName).sendKeys(lastname);;
	}
	
	
	public void chooseSuffix(int index) {
		WebElement element=driver.findElement(suffix);
		
		Select selectSuffix=new Select(element);
	selectSuffix.selectByIndex(index);
	}
	
  /*  public void chooseSuffix(String value) {
	    WebElement element=driver.findElement(suffix);
    	Select selectSuffix=new Select(element);
		selectSuffix.selectByValue(value);
	}
	
	//AlternateMethod
	//public
	*/
	
	public void DateOfBirth(String twodigitDay, String twodigitMonth, String fourdigitYear ) {
		driver.findElement(birthDate).sendKeys(twodigitDay,twodigitMonth,fourdigitYear);
		driver.findElement(birthDate).sendKeys(Keys.TAB);
	}
	
	
       public void streeeeeeeeet(String address) {
		
		WebElement elmnt=driver.findElement(By.xpath("//input[@analytics-id='NameAndAddressEdit_MailingAddress']"));
		elmnt.click();
		elmnt.sendKeys(Keys.RETURN);
		elmnt.sendKeys(address);
		elmnt.sendKeys(Keys.TAB);
		
		}
	
	
	   public void Apteeeeeeeeet() {
		
		WebElement aptelmnt=driver.findElement(By.xpath("//input[@analytics-id='NameAndAddressEdit_ApartmentUnit']"));
		aptelmnt.click();
		aptelmnt.sendKeys(Keys.RETURN);
		aptelmnt.sendKeys("128");
		aptelmnt.sendKeys(Keys.RETURN);
		aptelmnt.sendKeys(Keys.TAB);
	}
	
	//public void enterStreetName(String houseNoAndStreet ) {
	//driver.findElement(streetName).sendKeys(houseNoAndStreet);}
			
	
	//public void enterStreetName(String houseNoAndStreet ) {
		
		//streenName.sendKeys(houseNoAndStreet );
	//}
				
	
//	public void choosestreet(String value) {
//	    WebElement element=driver.findElement(streetName);
//    	Select selectSuffix=new Select(element);
//		selectSuffix.selectByValue(value);
//	}

//	public void aptNumber(String aptNo ) {
//		driver.findElement(apartmentNo).sendKeys(aptNo);
//	}
	   
	   
	   public void city() {
			
			WebElement lex=driver.findElement(By.xpath("/input[@analytics-id='NameAndAddressEdit_City']"));
			
			
			lex.sendKeys(Keys.TAB);
		}
	
	   
	   
	   public void zip() {
			
			WebElement zipcode=driver.findElement(By.xpath("//input[@analytics-id='NameAndAddressEdit_ZipCode']"));
			
			
			zipcode.sendKeys(Keys.TAB);
		}
//	public void cityofMailing() {
//		driver.findElement(mailingCity).sendKeys(Keys.TAB);
//	}
//	
//	public void ZipcodeNo() {
//		driver.findElement(zipCode).sendKeys(Keys.TAB);
//	}
	
	public void P_O_Boxno() {
		WebElement eeelleemmeent=driver.findElement(P_O_BNumber);
		eeelleemmeent.click();}                                                         
		
	
	public void OkStartQuoteButton() {
		driver.findElement(OkStartquote).click();
	}
	
	}
	
	
	

