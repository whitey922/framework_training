package simpletest;

import base.IFinanceBaseTest;
import com.epam.voronkov_pavlo.pageobjects.currencyconverterpage.CurrencyConverterPage;
import com.epam.voronkov_pavlo.pageobjects.main.MainPage;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static com.epam.voronkov_pavlo.pageobjects.currencyconverterpage.CurrencyConverterPage.AvgBankCurrencyRows.USD;
import static com.epam.voronkov_pavlo.utils.IFinanceStringUtils.getValueAsDecimal;
import static com.epam.voronkov_pavlo.utils.IFinanceStringUtils.roundValue;
import static java.math.RoundingMode.UP;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest extends IFinanceBaseTest {

    private final String amountToExchange = "750";

    @Test
    public void simpleTest() {
        MainPage mainPage = new MainPage();
        mainPage.getSectionNavigation().clickToCurrencyConverter();

        CurrencyConverterPage currencyConverterPage = new CurrencyConverterPage();
        String currentExchangeRate = currencyConverterPage.getBuyingExchangeRate(USD);
        currencyConverterPage.enterAmountToExchange(amountToExchange);

        BigDecimal currencyConverterResultInUI = getValueAsDecimal(currencyConverterPage.getConverterToResultInUAH());
        BigDecimal currencyConverterResult = roundValue(count(currentExchangeRate, amountToExchange), 2, UP);
        assertThat("Assertion for correct calculating", currencyConverterResultInUI, equalTo(currencyConverterResult));
    }

    private String count(String rate, String amountToExchange) {
        return String.valueOf(Double.valueOf(rate) * Double.valueOf(amountToExchange));
    }
}
