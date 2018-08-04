package driver;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

    public void downloadChrome() {
        WebDriverManager
                .getInstance(DriverManagerType.CHROME)
                .setup();
    }

    public void downloadEdge() {
        WebDriverManager
                .getInstance(DriverManagerType.EDGE)
                .setup();
    }
    public void downloadFirefox() {
        WebDriverManager
                .getInstance(DriverManagerType.FIREFOX)
                .setup();
    }
}
