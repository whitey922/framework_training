package propertiesreader;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources("classpath:main.properties")
public interface MainProperties extends Config {

    @Key("base.url")
    String url();

    @Key("browser.name")
    String browserName();
}

