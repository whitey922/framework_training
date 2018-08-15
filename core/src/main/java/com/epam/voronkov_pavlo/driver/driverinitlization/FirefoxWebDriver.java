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

    //http://kb.mozillazine.org/About:config_entries
    //http://kb.mozillazine.org/Category:Preferences
    private FirefoxOptions getFirefoxCapabilities() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addPreference("plugin.default_plugin_disabled", false);
        firefoxOptions.addPreference("privacy.popups.disable_from_plugins", false);

        return firefoxOptions;
    }
}
