package com.united.tabs.booktab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Book_Tab {

    @FindBy(css = "#travelTab > h2 > span") WebElement click_on_book_tab;

    @FindBy(css = "#travelTab-panel") WebElement book_tab_has_all_the_correct_fields;

    @FindBy(css = "#bookFlightOriginInput") WebElement destination_field_displayed;

    @FindBy(css = "#bookFlightDestinationInput") WebElement return_field_displayed;

    @FindBy(css = "#passengerSelector > button") WebElement click_on_travelers_filed;

    @FindBy(css = "#passengerMenuId > div.app-components-PassengerSelector-passengers__passengerMenu__items--lgmNz > div:nth-child(1) > div:nth-child(1) > div > button:nth-child(3)") WebElement select_nine_adults;

    @FindBy(css = "#DepartDate") WebElement depart_date_filed_display;

    @FindBy(css = "#ReturnDate") WebElement return_date_filed_display;

    @FindBy(css = "#passengerSelector > button") WebElement adults_nine_should_display;

    @FindBy(css = "#passengerMenuId > div.app-components-PassengerSelector-passengers__passengerMenu__items--lgmNz > div:nth-child(1) > div:nth-child(1) > div > button:nth-child(3)") WebElement click_on_adult_plus_button;

    @FindBy(css = "#passengerSelector") WebElement click_on_travelers_link;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[1]/div[1]/div/button[2]") WebElement add_one_adult;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[1]/div[2]/div/button[2]") WebElement add_one_senior;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[1]/div[3]/div/button[2]") WebElement add_one_infant;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[1]/div[4]/div/button[2]") WebElement add_one_infant_on_lap;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[2]/div[1]/div/button[2]") WebElement add_one_child_form_age_fifteen_to_seventeen;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[2]/div[2]/div/button[2]") WebElement add_one_child_from_age_twelve_to_fourteen;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[2]/div[3]/div/button[2]") WebElement add_one_child_from_age_five_to_eleven;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[2]/div[4]/div/button[2]") WebElement add_one_child_from_age_two_to_four;

    @FindBy(css = "#passengerSelector > button") WebElement travelers_should_display_nine_travelers_when_selected;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[2]/div/div[1]/div/div/button") WebElement click_on_arrow_button;

    @FindBy(css = "#bookFlightOriginInput") WebElement placeholder_form;

    @FindBy(css = "#bookFlightDestinationInput") WebElement placeholder_to;

    @FindBy(xpath = "//*[@id=\"bookFlightOriginInput\"]")
    WebElement click_on_from_field;

    @FindBy(css = "#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__nearbyAirPort--1dCq7 > div > div:nth-child(1) > div > div > div.app-components-BookFlightForm-bookFlightForm__pickupContainer--Gekxg > div > button.atm-c-btn.app-components-QueryBuilder-styles__clearButton--dzha6.app-components-QueryBuilder-styles__panelIsOpen--2oyfn.atm-c-btn--bare > svg > use")
    WebElement click_on_x_button;

    @FindBy(xpath = "//*[@id=\"bookFlightDestinationInput\"]")
    WebElement click_on_going_to_field;

    @FindBy(xpath = "//*[@id=\"bookFlightDestinationInput\"]")
    WebElement find_the_airport_by_filling_out_the_filed;

    @FindBy(xpath = "//*[@id=\"autocomplete-item-0\"]/button")
    WebElement click_on_airport;

    @FindBy(css = "#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__nearbyAirPort--1dCq7 > div > div:nth-child(1) > div > div > div.app-components-BookFlightForm-bookFlightForm__destinationPickupContainer--1_8vd > div > button > svg > use")
    WebElement click_on_X_button_to_clear_the_going_to_field;

    @FindBy(xpath = "//*[@id=\"cabinType\"]")
    WebElement click_on_drop_down_arrow;

    @FindBy(css = "ul[aria-labelledby=\"cabinDescriptor\"]>li")
   List<WebElement>  list_of_flight_classes;

    @FindBy(css = "#cabinType > div")
    WebElement premium_economy;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[1]/div[1]/div/button[1]")
    WebElement click_on_subtract_button;

    public WebElement getClick_on_subtract_button() {
        return click_on_subtract_button;
    }
    @FindBy(xpath = "//*[@id=\"passengerSelector\"]/button")
    WebElement get_the_text;

    public WebElement getGet_the_text() {
        return get_the_text;
    }
    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[2]/button/span")
    WebElement click_on_travel_with_a_pet;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[5]/div/div[1]/div/div/div[1]/button/span")
    WebElement click_on_advance_Search_button;

    @FindBy(css = "#flexDatesLabel")
    WebElement click_on_flexible_date;

    @FindBy(xpath = "//*[@id=\"flexMonth\"]/div")
    WebElement month_drop_down;

    @FindBy(xpath = "//*[@id=\"flexDay\"]/div" )
    WebElement days_drop_down;

    public WebElement getDays_drop_down() {
        return days_drop_down;
    }

    public WebElement getMonth_drop_down() {
        return month_drop_down;
    }

    public WebElement getClick_on_flexible_date() {
        return click_on_flexible_date;
    }

    public WebElement getClick_on_advance_Search_button() {
        return click_on_advance_Search_button;
    }

    public WebElement getClick_on_travel_with_a_pet() {
        return click_on_travel_with_a_pet;
    }

    public WebElement getPremium_economy() {
        return premium_economy;
    }

    public List<WebElement> getList_of_flight_classes() {
        return list_of_flight_classes;
    }

    public WebElement getClick_on_drop_down_arrow() {
        return click_on_drop_down_arrow;
    }

    public WebElement getClick_on_X_button_to_clear_the_going_to_field() {return click_on_X_button_to_clear_the_going_to_field;}

    public WebElement getClick_on_airport() {
        return click_on_airport;
    }

    public WebElement getFind_the_airport_by_filling_out_the_filed() {return find_the_airport_by_filling_out_the_filed;}

    public WebElement getClick_on_going_to_field() {
        return click_on_going_to_field;
    }

    public WebElement getClick_on_x_button() {
        return click_on_x_button;
    }

    public WebElement getClick_on_from_field() {
        return click_on_from_field;
    }

    public WebElement getPlaceholder_to() {return placeholder_to;}

    public WebElement getPlaceholder_form() {return placeholder_form;}

    public WebElement getClick_on_arrow_button() {return click_on_arrow_button;}

    public WebElement getTravelers_should_display_nine_travelers_when_selected() {return travelers_should_display_nine_travelers_when_selected;}

    public WebElement getAdd_one_child_from_age_two_to_four() {return add_one_child_from_age_two_to_four;}

    public WebElement getAdd_one_child_from_age_five_to_eleven() {return add_one_child_from_age_five_to_eleven;}

    public WebElement getAdd_one_child_from_age_twelve_to_fourteen() {return add_one_child_from_age_twelve_to_fourteen;}

    public WebElement getAdd_one_child_form_age_fifteen_to_seventeen() {return add_one_child_form_age_fifteen_to_seventeen;}

    public WebElement getAdd_one_infant_on_lap() {return add_one_infant_on_lap;}

    public WebElement getAdd_one_infant() {return add_one_infant;}

    public WebElement getAdd_one_senior() {return add_one_senior;}

    public WebElement getAdd_one_adult() {return add_one_adult;}

    public WebElement getClick_on_travelers_link() {return click_on_travelers_link;}

    public WebElement getClick_on_adult_plus_button() {return click_on_adult_plus_button;}

    public WebElement getAdults_nine_should_display() {return adults_nine_should_display;}

    public WebElement getReturn_date_filed_display() {return return_date_filed_display;}

    public WebElement getDepart_date_filed_display() {return depart_date_filed_display;}

    public WebElement getSelect_nine_adults() {
        return select_nine_adults;
    }

    public WebElement getClick_on_travelers_filed() {return click_on_travelers_filed;}

    public WebElement getReturn_field_displayed() {return return_field_displayed;}

    public WebElement getDestination_field_displayed() {return destination_field_displayed;}

    public WebElement getBook_tab_has_all_the_correct_fields() {
        return book_tab_has_all_the_correct_fields;
    }

    public WebElement getClick_on_book_tab() {return click_on_book_tab;}

    @FindBy(css = "#bookFlightTab-panel input") List<WebElement> book_tab_input_fields;

    public List<WebElement> getBook_tab_input_fields() {return book_tab_input_fields;
    }

    public Book_Tab() {PageFactory.initElements(driver, this);}
}
