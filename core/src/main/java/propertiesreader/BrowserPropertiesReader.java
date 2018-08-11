package propertiesreader;

import browserpoperties.BrowserProperties;
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
