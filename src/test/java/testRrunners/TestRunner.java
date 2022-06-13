package testRrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\features" }, 
				glue = {"stepdefinitions","ApplicationHooks" },
				tags = "@AccountPage", 
				plugin = { "pretty", "json:target/MyReports/report.json"},
				monochrome = true
				)
public class TestRunner {

}
