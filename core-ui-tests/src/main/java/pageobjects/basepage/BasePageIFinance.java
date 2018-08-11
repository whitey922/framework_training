package pageobjects.basepage;

import org.openqa.selenium.support.FindBy;
import pageobjects.blocks.Header;
import pageobjects.blocks.SectionNavigation;

public abstract class BasePageIFinance {

    @FindBy(id = "header_overall")
    private Header header;

    @FindBy(id = "section_nav")
    private SectionNavigation sectionNavigation;

    public Header getHeader() {
        return header;
    }

    public SectionNavigation getSectionNavigation() {
        return sectionNavigation;
    }
}
