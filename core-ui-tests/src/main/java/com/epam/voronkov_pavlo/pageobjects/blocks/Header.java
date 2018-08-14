package com.epam.voronkov_pavlo.pageobjects.blocks;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

public class Header extends HtmlElement {

    @FindBy(xpath = "//div[@id='header_overall']//ul[1]/li[1]/a")
    private Link linkToMainPage;

    public void clickLinkToMainPage() {
        linkToMainPage.click();
    }
}
