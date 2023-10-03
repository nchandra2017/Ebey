package com.TestRun;

import org.testng.annotations.BeforeTest;
import com.UitilityBased.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

	@CucumberOptions(
	        features = {"src/test/resources/Features"} , 
            plugin = {"pretty",
            		"html:target/report/cucumber.html",
                    "json:target/report/cucumber.json" 
            		 
            },
            glue = "stepDefe",
            tags= "@TC_RF_00001"
      //    strict = false,
    //     dryRun = true

         		)


public class TestRunner extends AbstractTestNGCucumberTests {
		
		
	
@BeforeTest
    public void lanchbrowser() {
	Base_Class testurl = new Base_Class();
	testurl.DeffBrowser();

	
/*         }
@DataProvider(parallel = true)
public Object[][] Scenario(){
	return features() ;            */
	
	
}




//@AfterTest 
    public void closebrowser() {
	Base_Class.driver.quit();
	
}

	
}
