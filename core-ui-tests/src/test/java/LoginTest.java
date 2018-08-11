import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageobjects.mainpage.CurrencyConverterPage;
import pageobjects.mainpage.MainPage;

import static driver.browseraction.BrowserActions.closeBrowser;
import static driver.browseraction.BrowserActions.goTo;
import static pageobjects.mainpage.CurrencyConverterPage.AvgBankCurrencyHeaders.BUYING;
import static pageobjects.mainpage.CurrencyConverterPage.AvgBankCurrencyRows.USD;

public class LoginTest {

    @Test
    public void simpleTest() {
        goTo("https://finance.i.ua/");

        MainPage mainPage = new MainPage();
        mainPage.getSectionNavigation().clickToCurrencyConverter();

        CurrencyConverterPage currencyConverterPage = new CurrencyConverterPage();
        currencyConverterPage.getAvgExchangeRatesTable()
                .getCellAt(BUYING.getHeaderPosition(), USD.getRowPosition())
                .findElement(By.xpath(".//span/span")).getText();

        closeBrowser();
    }
}
