package com.united.Sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.united.base.Hooks.driver;

public class Footer_Section {
    @FindBy(css = "#app > div > div > div > div.page > div.relativePosition > footer > div > section.app-components-GlobalFooter-globalFooter__footerTop--3x7JY")
    WebElement all_footer_section_links_displayed;

    public WebElement getAll_footer_section_links_displayed() {
        return all_footer_section_links_displayed;
    }

    public Footer_Section() {
        PageFactory.initElements(driver, this);
    }


}
