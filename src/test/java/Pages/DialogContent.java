package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id=\"mat-input-0\"]")
    private WebElement usernameInputBox;
    @FindBy(xpath = "//input[@id=\"mat-input-1\"]")
    private WebElement passwordInputBox;
    @FindBy(xpath = "//span[text()=' GİRİŞ YAP ']")
    private WebElement loginButton;
    @FindBy(xpath = "//span[text()=' Dashboard ']")
    private WebElement dashboardText;

    @FindBy(xpath = "//ms-add-button[@tooltip=\"GENERAL.BUTTON.ADD\"]//button") //ortak add butonu
    private WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")  //ortak nameInputBox
    private WebElement nameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input") //ortak codeInput
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button") //ortak save butonu
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]") //ortak successMsg
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname=\"shortName\"]//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "//button[@aria-label='Close']")
    private WebElement closeAlertButton;

    @FindBy(xpath = "//ms-text-field[@placeholder=\"GENERAL.FIELD.NAME\"]//input")
    private WebElement searchNameInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    //@FindBy(xpath = "//ms-delete-button//button")
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement deleteButton;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement deleteDialogButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;
    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priority;
    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']")
    private WebElement toggleBar;
    @FindBy(xpath = "//ms-save-button[@caption=\"GENERAL.BUTTON.SAVE_AND_CLOSE\"]")
    private WebElement saveAndClose;

    @FindBy(xpath = "//div[contains(@class, 'loading-shade') and contains(text(), 'There is no data to display')]")
    private WebElement result; //isim aratıldığında sonuç var mı yok mu kontrolü

    @FindBy(xpath = "//div[contains(@class, 'loading-shade')]")
    private WebElement loadingBar;

    @FindBy(xpath = "//tbody/tr")
    private List<WebElement> results;

    @FindBy(xpath = "//label[text()='Active']")
    private WebElement switchBtn;
    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        //Stringten WebElemente ulaşalım
        switch (strElement) {
            case "username":
                myElement = usernameInputBox;
                break;
            case "password":
                myElement = passwordInputBox;
                break;
            case "nameInput":
                myElement = nameInput;
                break;
            case "codeInput":
                myElement = codeInput;
                break;
            case "shortName":
                myElement = shortName;
                break;
            case "searchNameInput":
                myElement = searchNameInput;
                break;
            case "integrationCode":
                myElement = integrationCode;
                break;
            case "priority":
                myElement = priority;
                break;
        }
        sendkeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {

        //Stringten WebElemente ulaşalım
        switch (strElement) {
            case "loginButton":
                myElement = loginButton;
                break;
            case "add":
                myElement = addButton;
                break;
            case "save":
                myElement = saveButton;
                break;
            case "closeDialog":
                myElement = closeDialog;
                break;
            case "closeAlert":
                myElement = closeAlertButton;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
            case "deleteDialogButton":
                myElement = deleteDialogButton;
                break;
            case "toggleBar":
                myElement = toggleBar;
                break;
            case "saveAndClose":
                myElement = saveAndClose;
                break;
            case "switchBtn":
                myElement = switchBtn;
                break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {

        //Stringten WebElemente ulaşalım
        switch (strElement) {
            case "dashboard":
                myElement = dashboardText;
                break;
            case "success":
                myElement = successMessage;
                break;
            case "alreadyExist":
                myElement = alreadyExist;
                break;
        }
        verifyContainsText(myElement, text);
    }


    public void searchAndDelete(String searchText) {
        // GWD.getDriver().navigate().refresh();
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

        //arama kutucuguna kelimeyi yaz
        findAndSend("searchNameInput", searchText);


        //arama butonuna bas
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("hot-toast-bar-base-wrapper")));
        //wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        findAndClick("searchButton");

        wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
        //silme butonuna bas
        findAndClick("deleteButton");
        //wait.until(ExpectedConditions.elementToBeClickable(deleteDialogButton));
        //dialogdaki silme butonuna bas
        findAndClick("deleteDialogButton");
    }


    //  public void waitUntilLoading() {
    //      WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
    //      wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//tbody[@class=\"mdc-data-table__content ng-star-inserted\"]"), 1));
    //  }


}
