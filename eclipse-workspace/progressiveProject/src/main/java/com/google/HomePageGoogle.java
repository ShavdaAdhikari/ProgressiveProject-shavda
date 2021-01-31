package com.google;


	
	
	
	
	
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomePageGoogle {
		
		public WebDriver driver;
		
		
		
		
		
		
		
		
		
		
		
		
		@FindBy(xpath ="//input[@name='q']")
		WebElement searchBox;
		
		
		
		public HomePageGoogle(WebDriver driver) {
			this.driver=driver;

			
		
		PageFactory.initElements(driver, this);}
		
		
		
		public void search(String write) {
			searchBox.sendKeys(write);
			searchBox.sendKeys(Keys.RETURN);}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}



