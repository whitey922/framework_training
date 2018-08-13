package browserpoperties;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;
import org.aeonbits.owner.ConfigFactory;

@Sources("classpath:browser.properties")
public interface BrowserProperties extends Config {
    @Key("browser.name")
    String browserName();
}

