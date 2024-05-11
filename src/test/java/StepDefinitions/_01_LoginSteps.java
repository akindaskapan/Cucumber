package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps{

    DialogContent elements =new DialogContent();

    @Given("navigate to campus")
    public void navigateToCampus() {

        GWD.getDriver().get("https://test.mersys.io/");

    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(elements.usernameInputBox)).sendKeys("turkeyts");
        wait.until(ExpectedConditions.elementToBeClickable(elements.passwordInputBox)).sendKeys("TechnoStudy123");
        elements.loginButton.click();
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
Assert.assertTrue(wait.until(ExpectedConditions.elementToBeClickable(elements.dashboardText)).getText().contains("Dashboard"));
    }
}