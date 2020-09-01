package com.vtiger.StepDefinitions;



import com.vtiger.pages.HEADERPAGE;
import com.vtiger.pages.homepage;
import com.vtiger.pages.leadpage;
import com.vtiger.pages.loginpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



			public class BaseDefinitions extends BaseTests
			{
			
				
				//public WebDriver driver;  COMMENT AFTER CALLING LAUNCHAPP
				public leadpage ldp;
				
				
				
				//LOGIN 
				
				@Given("^user should be on login page$")
				public void user_should_be_on_login_page() throws Throwable 
				{

					   launchapp();
					   
					   System.out.println("application laucnhed");    //FOR GIT
					   
					   
				}
				
				@When("^user enters userid and password adn click login button$")
				public void user_enters_userid_and_password_adn_click_login_button() throws Throwable
				{
					//MAKE OBJECT OF LOGIN PAGE
					loginpage lp=new loginpage(driver);
					lp.login(prop.getProperty("username"),prop.getProperty("password"));
				}

				@Then("^user should be land on home page$")
				public void user_should_be_land_on_home_page() throws Throwable 
				{

					//MAKE OBJECT OF HOME PAGE
					homepage hp=new homepage(driver);
					hp.openpotential();
				}

				@Then("^close the browser$")
				public void close_the_browser() throws Throwable
				{
					driver.quit();
				}
				
				
				
				
				//LEAD CREATION

				@When("^user clicks on create lead link$")
				public void user_clicks_on_create_lead_link() throws Throwable
				{
					HEADERPAGE hdp=new HEADERPAGE(driver);
					  hdp.clicknewlead();
				}

				@Then("^user navigates on lead page$")
				public void user_navigates_on_lead_page() throws Throwable 
				{
					ldp=new leadpage(driver);
				}

				@When("^user enters lastname and company name$")
				public void user_enters_lastname_and_company_name() throws Throwable
				{
					ldp.lastname("makkr");
				    ldp.companyname("aghgjs");
				}

				@When("^click on save button$")
				public void click_on_save_button() throws Throwable
				{
					ldp.save();
				}

				@Then("^lead should be created successfully$")
				public void lead_should_be_created_successfully() throws Throwable
				{
					ldp.verifyleadcreation("makkr", "aghgjs");
				}

				@Then("^click on logout link$")
				public void click_on_logout_link() throws Throwable 
				{
					ldp.clicklogout();
				}

				@When("^user enters wrong  \"([^\"]*)\" and wrong \"([^\"]*)\" and click on login button$")
				public void user_enters_wrong_and_wrong_and_click_on_login_button(String arg1, String arg2) throws Throwable 
				{
					loginpage lp1=new loginpage(driver);
					lp1.login(arg1,arg2);
				}

				

			
			
			
			//*************************************************
			
			
			
			
				
				
				
				
			}
