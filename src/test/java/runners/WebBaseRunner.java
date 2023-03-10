package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import steps.Hooks;




@RunWith(Cucumber.class)
@CucumberOptions(glue = {"steps"},
                 features = "src/test/resources/features/google", 
                 plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                		 ,"json:results/cucumber.json"
                		 ,"junit:results/cucumber.xml"},
		         tags = "@google",
                 monochrome = true)

public class WebBaseRunner extends Hooks{

}
