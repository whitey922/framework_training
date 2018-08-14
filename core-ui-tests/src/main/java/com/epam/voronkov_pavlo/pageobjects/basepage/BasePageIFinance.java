package com.epam.voronkov_pavlo.pageobjects.basepage;

import com.epam.voronkov_pavlo.pageobjects.blocks.Header;
import com.epam.voronkov_pavlo.pageobjects.blocks.SectionNavigation;
import org.openqa.selenium.support.FindBy;

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
