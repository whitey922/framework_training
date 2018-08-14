package base;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.epam.voronkov_pavlo.propertiesreader.IFinancePropertiesReader;

import static com.epam.voronkov_pavlo.driver.browseraction.BrowserActions.closeBrowser;
import static com.epam.voronkov_pavlo.driver.browseraction.BrowserActions.goTo;

@Slf4j
public class IFinanceBaseTest {
    @BeforeMethod
    public void startTest() {
        log.info("==========Test started==========");
        goTo(IFinancePropertiesReader.getIFinanceProperties().baseUrl());
    }

    @AfterMethod
    public void finishTest() {
        closeBrowser();
        log.info("==========Test finished==========");
    }
}
