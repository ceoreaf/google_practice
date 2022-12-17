package com.google.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class googleSearch {
	
	
	public WebDriver driver;

	@Given("im on the google home page")
	public void im_on_the_google_home_page() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@When("i enter the {string} in the search bar")
	public void i_enter_the_in_the_search_bar(String Product_Name) {
		
		WebElement searchbar = driver.findElement(By.className("gLFyf"));
		
		searchbar.sendKeys(Product_Name);
		
	}

	@When("I click on the search icon button")
	public void i_click_on_the_search_icon_button() {
		WebElement searchbutton = driver.findElement(By.className("gNO89b"));
		searchbutton.click();
		
	}

	@Then("i can see the search results succesfully")
	public void i_can_see_the_search_results_succesfully() {
	}
	
	
	
	
}
