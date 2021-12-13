package com.united.tabs.checkintab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

import static com.united.base.Hooks.driver;

public class Check_In_Tab {
    @FindBy(css = "#checkInTab > h2 > div")
    WebElement check_in_click;

    @FindBy(css = "#formSubmitBtn")
    WebElement submit_button_displayed;

    @FindBy(xpath = "//*[@id=\"flightCheckInConfNumber_aria\"]")
    WebElement valid_confirmation;

    public WebElement getValid_confirmation() {
        return valid_confirmation;
    }

    public WebElement getSubmit_button_displayed() {
        return submit_button_displayed;
    }


    @FindBy(css = "#bookFlightCheckin")
    WebElement all_check_in_fields_displayed;

    @FindBy(xpath = "//*[@id=\"checkInTab\"]/h2/div")
    WebElement alert_message;

    @FindBy(xpath = "//*[@id=\"formSubmitBtn\"]")
    WebElement click_search_button;

    @FindBy(xpath = "//*[@id=\"bookFlightCheckin\"]/div[4]/a")
    WebElement check_in_link;

    @FindBy(xpath = "//*[@id=\"main-content\"]/h1")
    WebElement navigate_to_new_page;

    @FindBy(xpath = "//*[@id=\"bookFlightCheckin\"]/div[3]/button")
    WebElement mileage_link;
    @FindBy(xpath = "//*[@id=\"2vLMrImP5fR\"]")
    WebElement confermation_page;

    public WebElement getConfermation_page() {
        return confermation_page;
    }

    public WebElement getMileage_link() {
        return mileage_link;
    }

    public WebElement getNavigate_to_new_page() {
        return navigate_to_new_page;
    }

    public WebElement getCheck_in_link() {
        return check_in_link;
    }

    public WebElement getClick_search_button() {
        return click_search_button;
    }

    public WebElement getAlert_message() {
        return alert_message;
    }

    public WebElement getAll_check_in_fields_displayed() {
        return all_check_in_fields_displayed;
    }

    public WebElement getCheck_in_click() {
        return check_in_click;
    }

    public Check_In_Tab() {
        PageFactory.initElements(driver, this);}
}

