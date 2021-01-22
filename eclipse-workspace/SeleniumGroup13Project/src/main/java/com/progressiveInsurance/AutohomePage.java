package com.progressiveInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutohomePage {
	
   public  WebDriver driver;
	
	By zipCode=By.xpath("//input[@id='zipCode_overlay']");
	
	By addHome=By.xpath("//button[@data-action='AU+H']");            //chech??4
	
	By addCondo=By.xpath("//button[@data-action='AU+C']");   //chech??4
	
	By addRenter=By.xpath("//button[@data-action='AU+R']");    //chech??4
	
	By getQuote=By.xpath("//input[@id='qsButton_overlay']");        //chech??4
	
	By learnMore=By.xpath("//a[@class='learn-more']");            //chech??2       
	
	
	
	
	public  AutohomePage(WebDriver driver) {
		this.driver=driver;
	}
	                                                 
	
	public void enterZipCode(String Zipcode) {                 //	public void enterZipCode() {
        driver.findElement(zipCode).sendKeys(Zipcode);             //		driver.findElement(zipCode).sendKeys("40657");}
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
