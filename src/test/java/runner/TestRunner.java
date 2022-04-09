package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\Functions\\Login.feature",
		// features=".\\Functions\\Signup.feature",
		//features = ".\\Functions\\Categories.feature",
		glue = "methods", monochrome = true, tags = { "@Test1" }, plugin = { "pretty", "html:test-output" })
public class TestRunner {

}
