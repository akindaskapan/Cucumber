package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/java/FeatureFiles/_01_Login.feature",
                            "src/test/java/FeatureFiles/_02_Country.feature"},



        glue = {"StepDefinitions"},
        dryRun = false // true olduğunda testi çalıştırmaz sadece steplere ait feature'ların varlığını kontrol eder.
        // false olduğunda ise testi çalıştırır.
)
public class _02_TestRunnerBelirliFeaturelar extends AbstractTestNGCucumberTests {

}
