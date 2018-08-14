package com.epam.voronkov_pavlo.pageobjects.main;

import com.epam.voronkov_pavlo.driver.Browser;
import com.epam.voronkov_pavlo.pageobjects.basepage.BasePageIFinance;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;


public class MainPage extends BasePageIFinance {

    public MainPage() {
        PageFactory.initElements(new HtmlElementDecorator(Browser.getBrowser()), this);
    }
}
