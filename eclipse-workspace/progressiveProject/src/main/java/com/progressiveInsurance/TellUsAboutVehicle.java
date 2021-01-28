package com.progressiveInsurance;

     import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;




	public class TellUsAboutVehicle {
		
		
		WebDriver driver;
		
		
		
		
		By yearOfVehicle=By.xpath("//li[@class='ng-star-inserted']");
		By bodyType=By.xpath("//select[@id='VehiclesNew_embedded_questions_list_BodyStyle']//option");
		By optionOfUse=By.xpath("//select[@id='VehiclesNew_embedded_questions_list_VehicleUse']//option");
		
		
		By removeVehicle=By.xpath("//navigation-button[@class='white remove ng-tns-c179-20 ng-star-inserted']");
		
	    By orByvin=By.xpath("//a[text()='Or enter by VIN']");
		
		By addAnother=By.xpath("//a [contains(@class ,'clickable add')]");
		
		
		By rideShare=By.xpath("//input[@id='VehiclesNew_embedded_questions_list_VehicleTransportNetworkCompanyIndicator']");
		
		By zipquestion=By.xpath("//input[@id='VehiclesNew_embedded_questions_list_GaragingZip']");
		
		By leaseOrown=By.xpath("//select[@id='VehiclesNew_embedded_questions_list_OwnOrLease']//option");
		
		By durationOfOwnership=By.xpath("//select[@id='VehiclesNew_embedded_questions_list_LengthOfOwnership']//option");
		
		By equippedWithAnti_thief=By.xpath("//input[@id='VehiclesNew_embedded_questions_list_AntitheftQualifyingDevice_Y']");
		
		
		By garageAddress=By.xpath("(//input[@type='radio' and @value='Y'])[1]");
		
		By emergencyBraking=By.xpath("(//input[@type='radio' and @value='Y'])[2]");
		
		
		
		By blindSpot=By.xpath("(//input[@type='radio' and @value='Y'])[3]");
		
		By donebuttons=By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
		By donebutton=By.xpath("(//loading-button[@data-automation-id='forwardNavigation'])[1]");
		By buttondone=By.xpath("//button[text()='Done']");
		By buttonContinue=By.xpath("//button[text()='Continue']");
		By contibutton=By.xpath("(//loading-button[@data-automation-id='forwardNavigation'])[2]");
		public TellUsAboutVehicle(WebDriver driver) {
			
			this.driver=driver;
			
		}

	public void madeYear(String madeyear) throws Exception {
		WebElement element=driver.findElement(By.xpath("//li[@tabindex='-2'][3]"));
		element.click();
		element.sendKeys(Keys.RETURN);
		element.sendKeys(madeyear);
		
	element.sendKeys(Keys.TAB);
	}


		
		public void selectYearOfVehicle(String madeyear) {
			List<WebElement>listCar=driver.findElements(yearOfVehicle);
			 for(int i=0;i<listCar.size();i++) 
			 {
				WebElement element=listCar.get(i);
				
			if(element.getText().equals(madeyear)) {
				
				element.click();
				break;}
			}
			}
		
		
	    public void madeByBodytype( String bodyTpe ) {
			List<WebElement>listCar=driver.findElements(bodyType);
			 for(int i=0;i<listCar.size();i++) {
				
				WebElement element=listCar.get(i);
				
			if(element.getText().equals(bodyTpe)) {
				
				element.click();
				break;}
				}
			 }
	    
	    public void usetype( String bodyTpe ) {
			List<WebElement>listCar=driver.findElements(optionOfUse);
			 for(int i=0;i<listCar.size();i++) {
				
				WebElement element=listCar.get(i);
				
			if(element.getText().equals(bodyTpe)) {
				
				element.click();
				break;}
				}
			 } 
	    public void leeseOrOwn( String choose ) {
					List<WebElement>listCar=driver.findElements(leaseOrown);
					 for(int i=0;i<listCar.size();i++) {
						
						WebElement element=listCar.get(i);
						
					if(element.getText().equals(choose)) {
						
						element.click();
						break;}
						}
					 }
	    
	 
	   
	   public void rideSharing() {
		   WebElement add=driver.findElement(rideShare);
		   add.click();
	   }
	   
	   public void orByVin() {
		   WebElement add=driver.findElement(orByvin);
		   add.click();
	   }
	   
	   public void primaryZip() {
		   WebElement elements=driver.findElement(zipquestion);
		   elements.sendKeys(Keys.TAB);
	   }
	   
	    public void lengthofOwnership(String length) {
			List<WebElement>listCar=driver.findElements(durationOfOwnership);
			 for(int i=0;i<listCar.size();i++) 
			 {
				WebElement element=listCar.get(i);
				
			if(element.getText().equals(length)) {
				
				element.click();
				break;}
			}
			}
	   
	   
	//   public void eQuipedAntiThef() {
//		   WebElement adds=driver.findElement(equippedWithAnti_thief);
//		   adds.click();
	//   }
	   

	  public void primaryGarageAddress() {
	   WebElement address=driver.findElement(garageAddress);
		   address.click();
	  }
	   
	   
	  public void emergencyBrakeAssistSystem() {
		   WebElement equipped=driver.findElement(emergencyBraking);
	   equipped.click();
	  }
	   
	   
	   
	   
	   public void blindAssistSystem() {
		   WebElement equipp=driver.findElement(blindSpot);
		   equipp.click();
	   }
	   
	   
	    public void doneAndClickButton(String saywhichbuttonclick) {
			List<WebElement>listbutton=driver.findElements(donebuttons);
			 for(int i=0;i<listbutton.size();i++) 
			 {
				WebElement element=listbutton.get(i);
				
				
			if(element.getText().equals(saywhichbuttonclick)){//(saywhichbuttonclick)) {
				
				element.click();
				break;}
			}
			}
	    public void doneButton() {
			   WebElement add2=driver.findElement(donebutton);
			   add2.click();
		   }
	    public void continueButtom() {
			   WebElement add4=driver.findElement( contibutton);
			   add4.click();
		   }
			

		
	   public void adanotherVehicle() {
		   WebElement add=driver.findElement(addAnother);
		   add.click();
	   }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


