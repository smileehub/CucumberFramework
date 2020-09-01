package com.vtiger.pages;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class loginpage
{

	//FIRST
	private WebDriver driver; 

	
	
	//NOW WANT THAT //ANY PAGE THAT REQUIRES WEBDRIVER// CAN TAKE FROM HERE //SO MAKE THIS AS CONSTRUTOR
	public loginpage(WebDriver driver)   //handling code
	{
		this.driver=driver;
	
		PageFactory.initElements(driver, this);
	}
	
	

	//IF WE USE PAGE FACTORY
	//WE USE ANNOTATION IN THIS
	@FindBy(name="user_name")
	WebElement tb_username;
	
	@FindBy(name="user_password")
	WebElement tb_password;
	
	@FindBy(name="Login")
	WebElement btn_login;
	
	
	
	//FOR LOGO
	@FindBy(xpath="//img[@src='include/images/vtiger-crm.gif']")
	List<WebElement> logo_verify;     //FOR SIZE
	
	
	public void login(String userid,String pass)   //COMMENT THIS LINE AFTER REURIIMG HOME AGE
	//public String  login(String userid,String pass)
	{
		
		
		
		
		tb_username.clear();
		
		tb_username.sendKeys(userid);
		
		tb_password.sendKeys(pass);
		
		btn_login.click();
	
		
		
		
		
		
		
		
	}
	
	
	public void verifytitle(String expcstr)
	{
	}
	
	
	
	public void logo()
	{
	}
	
	
}
