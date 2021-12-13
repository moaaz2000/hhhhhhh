package com.united.Sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Header_Section {
    @FindBy(css = "#app > div > div > div > div.page > div.relativePosition > header > div > div > div:nth-child(1) > div > div > div > div:nth-child(2) > nav > ul > li:nth-child(1) > div > div > button")
    WebElement click_on_language_selector_button;

    public WebElement getClick_on_select_language_drop_down_arrow() {
        return click_on_select_language_drop_down_arrow;
    }

    @FindBy(css = "#localization-language-selector")
    WebElement click_on_select_language_drop_down_arrow;

    @FindBy(xpath = "//*[@id=\"localization-language-selector\"]")
    WebElement language;

    public WebElement getLanguage() {
        return language;
    }

    @FindBy(xpath = "//*[@id=\"localization-content-wrapper\"]/div[2]/div[1]/div/div/ul/li")
   public List<WebElement> listOfLanguages;

    @FindBy(css = "#localization-content-wrapper > div.app-containers-LocalizationContent-localizationContent__dialogActions--3hn_2 > button")
    WebElement click_on_change_button;

    @FindBy(css = "DIV[class=\"app-containers-Advisories-Advisory-styles__advisoryContent--1hTFG\"] a")
     List<WebElement>travel_update_links;

    @FindBy(css = "#headerNav0 > span")
    WebElement click_on_book_tab_on_header;

    @FindBy(css = "#headerNav0-panel > div")
    WebElement all_book_tab_link_displayed;

    @FindBy(css = "#headerNav1 > span")
    WebElement my_trip_tab_click;

    @FindBy(css  = "#headerNav1-panel > div")
    WebElement all_my_trip_tags_links_displayed;

    @FindBy(css = "#headerNav2 > span")
    WebElement travel_info_tab_click;

    @FindBy(css ="#headerNav2-panel > div")
    WebElement all_travel_tab_links_displayed;

    @FindBy(css = "#headerNav3 > span")
    WebElement millage_plus_click;

    @FindBy(css = "div[class='app-components-GlobalHeader-globalHeader__headerPanels--1SJw6 app-components-GlobalHeader-globalHeader__hpHeaderPanels--2q4Tp']")
    WebElement millage_plus_tab_links_displayed;

    @FindBy(css = "#headerNav4 > span")
    WebElement deals_tab_click;

    @FindBy(css = "#headerNav4-panel > div")
    WebElement deals_links_displayed;

   @FindBy(css ="#headerNav5 > span")
   WebElement help_tab_click;

   @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[5]/header/div/div/div[1]/div/div/div/div[2]/nav/div/div[1]/div/div[2]")
   WebElement help_tab_links_displayed;

    public WebElement getHelp_tab_links_displayed() {
        return help_tab_links_displayed;
    }

    public WebElement getHelp_tab_click() {
        return help_tab_click;
    }

    public WebElement getDeals_links_displayed() {
        return deals_links_displayed;
    }

    public WebElement getDeals_tab_click() {
        return deals_tab_click;
    }

    public WebElement getMillage_plus_tab_links_displayed() {
        return millage_plus_tab_links_displayed;
    }

    public WebElement getMillage_plus_click() {
        return millage_plus_click;
    }

    public WebElement getAll_travel_tab_links_displayed() {
        return all_travel_tab_links_displayed;
    }

    public WebElement getTravel_info_tab_click() {
        return travel_info_tab_click;
    }

    public WebElement getAll_my_trip_tags_links_displayed() {
        return all_my_trip_tags_links_displayed;
    }

    public WebElement getMy_trip_tab_click() {
        return my_trip_tab_click;
    }

    public WebElement getAll_book_tab_link_displayed() {
        return all_book_tab_link_displayed;
    }

    public WebElement getClick_on_book_tab_on_header() {
        return click_on_book_tab_on_header;
    }

    public List<WebElement> getTravel_update_links() {
        return travel_update_links;
    }

    public WebElement getClick_on_change_button() {
        return click_on_change_button;
    }

    public List<WebElement> getListOfLanguages() {
        return listOfLanguages;
    }

    public WebElement getClick_on_language_selector_button() {return click_on_language_selector_button;}

    public Header_Section() {
        PageFactory.initElements(driver, this);
    }


}
