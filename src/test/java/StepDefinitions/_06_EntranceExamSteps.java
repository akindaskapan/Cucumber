package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _06_EntranceExamSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    FormContent fc=new FormContent();

    @And("Click on the element in the Form Content")
    public void clickOnTheElementInTheFormContent(DataTable elements) {
        List<String> strLinkList = elements.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            fc.findAndClick(strLinkList.get(i));
        }

    }


    @And("User sending the keys in Form Content")
    public void userSendingTheKeysInFormContent(DataTable elements) {
        List<List<String>> listElement=elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            fc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));
            //listin ilk elemanına(WebElement), ikinci elemanı(değer) gönder
        }

    }

    @And("User delete item from Form Content")
    public void userDeleteItemFromFormContent(DataTable element) {
        List<String> strLinkList = element.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            fc.searchAndDelete(strLinkList.get(i));
        }

    }
    }
