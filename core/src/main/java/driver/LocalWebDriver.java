package driver;

enum Browsers {
    CHROME,
    FIREXOX
}

public class LocalWebDriver implements WebDriverIInitializer {

    public static void initBrowser() {
        Browsers browsers = Browsers.valueOf("CHROME");
        switch (browsers) {
            case CHROME:
                System.out.println("hello");
        }
    }

    @Override
    public void init() {

    }

    public static void main(String[] args) {
        LocalWebDriver.initBrowser();
    }
}