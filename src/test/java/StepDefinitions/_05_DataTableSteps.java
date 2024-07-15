package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _05_DataTableSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Click on the element in the Left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable linkler) {
        List<String> strLinkList = linkler.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            ln.findAndClick(strLinkList.get(i));
        }
    }


    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable linkler) {
        List<String> strLinkList = linkler.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            dc.findAndClick(strLinkList.get(i));
        }

    }

    @And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {

        List<List<String>> listElement=elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));
        //listin ilk elemanına(WebElement), ikinci elemanı(değer) gönder
        }



    }


    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable element) {
        List<String> strLinkList = element.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            dc.searchAndDelete(strLinkList.get(i));
        }

    }


}
