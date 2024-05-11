package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id=\"mat-input-0\"]")
    public WebElement usernameInputBox;
    @FindBy(xpath = "//input[@id=\"mat-input-1\"]")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//span[text()=' GİRİŞ YAP ']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()=' Dashboard ']")
    public WebElement dashboardText;



}
