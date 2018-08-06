package driver.driverinitlization;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import propertiesreader.MainProperties;
import propertiesreader.PropertiesReader;

import static propertiesreader.PropertiesReader.getProperties;

@Slf4j
public final class WebDriverFactoryMethod {
    private WebDriverFactoryMethod() {
    }

    public static WebDriver getRequestedBrowser() {
        SupportedBrowsers supportBrowsers = SupportedBrowsers.valueOf(getProperties(MainProperties.class).browserName());

        switch (supportBrowsers) {
            case CHROME:
                return new ChromeWebDriver().init();
            case IE:
                return new IEWebDriver().init();
            default:
                log.warn("Requested browser value wasn't found. <ChromeDriver> will be used");
                return new ChromeWebDriver().init();
        }
    }
}
