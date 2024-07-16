package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        //tags = "@SmokeTest or @Regression" ----> @Regression ya da @SmokeTest içeren senaryoları çalıştır  (or)
        tags = "@Regression and @SmokeTest", //----> sadece her ikisinin de bulunduğu senaryoları çalıştırır (and)

        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"}
)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
    //browser tipi vermek için, rapora ek parametre eklemek için burayı kullanacağız sonra.
}
