package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.math3.random.RandomDataGenerator;

import java.util.Random;

public class _02_CountrySteps {

    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @And("Navigate to country page")
    public void navigateToCountryPage() {
    ln.findAndClick("setup1");
    ln.findAndClick("parameters");
    ln.findAndClick("countries");

    }

    @When("Create a country")
    public void createACountry() {
        String randomGenerateName= RandomStringUtils.randomAlphabetic(8);//8 harfli rastgele string oluşturdum
        String randomGenerateCode= RandomStringUtils.randomNumeric(8);//8 tane rastgele sayı oluşturdum
        dc.findAndClick("add");
        dc.findAndSend("nameInput",randomGenerateName);
        dc.findAndSend("codeInput",randomGenerateCode);
        dc.findAndClick("save");
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("success","successfully");
    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String code) {
        dc.findAndClick("add");
        dc.findAndSend("nameInput",name);
        dc.findAndSend("codeInput",code);
        dc.findAndClick("save");

    }
}
