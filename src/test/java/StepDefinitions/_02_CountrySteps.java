package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_CountrySteps {

    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @And("Navigate to country page")
    public void navigateToCountryPage() {
    ln.findAndClick("setup");
    ln.findAndClick("parameters");
    ln.findAndClick("countries");

    }

    @When("Create a country")
    public void createACountry() {
        dc.findAndClick("add");
        dc.findAndSend("nameInput","FenerimTürkiyeFBzinyoo");
        dc.findAndSend("codeInput","1907zinyoo");
        dc.findAndClick("save");
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("success","Country successfully created");
    }
}
