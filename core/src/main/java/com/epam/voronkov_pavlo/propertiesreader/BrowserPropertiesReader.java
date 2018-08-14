package com.epam.voronkov_pavlo.propertiesreader;

import com.epam.voronkov_pavlo.browserpoperties.BrowserProperties;
import org.aeonbits.owner.ConfigFactory;

public final class BrowserPropertiesReader {
    private BrowserPropertiesReader() {
    }

    public static BrowserProperties getBrowserProperties() {
        return ConfigFactory.create(BrowserProperties.class,
                System.getProperties(),
                System.getenv());
    }
}
