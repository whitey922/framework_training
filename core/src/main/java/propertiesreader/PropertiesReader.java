package propertiesreader;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

public final class PropertiesReader {
    private PropertiesReader() {
    }

    public static <T extends Config> T getProperties(Class<T> clazz) {
        return ConfigFactory.create(clazz,
                System.getProperties(),
                System.getenv());
    }
}
