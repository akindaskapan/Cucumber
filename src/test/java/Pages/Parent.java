package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    public void sendkeysFunction(WebElement element, String value) {
        waitUntilVisible(element);//element gözükene kadar bekle
        scrollToElement(element);//elemente kadar kaydır
        //element.clear();//temizle
        element.sendKeys(value);//değeri gönder
    }


    public void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }


    public void clickFunction(WebElement element) {
        waitUntilClickable(element);//tıklanabilir olana kadar bekle
        scrollToElement(element);//elemente kadar kaydır
        element.click();//elemente tıkla
    }


    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public void verifyContainsText(WebElement element, String text){
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));



    }




}