package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class leadpage extends HEADERPAGE
{

	private WebDriver driver;
	
	
	
	  public leadpage(WebDriver driver)
	  {
		  super(driver);
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	  }
	
	
	  @FindBy(name="lastname")
	  WebElement tb_lastname;
	  
	  @FindBy(name="company")
	  WebElement tb_companyname;
	  
	  
	  @FindBy(name="button")
	  WebElement btn_save;
	  
	  
	  
	  //FOR LEAD VERIFY
	  @FindBy(xpath="//td[text()='Last Name:']/following::td[1]")
	  WebElement verify_lname;
	  @FindBy(xpath="//td[text()='Company:']/following::td[1]")
	  WebElement verify_cname;
	  
	  
	  public void lastname(String lastname)
	  {
		  tb_lastname.sendKeys(lastname);
	  }
	  
	  public void companyname( String comp)
	  {
		 
		  tb_companyname.sendKeys(comp);
	  }
	  
	  public void save()
	  {
		 
		  btn_save.click();
	  }
	  
	
	  
	  
	  
	  
	  
	  //TO VERIFY
	  public boolean verifyleadcreation(String lname,String comp)
	  {
		  String lnametxt=verify_lname.getText();
		  String cnametxt=verify_cname.getText();
		  
		  if(lnametxt.equals(lname)&&cnametxt.equals(comp))
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
	  }
	
	
	
	
	
	
	
}
