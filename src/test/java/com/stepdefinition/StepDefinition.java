package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	
	@Given("^user is loading the pixel power application$")
	public void user_is_loading_the_pixel_power_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fenerbahce\\eclipse-workspace\\PracticeTest\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	   driver.get("https://www.pixelpower.com/");
	   Thread.sleep(10000);
	   
	}

	@Then("^user is clicking the signin button of the application$")
	public void user_is_clicking_the_signin_button_of_the_application() throws Throwable {
		WebElement element1=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		element1.click();
		Thread.sleep(10000);
	   WebElement element2= driver.findElement(By.xpath("//a[@href ='applications/']")); 
	   element2.click();
	   Thread.sleep(10000);
	}

	@When("^user is giving username and password for the login$")
	public void user_is_giving_username_and_password_for_the_login() throws Throwable {
	   System.out.println("application menu is clicked succeessfully");
	}

	@And("^user is clicking the login button of the application$")
	public void user_is_clicking_the_login_button_of_the_application() throws Throwable {
	    System.out.println("my akka learned the framework");
	}


}
