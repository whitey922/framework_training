package driver;

import propertiesreader.MainProperties;

import static driver.browseraction.BrowserActions.closeBrowser;
import static driver.browseraction.BrowserActions.goTo;
import static propertiesreader.PropertiesReader.getProperties;

public class Demo {
    public static void main(String[] args) {
     goTo(getProperties(MainProperties.class).url());

     closeBrowser();
    }
}
