package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormContent extends Parent{



    public FormContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder=\"Name\"]")
    private WebElement searchNameInput;
    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")  //ortak nameInputBox
    private WebElement nameInput;
    @FindBy(xpath = "//span[text()='Academic Period']")
    private WebElement academicPeriod;
    @FindBy(xpath = "//span[text()=' Internship  ']")
    private WebElement internship;
    @FindBy(xpath = "//span[text()='Grade Level']")
    private WebElement gradeLevel;
    @FindBy(xpath = "//span[text()=' Luciano ']")
    private WebElement luciano;
    @FindBy(xpath = "//span[text()=' Spinka ']")
    private WebElement spinka;
    @FindBy(xpath = "//span[text()=' Murphy ']")
    private WebElement murphy;
    @FindBy(xpath = "//span[text()=' Skiles ']")
    private WebElement skiles;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement deleteButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement deleteDialogButton;

    WebElement myElement;
    public void findAndClick(String strElement){

        switch (strElement)
        {
            case "academicPeriod": myElement=academicPeriod;break;
            case "internship": myElement=internship;break;
            case "gradeLevel": myElement=gradeLevel;break;
            case "luciano": myElement=luciano;break;
            case "spinka": myElement=spinka;break;
            case "murphy": myElement=murphy;break;
            case "skiles": myElement=skiles;break;
            case "searchButton": myElement=searchButton;break;
            case "deleteButton": myElement=deleteButton;break;
            case "deleteDialogButton": myElement=deleteDialogButton;break;
        }
        clickFunction(myElement);
    }


    public void findAndSend(String strElement, String value){

        switch (strElement)
        {
            case "nameInput": myElement=nameInput;break;
            case "searchNameInput": myElement=searchNameInput;break;
        }
        sendkeysFunction(myElement,value);
    }

    public void searchAndDelete(String searchText){
       // GWD.getDriver().navigate().refresh();
       // WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

        //arama kutucuguna kelimeyi yaz
        findAndSend("searchNameInput",searchText);

        //arama butonuna bas
      // wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("hot-toast-bar-base-wrapper")));
      // wait.until(ExpectedConditions.elementToBeClickable(searchButton));
      // findAndClick("searchButton");

      // wait.until(ExpectedConditions.elementToBeClickable(deleteButton));


        //silme butonuna bas
        findAndClick("deleteButton");
        //wait.until(ExpectedConditions.elementToBeClickable(deleteDialogButton));
        //dialogdaki silme butonuna bas
        findAndClick("deleteDialogButton");
    }

}