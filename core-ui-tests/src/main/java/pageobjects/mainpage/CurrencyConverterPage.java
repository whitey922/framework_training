package pageobjects.mainpage;

import driver.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.basepage.BasePageIFinance;
import ru.yandex.qatools.htmlelements.element.Table;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

import static pageobjects.mainpage.CurrencyConverterPage.AvgBankCurrencyHeaders.BUYING;

public class CurrencyConverterPage extends BasePageIFinance {

    @FindBy(xpath = "//div[@class='widget-currency_bank']//table")
    private Table avgExchangeRatesTable;

    @FindBy(id = "currency_amount")
    private TextInput amountToExchanging;

    @FindBy(xpath = "//p[@id='UAH']/input[@id='currency_exchange']")
    private TextInput resultConvertingIntoUAH;

    public CurrencyConverterPage() {
        PageFactory.initElements(new HtmlElementDecorator(Browser.getBrowser()), this);
    }

    public Table getAvgExchangeRatesTable() {
        return avgExchangeRatesTable;
    }

    public String getBuyingExchangeRate(AvgBankCurrencyRows avgBankCurrencyRows) {
        return avgExchangeRatesTable
                .getCellAt(BUYING.getHeaderPosition(), avgBankCurrencyRows.getRowPosition())
                .findElement(By.xpath(".//span/span")).getText();
    }

    public String getConverterToResultInUAH() {
        return resultConvertingIntoUAH.getText();
    }

    public void enterAmountToExchange(String amount) {
        amountToExchanging.sendKeys(amount);
    }

    public enum AvgBankCurrencyHeaders {
        BUYING(1),
        SELLING(2);

        private int headerPosition;

        AvgBankCurrencyHeaders(int i) {
            headerPosition = i;
        }

        public int getHeaderPosition() {
            return headerPosition;
        }
    }

    public enum AvgBankCurrencyRows {
        USD(0),
        EUR(1),
        RUR(2);

        private int rowPosition;

        AvgBankCurrencyRows(int i) {
            rowPosition = i;
        }

        public int getRowPosition() {
            return rowPosition;
        }
    }

}
