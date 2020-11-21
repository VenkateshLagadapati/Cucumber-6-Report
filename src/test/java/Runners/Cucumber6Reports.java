package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features", 
	glue = { "Steps" }, 
	tags = "@search",
	plugin = {"json:target/cucumber.json"}, 	
	dryRun = false, 
	monochrome = true,
	publish = true    // for cucumber reports
	)
public class Cucumber6Reports {

}
