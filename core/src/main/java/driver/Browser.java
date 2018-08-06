package driver;

import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static driver.driverinitlization.WebDriverFactoryMethod.getRequestedBrowser;

public final class Browser {
    private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    private Browser() {
    }

    public static WebDriver getBrowser() {
        if (Objects.isNull(webDriverThreadLocal.get())) {
            webDriverThreadLocal.set(getRequestedBrowser());
        }
        return webDriverThreadLocal.get();
    }
}
