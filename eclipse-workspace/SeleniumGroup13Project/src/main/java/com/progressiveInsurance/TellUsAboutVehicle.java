package com.progressiveInsurance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TellUsAboutVehicle {
	
	
	WebDriver driver;
	
	
	//@FindBy(id ="VehiclesNew_embedded_questions_list_GaragingSameAsMailingAddress_Y")
	//WebElement garageZip;
	
	By yearOfVehicle=By.xpath("//li[@class='ng-star-inserted']");
	By bodyType=By.xpath("//select[@id='VehiclesNew_embedded_questions_list_BodyStyle']//option");
	By optionOfUse=By.xpath("//select[@id='VehiclesNew_embedded_questions_list_VehicleUse']//option");
	//By garageAddress=By.xpath("//input[@type='radio']");
	
	
	By removeVehicle=By.xpath("//navigation-button[@class='white remove ng-tns-c179-20 ng-star-inserted']");
	
    By orByvin=By.xpath("//a[@ng-class='enter-by-vin-class']");
	
	By addAnother=By.xpath("//a [contains(@class ,'clickable add')]");
	
	
	By rideShare=By.xpath("//input[@id='VehiclesNew_embedded_questions_list_VehicleTransportNetworkCompanyIndicator']");
	
	By zipquestion=By.xpath("//input[@id='VehiclesNew_embedded_questions_list_GaragingZip']");
	//By zipquestion=By.xpath("//input[@type='tel' and @autocorrect='off']");
	By leaseOrown=By.xpath("//select[@id='VehiclesNew_embedded_questions_list_OwnOrLease']//option");
	
	By durationOfOwnership=By.xpath("//select[@id='VehiclesNew_embedded_questions_list_LengthOfOwnership']//option");
	
	By equippedWithAnti_thief=By.xpath("//input[@id='VehiclesNew_embedded_questions_list_AntitheftQualifyingDevice_Y']");
	
	//By garageAddress=By.xpath("//input[@id='VehiclesNew_embedded_questions_list_GaragingSameAsMailingAddress_Y']");
	//By garageAddress=By.xpath("(//input[@name='viewModel_embedded_questions_list_GaragingSameAsMailingAddress'])[1]");
	//By garageAddress=By.xpath("(//span[text()='Yes'])[1]");
	By garageAddress=By.xpath("//input[@type='radio' and @value='Y']");
	By emergencyBraking=By.xpath("//input[@id='VehiclesNew_embedded_questions_list_AutomaticEmergencyBraking_Y']");
	
	By blindSpot=By.xpath("//input[@id='VehiclesNew_embedded_questions_list_BlindSpotWarning_N']");
	
	By donebutton=By.xpath("//button[@tabindex='-2']");
	
	By continueButton=By.xpath("//button[text()='Continue']");
	
	
	public TellUsAboutVehicle(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//	public void selectyear(String year) {
//		WebElement element=driver.findElement(yearOfVehicle);
//		Select select =new Select(element);
//		select.selectByVisibleText(year);
//	}

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
		 } public void leeseOrOwn( String choose ) {
				List<WebElement>listCar=driver.findElements(leaseOrown);
				 for(int i=0;i<listCar.size();i++) {
					
					WebElement element=listCar.get(i);
					
				if(element.getText().equals(choose)) {
					
					element.click();
					break;}
					}
				 }
    
    
   
////   public void enterBodyType(int index) {
////		WebElement element=driver.findElement(bodyType);
////		Select select1=new Select(element);
////		select1.selectByIndex(index);
////
////	}
    

//    public void  Remove() {
// 	   WebElement removeButton=driver.findElement(removeVehicle);
// 	   removeButton.click();
//    }
//    
//    
//     public void orChooseByVin() {
// 	   WebElement orvinButton=driver.findElement(orByvin);
// 	   //orvinButton.click();
// 	   orvinButton.sendKeys(Keys.TAB);
//    }
////    
//    
  
//   public void purposeOFUse(int index) {
//	WebElement element=driver.findElement(optionOfUse);
//	Select select2=new Select(element);
//	select2.selectByIndex(index);
//
//	}
   
   public void rideSharing() {
	   WebElement add=driver.findElement(rideShare);
	   add.click();
   }
	
   public void primaryZip() {
	   WebElement elements=driver.findElement(zipquestion);
	   elements.sendKeys(Keys.TAB);
   }
   
   
//   public void selectLeaseOrOwn(int index) {
//		WebElement eleeement=driver.findElement(leaseOrown);
//		Select seeelect2=new Select(eleeement);
//		seeelect2.selectByIndex(index);
//
//	}
  

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
   
   
   public void eQuipedAntiThef() {
	   WebElement adds=driver.findElement(equippedWithAnti_thief);
	   adds.click();
   }
   
   
   public void garageAddress(String id) {
		List<WebElement>listbutton=driver.findElements(garageAddress);
		 for(int i=0;i<listbutton.size();i++) 
		 {
			WebElement element=listbutton.get(i);
			String ids=element.getAttribute(id);
			
		if(ids.equals(id)) {
			
			element.click();
			break;}
		}
		}
	
   
   
  // public void garageAddress() {
	//  garageZip.click();
  // }
   
//   public void primaryGarageAddress() {
//	   WebElement address=driver.findElement(garageAddress);
//	   address.click();
//   }
   
   
//   public void emergencyBrakeAssistSystem() {
//	   WebElement equipped=driver.findElement(emergencyBraking);
//	   equipped.click();
//   }
//   
//   
//   
//   
//   public void blindAssistSystem() {
//	   WebElement equipp=driver.findElement(blindSpot);
//	   equipp.click();
//   }
//   
//   
   
   
   
   public void doneAndClickButton(String saywhichbuttonclick) {
		List<WebElement>listbutton=driver.findElements(donebutton);
		 for(int i=0;i<listbutton.size();i++) 
		 {
			WebElement element=listbutton.get(i);
			
			
		if(element.equals(saywhichbuttonclick)) {
			
			element.click();
			break;}
		}
		}
   
   
//   public void  doneButttnclick() {
//	   WebElement Button=driver.findElement(donebutton);
//	   Button.click();
//   }
//   
//   public void  continueButttonclick() {
//	   WebElement Button=driver.findElement(continueButton);
//	   Button.click();
//	
//	   }
//   
//	
//   public void adanotherVehicle() {
//	   WebElement add=driver.findElement(addAnother);
//	   add.click();
//   }
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


