package com.vtiger.StepDefinitions;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTests
{

	
	public WebDriver driver;
	Properties prop;
	
	
	
	public void launchapp() throws IOException
	{
		
	//CALL METHOD READPROPERTIES HERE
		readproperties();
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	
	
	
	
	public void readproperties() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/java/com/vtiger/properties/config.properties");
		prop.load(fis);		
	}
	
	
	
	
	
	
}
