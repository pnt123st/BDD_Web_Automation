package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/mohammedmannan/IdeaProjects/BDD_Web_Automation/src/main/java/features/searchOnAmazon.feature"},
        glue = "step_definitions",
        plugin = {"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports"},
        strict = true,
        monochrome = true,
        tags = {""}




)

public class CucumberTestRunner {
}
