package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.careerhack.common.GoogleBase;
import com.careerhack.pages.GoogleHome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FeelingLucky extends GoogleBase{
	
	//WebDriver driver;
	
	GoogleHome gh;
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		launchBrowser();
		
		/*
				
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		*/

	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {

		/*
		
		WebElement searchBox;
		
		searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys(string);
		
		*/
		
		gh = new GoogleHome(driver);
		
		gh.enterSearch(string);
		
	}

	@When("I click on I am Feeling Lucky button")
	public void i_click_on_i_am_feeling_lucky_button() {
		
		/*
		
		WebElement luckyBtn;
		
		luckyBtn = driver.findElement(By.name("btnI")); //ID for Lucky Button
		
		luckyBtn.click();
		
		*/
		
		gh.clickBtn();
	}

	@Then("I land on the first result homepage")
	public void i_land_on_the_first_result_homepage() {
		
		/*
	
		System.out.println("=================================");
		
		System.out.println("SUCCESS");
		
		System.out.println("=================================");
				
		 */
		
		System.out.println("=================================");
		
		System.out.println("Automation SUCCESS!");
		
		System.out.println("=================================");
		
		closeBrowser();
		
	}

}
