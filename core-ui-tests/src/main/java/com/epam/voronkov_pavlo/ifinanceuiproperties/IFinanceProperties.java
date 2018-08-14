package com.epam.voronkov_pavlo.ifinanceuiproperties;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources("classpath:ifinance.properties")
public interface IFinanceProperties extends Config {
    @Key("base.url")
    String baseUrl();
}

