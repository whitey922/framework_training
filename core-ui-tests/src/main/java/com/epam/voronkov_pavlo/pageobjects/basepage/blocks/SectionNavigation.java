package com.epam.voronkov_pavlo.pageobjects.basepage.blocks;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

public class SectionNavigation extends HtmlElement {

    //TODO fix xpathes
    @FindBy(xpath = "//div[@id='section_nav']/div/div[1]/ul/li[1]/a")
    private Link linkToMainPage;

    @FindBy(xpath = "//div[@id='section_nav']//div[contains(@class, 'sn_menu_set-main')]//li[5]/a")
    private Link linkToCurrencyConverter;

    public void clickToCurrencyConverter() {
        linkToCurrencyConverter.click();
    }
}
