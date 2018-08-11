package driver.driverinitlization;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;

import static propertiesreader.BrowserPropertiesReader.getBrowserProperties;


@Slf4j
public final class WebDriverFactoryMethod {
    private WebDriverFactoryMethod() {
    }

    public static WebDriver getRequestedBrowser() {
        switch (getSupportBrowser()) {
            case CHROME:
                log.info("<ChromeDriver> is being initialized");
                return new ChromeWebDriver().init();
            case IE:
                log.info("<IEDriver> is being initialized");
                return new IEWebDriver().init();
        }
        return null;
    }

    private static SupportedBrowsers getSupportBrowser() {
        try {
            return SupportedBrowsers.valueOf(getBrowserProperties().browserName());
        } catch (IllegalArgumentException e) {
            log.warn("Requested browser is not supported. " +
                    "List of supported browsers are " +
                    Arrays.toString(SupportedBrowsers.values()) +
                    " <ChromeDriver> will be used by default");
            return SupportedBrowsers.CHROME;
        }
    }
}
