package com.vtiger.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions

		(
				features = "src/test/resources/Features/"
				 ,glue={"com.vtiger.StepDefinitions"}
			//,format= {"pretty","html:target/Destination"}    //COMMENTED TO CREATE NEW WAY OF REPORT
				
				,plugin= {"pretty","html:target/cucumber-html-report","json:target/cucumber.json"}
				,tags= {"@run"}	
				,monochrome=true
					
					
		)








public class TestRunner {

}
