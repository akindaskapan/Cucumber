package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

public LeftNav()
{
    PageFactory.initElements(GWD.getDriver(),this);
}



@FindBy (xpath = "(//span[text()='Setup'])[1]")
private WebElement setup1;

@FindBy (xpath = "//span[text()='Parameters']")
private WebElement parameters;

@FindBy (xpath = "//span[text()='Countries']")
private WebElement countries;

@FindBy (xpath = "//span[text()='Citizenships']")
private WebElement citizenship;

@FindBy(xpath = "//span[text()='Nationalities']")
private WebElement nationalities;
@FindBy(xpath = "//span[text()='Fees']")
private WebElement fees;
@FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
private WebElement entranceExam1;
@FindBy (xpath = "(//span[text()='Setup'])[2]")
private WebElement setup2;
@FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
private WebElement entranceExam2;
@FindBy(xpath = "(//span[text()='Custom Fields'])[1]")
private WebElement customFields;

    public WebElement myElement;

    public void findAndClick(String strElement){

        //Stringten WebElemente ulaşalım
        switch (strElement)
        {
            case "setup1": myElement=setup1;break;
            case "parameters": myElement=parameters;break;
            case "countries": myElement=countries;break;
            case "citizenship": myElement=citizenship;break;
            case "nationalities": myElement=nationalities;break;
            case "entranceExam1": myElement=entranceExam1;break;
            case "setup2": myElement=setup2;break;
            case "entranceExam2": myElement=entranceExam2;break;
            case "fees": myElement=fees;break;
            case "customFields": myElement = customFields;break;

        }
        clickFunction(myElement);
    }












}
