package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/SignIn.feature",
		glue = {"stepdefinationfile","hooks" },
		//plugin = { "pretty", "html:target/cucumber-html-report", "json:cucumber.json"}

		plugin = {"pretty" , "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
//		plugin = { "json:cucumber.json" }

)
public class TestRunner {

}
