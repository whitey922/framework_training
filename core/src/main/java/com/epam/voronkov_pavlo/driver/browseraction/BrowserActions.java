package com.epam.voronkov_pavlo.driver.browseraction;

import com.epam.voronkov_pavlo.driver.Browser;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

@Slf4j
public class BrowserActions {
    private static WebDriver driver;

    static {
        driver = Browser.getBrowser();
    }

    public static void goTo(String url) {
        log.info("Browser will open - > " + url);
        driver.get(url);
    }

    public static void executeJSScript(String jsScript) {
        ((JavascriptExecutor) driver).executeScript(jsScript);
    }

    public static void closeBrowser() {
        log.info("Driver is going to close");
        driver.quit();
    }

    public static void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    public static void openBrowserWithSize(int width, int height) {
        driver.manage().window().setSize(new Dimension(width, height));
    }
}
