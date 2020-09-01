package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage        extends HEADERPAGE         //extends after home page initialization
{

	//WE WANT OT VERIFY THAT WE ARE ON HOME PAGE
	//VERIFY OPENPOTRNTIAL TEXT
	
	private WebDriver driver;
	
	public homepage(WebDriver driver)
	{
		//for calling consrutor of headerpage
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//td[contains(text(),'My Top Open Potentials')]")
	WebElement verify_openpotentials;
	
	
	/*
	public void openpotential()
	{
		verify_openpotentials.isDisplayed();
	}
	*/

//USE RETURN HERE IN THIS MEHTHOD

	public boolean openpotential()
	{
		return verify_openpotentials.isDisplayed();
	}


}
