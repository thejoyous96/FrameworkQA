package com.careerhack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {

	WebDriver driver; 
	
	public GoogleHome(WebDriver driver) {
		
		this.driver = driver; 
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "q")
	
	WebElement searchBox; 
	
	public void enterSearch(String string) {
		
		searchBox.sendKeys(string);
		
	}
	
	@FindBy(name = "btnI")
	
	WebElement clickBtn;
	
	public void clickBtn() {
		
		clickBtn.click();
		
	}
}
