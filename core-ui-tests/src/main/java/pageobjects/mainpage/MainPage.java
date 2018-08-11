package pageobjects.mainpage;

import driver.Browser;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.basepage.BasePageIFinance;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;


public class MainPage extends BasePageIFinance {

    public MainPage() {
        PageFactory.initElements(new HtmlElementDecorator(Browser.getBrowser()), this);
    }
}
