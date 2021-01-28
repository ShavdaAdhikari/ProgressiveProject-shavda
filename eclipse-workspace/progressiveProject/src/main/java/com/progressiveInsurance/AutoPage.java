package com.progressiveInsurance;


	
	
	
	
	
	
	
	
	
	
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class AutoPage {
		
	   public  WebDriver driver;
		
		By zipCode=By.xpath("//input[@id='zipCode_overlay']");
		
		By addHome=By.xpath("//button[@data-action='AU+H']");          
		
		By addCondo=By.xpath("//button[@data-action='AU+C']");  
		
		By addRenter=By.xpath("//button[@data-action='AU+R']");    
		
		By getQuote=By.xpath("//input[@id='qsButton_overlay']");       
		
		By learnMore=By.xpath("//a[@class='learn-more']");            
		
		
		
		
		public  AutoPage(WebDriver driver) {
			this.driver=driver;
		}
		                                                 
		
		public void enterZipCode(String Zipcode) {                
	        driver.findElement(zipCode).sendKeys(Zipcode);           
		}
			
	    
		public void bundleAddHome() {
			driver.findElement(addHome).click();
		}
		
		public void bundleAddCondo() {
			driver.findElement(addCondo).click();
		}
		
		public void bundleAddRenter() {
			driver.findElement(addRenter).click();
		}
		
		public void getAQuote() {
			driver.findElement(getQuote).click();
		}
		
		public void learnMoreOr() {
			driver.findElement(learnMore).click();
		}
		
		
		
		
		

		
		

	}



