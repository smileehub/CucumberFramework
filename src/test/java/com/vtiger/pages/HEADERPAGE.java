package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HEADERPAGE 
{

	private WebDriver driver;
	
	public HEADERPAGE(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(linkText="Logout")
	WebElement lnk_logout;
	
	
	@FindBy(linkText="My Account")
	WebElement lnk_myaccout;
	
	@FindBy(linkText="Leads")
	WebElement lnk_leads;
	
	@FindBy(linkText="New Lead")
	WebElement lnk_newlead;
	
	
	public void clicklogout()
	{
		lnk_logout.click();
	}
	
	
	public void clickmyaccount()
	{
		lnk_myaccout.click();
	}
	
	
	public void clicknewlead()
	{
	lnk_newlead.click();
	}
	
	
	public void clickleads()
	{
		lnk_leads.click();
	}
	
}
