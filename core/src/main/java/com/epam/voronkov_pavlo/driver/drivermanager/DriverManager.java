package com.epam.voronkov_pavlo.driver.drivermanager;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;

public final class DriverManager {

    private DriverManager(){}

    public static void downloadChrome() {
        WebDriverManager
                .getInstance(DriverManagerType.CHROME)
                .setup();
    }

    public static void downloadFirefox() {
        WebDriverManager
                .getInstance(DriverManagerType.FIREFOX)
                .setup();
    }
}
