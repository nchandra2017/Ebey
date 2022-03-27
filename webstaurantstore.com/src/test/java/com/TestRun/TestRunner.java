package com.TestRun;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.UitilityBased.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

	@CucumberOptions(
	        features = {"src/test/resources/Features"} , 
            plugin = {"json:target/cucumber.json"},
            glue = "stepDefe",
            
            
         tags= {"@TC_RF_001"})



public class TestRunner extends AbstractTestNGCucumberTests {

@BeforeTest
    public void lanchbrowser() {
	Base_Class testurl = new Base_Class();
	testurl.DeffBrowser();

	
}

  @AfterTest 
    public void closebrowser() {
	Base_Class.driver.quit();
	
}

	
}
