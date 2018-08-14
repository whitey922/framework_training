package com.epam.voronkov_pavlo.browserpoperties;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources("classpath:browser.properties")
public interface BrowserProperties extends Config {
    @Key("browser.name")
    String browserName();
}

