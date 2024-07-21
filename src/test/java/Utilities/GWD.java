package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Locale;


public class GWD {

    //private static WebDriver driver; eski yöntem
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>(); //WebDriver 1 , WebDriver 2
    public static ThreadLocal<String> threadBrowser = new ThreadLocal<>();//chrome, firefox
    //threadDriver.get() --> ilgili threaddaki driverı verecek
    //threadDriver.set() --> ilgili thread'e driver'ı set eder

    public static WebDriver getDriver() {


        Locale.setDefault(new Locale("EN" ));
        System.setProperty("user.language", "EN" );

        if (threadBrowser.get() == null) // paralel çalışmayan yani XML den parametreyle gelmeyen ger çağıran
            threadBrowser.set("chrome" ); // Basic araynlar için

        if (threadDriver.get() == null) {
            String browserName = threadBrowser.get(); //bu thread'teki browserName'i verdi

            switch (browserName) {
                case "chrome":
                    threadDriver.set(new ChromeDriver());
                    threadDriver.get().manage().window().maximize();
                    threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
                    break;

                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    threadDriver.get().manage().window().maximize();
                    threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
                    break;

                case "safari":
                    threadDriver.set(new SafariDriver());
                    threadDriver.get().manage().window().maximize();
                    threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
                    break;


                case "edge":
                    threadDriver.set(new EdgeDriver());
                    threadDriver.get().manage().window().maximize();
                    threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
                    break;
            }
        }
        return threadDriver.get();
    }

    public static void quitDriver() {

        bekle(3);

        //driver kapat
        if (threadDriver.get() != null) { //driver var ise
            threadDriver.get().quit();

            WebDriver driver = threadDriver.get();

            driver = null;
            threadDriver.set(driver);
        }

    }

    public static void bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}