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
		
		
		By suffix=By.xpath("//select[@analytics-id='NameAndAddressEdit_Suffix']");
		
		By birthDate=By.xpath("//input[@analytics-id='NameAndAddressEdit_DateOfBirth']");
		
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
		
		
		   
		   
		   public void city() {
				
				WebElement lex=driver.findElement(By.xpath("/input[@analytics-id='NameAndAddressEdit_City']"));
				
				
				lex.sendKeys(Keys.TAB);
			}
		
		   
		   
		   public void zip() {
				
				WebElement zipcode=driver.findElement(By.xpath("//input[@analytics-id='NameAndAddressEdit_ZipCode']"));
				
				
				zipcode.sendKeys(Keys.TAB);
			}

		public void P_O_Boxno() {
			WebElement eeelleemmeent=driver.findElement(P_O_BNumber);
			eeelleemmeent.click();}                                                         
			
		
		public void OkStartQuoteButton() {
			driver.findElement(OkStartquote).click();
		}
		
		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


