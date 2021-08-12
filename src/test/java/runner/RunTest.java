package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
       (
    		   
    		   features="src/test/resources/BUSINESS_LOGIC/",
    		   tags="@SmokeTest",
    		   glue="cucumbermapping",
    		   monochrome=true,
    		   plugin="pretty"
    	
		
		
		
		)
    
	
	
    


public class RunTest {

}
