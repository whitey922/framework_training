package com.epam.voronkov_pavlo.driver.driverinitlization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static com.epam.voronkov_pavlo.driver.drivermanager.DriverManager.downloadFirefox;

public class FirefoxWebDriver implements WebDriverIInitializer {
    @Override
    public WebDriver init() {
        downloadFirefox();

        return new FirefoxDriver(getFirefoxCapabilities());
    }

    private FirefoxOptions getFirefoxCapabilities() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        //TODO add options
        return firefoxOptions;
    }
}
