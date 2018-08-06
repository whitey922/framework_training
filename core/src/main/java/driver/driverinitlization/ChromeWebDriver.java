package driver.driverinitlization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static driver.drivermanager.DriverManager.downloadChrome;

public class ChromeWebDriver implements WebDriverIInitializer {
    @Override
    public WebDriver init() {
        downloadChrome();
        return new ChromeDriver(getChromeCapabilities());
    }

    //more about chromeoptions https://peter.sh/experiments/chromium-command-line-switches/
    private ChromeOptions getChromeCapabilities() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-infobars");

        return chromeOptions;
    }
}