package pageobjects.blocks;

import driver.Browser;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

public class Header extends HtmlElement {

    @FindBy(xpath = "//div[@id='header_overall']//ul[1]/li[1]/a")
    private Link linkToMainPage;

//    public Header() {
//        PageFactory.initElements(new HtmlElementDecorator(Browser.getBrowser()), this);
//    }

    public void clickLinkToMainPage() {
        linkToMainPage.click();
    }
}
