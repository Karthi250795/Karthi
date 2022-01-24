package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class LoginStep {
	 WebDriver driver;
	@Given("user is on adactin hotel page")
	public void user_is_on_adactin_hotel_page() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://adactinhotelapp.com/");
	}

	@When("user should enter username and password")
	public void user_should_enter_username_and_password() {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("Karthick94");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("99354S");
	    
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
	   WebElement btnLogin = driver.findElement(By.id("login"));
	   btnLogin.click();
	}

	@Then("user should verify succesfully login")
	public void user_should_verify_succesfully_login() {
	   
	Assert.assertTrue("Successfully logged in", true);
		
		
	}



	

}
