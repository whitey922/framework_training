import com.epam.reportportal.testng.ReportPortalTestNGListener;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobjects.mainpage.CurrencyConverterPage;
import pageobjects.mainpage.MainPage;

import java.math.BigDecimal;

import static driver.browseraction.BrowserActions.closeBrowser;
import static driver.browseraction.BrowserActions.goTo;
import static java.math.RoundingMode.UP;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static pageobjects.mainpage.CurrencyConverterPage.AvgBankCurrencyRows.USD;
import static utils.IFinanceStringUtils.getValueAsDecimal;
import static utils.IFinanceStringUtils.roundValue;

@Slf4j
@Listeners({ReportPortalTestNGListener.class})
public class LoginTest {

    private final String amountToExchange = "750";

    @Test
    public void simpleTest() {
        goTo("https://finance.i.ua/");

        MainPage mainPage = new MainPage();
        mainPage.getSectionNavigation().clickToCurrencyConverter();

        CurrencyConverterPage currencyConverterPage = new CurrencyConverterPage();
        String currentExchangeRate = currencyConverterPage.getBuyingExchangeRate(USD);

        currencyConverterPage.enterAmountToExchange(amountToExchange);

        BigDecimal currencyConverterResultInUI = getValueAsDecimal(currencyConverterPage.getConverterToResultInUAH());

        BigDecimal currencyConverterResult = roundValue(count(currentExchangeRate, amountToExchange), 2, UP);

        assertThat("", currencyConverterResultInUI, equalTo(currencyConverterResult));
        closeBrowser();
    }

    private String count(String rate, String amountToExchange) {
        return String.valueOf(Double.valueOf(rate) * Double.valueOf(amountToExchange));
    }
}
