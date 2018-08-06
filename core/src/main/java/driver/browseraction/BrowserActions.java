package driver.browseraction;

import driver.Browser;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

@Slf4j
public class BrowserActions {
    private static WebDriver driver;
    static {
        driver = Browser.getBrowser();
    }

    public static void goTo(String url) {
        log.info("Browser will open - > " + url);
        driver.get(url);
    }

    public static void executeJSScript(String jsScript) {
        ((JavascriptExecutor) driver).executeScript(jsScript);
    }

    public static void scrollTo() {

    }

    public static void closeBrowser() {
        log.info("Driver is going to close");
        driver.quit();
    }
}
