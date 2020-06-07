package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/mohammedmannan/IdeaProjects/BDD_Web_Automation/src/main/java/features"},
        glue = "step_definitions",
        plugin = {"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports"},
        strict = true,
        monochrome = true,
        tags = {""}//smoke testing, regression testing those tags place here




)

public class CucumberTestRunner {
}
