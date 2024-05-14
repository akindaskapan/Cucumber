package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id=\"mat-input-0\"]")
    private WebElement usernameInputBox;
    @FindBy(xpath = "//input[@id=\"mat-input-1\"]")
    private WebElement passwordInputBox;
    @FindBy(xpath = "//span[text()=' GİRİŞ YAP ']")
    private WebElement loginButton;
    @FindBy(xpath = "//span[text()=' Dashboard ']")
    private WebElement dashboardText;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button") //ortak add butonu
    private WebElement addButton;
    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")  //ortak nameInputBox
    private WebElement nameInput;
    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input") //ortak codeInput
    private WebElement codeInput;

    @FindBy(xpath="//ms-save-button//button") //ortak save butonu
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]") //ortak successMsg
    private WebElement successMessage;


    WebElement myElement;

    public void findAndSend(String strElement, String value){

        //Stringten WebElemente ulaşalım
        switch (strElement)
        {
            case "username": myElement=usernameInputBox;break;
            case "password": myElement=passwordInputBox;break;
            case "nameInput": myElement=nameInput;break;
            case "codeInput": myElement=codeInput;break;
        }
sendkeysFunction(myElement,value);
    }

 public void findAndClick(String strElement){

        //Stringten WebElemente ulaşalım
        switch (strElement)
        {
            case "loginButton": myElement=loginButton;break;
            case "add": myElement=addButton;break;
            case "save": myElement=saveButton;break;
        }
clickFunction(myElement);
    }

public void findAndContainsText(String strElement,String text){

        //Stringten WebElemente ulaşalım
        switch (strElement)
        {
            case "dashboard": myElement=dashboardText;break;
            case "success": myElement=successMessage;break;
        }
        verifyContainsText(myElement,text);

    }




}
