package driver.drivermanager;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

    public static void downloadChrome() {
        WebDriverManager
                .getInstance(DriverManagerType.CHROME)
                .setup();
    }
}
