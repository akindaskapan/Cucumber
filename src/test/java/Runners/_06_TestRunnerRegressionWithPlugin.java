package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"},

        plugin = { "html:target/cucumber-reports.html" }   //senaryonun raporunu solda Project kısmında target klasörünün içine kaydeder
)
public class _06_TestRunnerRegressionWithPlugin extends AbstractTestNGCucumberTests {

}