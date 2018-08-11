package pageobjects.mainpage;

import driver.Browser;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.basepage.BasePageIFinance;
import ru.yandex.qatools.htmlelements.element.Table;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

public class CurrencyConverterPage extends BasePageIFinance {

    @FindBy(xpath = "//div[@class='widget-currency_bank']//table")
    private Table avgExchangeRatesTable;

    public CurrencyConverterPage() {
        PageFactory.initElements(new HtmlElementDecorator(Browser.getBrowser()), this);
    }

    public Table getAvgExchangeRatesTable() {
        return avgExchangeRatesTable;
    }

    public enum AvgBankCurrencyHeaders {
        CURRENCY(0),
        //TODO rename it
        BUYING(1);

        private int headerPosition;

        AvgBankCurrencyHeaders(int i) {
            headerPosition = i;
        }

        public int getHeaderPosition() {
            return headerPosition;
        }
    }

    public enum AvgBankCurrencyRows {
        USD(0);

        private int rowPosition;
        AvgBankCurrencyRows(int i) {
            rowPosition = i;
        }

        public int getRowPosition() {
            return rowPosition;
        }
    }

}
