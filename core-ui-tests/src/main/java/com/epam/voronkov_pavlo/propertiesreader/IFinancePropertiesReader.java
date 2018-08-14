package com.epam.voronkov_pavlo.propertiesreader;

import com.epam.voronkov_pavlo.ifinanceuiproperties.IFinanceProperties;
import org.aeonbits.owner.ConfigFactory;

public final class IFinancePropertiesReader {
    private IFinancePropertiesReader() {
    }

    public static IFinanceProperties getIFinanceProperties() {
        return ConfigFactory.create(IFinanceProperties.class,
                System.getProperties(),
                System.getenv());
    }
}
