package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\anil.basudkar\\eclipse-workspace\\DSAlgo-FourPetal\\src\\test\\resources\\features",
		glue = {"stepdefinationfile","hooks" }, 
		plugin = { "pretty", "html:target/cucumber-html-report", "json:cucumber.json" }

)
public class TestRunner {

}
