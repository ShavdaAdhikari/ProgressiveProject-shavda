package com.progressiveInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
		WebDriver driver;
	
	
	By autoImage=By.xpath("//img[@src='https://www.progressive.com/Content/images/DomainProgressive/wh3/base/icons/products/blue/AU.svg']");
	
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}

	
	
	
	public void clickAutopicture() {
		
		driver.findElement(autoImage).click();
		
		
	}
	
	
	
	
	
	
	
}
