package com.united.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Travel_Info_Page {
    @FindBy(css = "ul[class='app-components-BookTravel-bookTravel__travelNav--3RNBj'] >li\n")
    private List<WebElement> verifyThatPageIsLoading;

    @FindBy(css = "#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__formHeader--2Hpvk > fieldset > div > label:nth-child(1) > span.app-components-BookFlightForm-bookFlightForm__checkmark--2DHJD")
    WebElement fill_out_all_the_destination_fields;

    @FindBy(css = "#bookFlightOriginInput")
    WebElement state_name;

    @FindBy(css = "#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__nearbyAirPort--1dCq7 > div > div:nth-child(1) > div > div > div.app-components-BookFlightForm-bookFlightForm__pickupContainer--Gekxg > div > button.atm-c-btn.app-components-QueryBuilder-styles__clearButton--dzha6.app-components-QueryBuilder-styles__panelIsOpen--2oyfn.atm-c-btn--bare > svg > use")
    WebElement click_X_button;

    @FindBy(css = "#bookFlightOriginInput")
    WebElement fill_out_from_field;

    @FindBy(css = "#autocomplete-item-0 > button")
    WebElement click_on_washinghton;

    @FindBy(css = "#bookFlightDestinationInput")
    WebElement click_on_to_field;

    @FindBy(css = "#bookFlightDestinationInput")
    WebElement fill_out_to_field;

    @FindBy(css = "#autocomplete-item-0 > button")
    WebElement click_on_Miami;

    @FindBy(css = "#passengersSlidingInputContainer > div.app-components-BookFlightForm-bookFlightForm__bookCalendar--1f4qZ > div > div > div > div")
    WebElement click_on_dates_column;

    @FindBy(css = "#passengersSlidingInputContainer > div.app-components-BookFlightForm-bookFlightForm__bookCalendar--1f4qZ > div > button")
    WebElement click_on_dates_x_button;

    @FindBy(css = "#DepartDate")
    WebElement click_on_depart;

    @FindBy(css = "#passengersSlidingInputContainer > div.app-components-BookFlightForm-bookFlightForm__bookCalendar--1f4qZ > div > div > div > div > div.DateRangePicker_picker.DateRangePicker_picker_1.DateRangePicker_picker__directionLeft.DateRangePicker_picker__directionLeft_2 > div > div > div:nth-child(1) > div.DayPicker_focusRegion.DayPicker_focusRegion_1 > div.DayPicker_transitionContainer.DayPicker_transitionContainer_1.DayPicker_transitionContainer__horizontal.DayPicker_transitionContainer__horizontal_2 > div > div:nth-child(2) > div > table > tbody > tr:nth-child(3) > td:nth-child(4)")
    WebElement select_depart_date;

    @FindBy(css = "#ReturnDate")
    WebElement click_return_date;

    @FindBy(css = "#passengersSlidingInputContainer > div.app-components-BookFlightForm-bookFlightForm__bookCalendar--1f4qZ > div > div > div > div > div.DateRangePicker_picker.DateRangePicker_picker_1.DateRangePicker_picker__directionLeft.DateRangePicker_picker__directionLeft_2 > div > div > div:nth-child(1) > div.DayPicker_focusRegion.DayPicker_focusRegion_1 > div.DayPicker_transitionContainer.DayPicker_transitionContainer_1.DayPicker_transitionContainer__horizontal.DayPicker_transitionContainer__horizontal_2 > div > div:nth-child(2) > div > table > tbody > tr:nth-child(5) > td:nth-child(3)")
    WebElement select_return_date;

    @FindBy(css = "#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__basicEconomyToggle--1VE5O > div > div:nth-child(1) > div > div > button")
    WebElement click_on_findFlights_button;


    @FindBy(css = "#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__formHeader--2Hpvk > fieldset > div > label:nth-child(2) > span.app-components-BookFlightForm-bookFlightForm__checkmark--2DHJD")
    WebElement click_on_way_radio_button;

    @FindBy(css = "#passengersSlidingInputContainer > div.app-components-BookFlightForm-bookFlightForm__bookCalendar--1f4qZ > div > div > div > div > div.SingleDatePicker_picker.SingleDatePicker_picker_1.SingleDatePicker_picker__directionLeft.SingleDatePicker_picker__directionLeft_2 > div > div > div:nth-child(1) > div.DayPicker_focusRegion.DayPicker_focusRegion_1 > div.DayPickerNavigation.DayPickerNavigation_1.DayPickerNavigation__horizontal.DayPickerNavigation__horizontal_2 > button.app-containers-BookCalendar-bookCalendar__prevIconContainer--1CBAY > span")
    WebElement click_on_reverse_arrow_to_go_to_january;

    public WebElement getClick_on_reverse_arrow_to_go_to_january() {
        return click_on_reverse_arrow_to_go_to_january;
    }

    @FindBy(css = "#passengersSlidingInputContainer > div.app-components-BookFlightForm-bookFlightForm__bookCalendar--1f4qZ > div > div > div > div > div.SingleDatePicker_picker.SingleDatePicker_picker_1.SingleDatePicker_picker__directionLeft.SingleDatePicker_picker__directionLeft_2 > div > div > div:nth-child(1) > div.DayPicker_focusRegion.DayPicker_focusRegion_1 > div.DayPicker_transitionContainer.DayPicker_transitionContainer_1.DayPicker_transitionContainer__horizontal.DayPicker_transitionContainer__horizontal_2 > div > div:nth-child(2) > div > table > tbody > tr:nth-child(3) > td.CalendarDay.CalendarDay_1.CalendarDay__default.CalendarDay__default_2.CalendarDay__lastDayOfWeek.CalendarDay__lastDayOfWeek_3 > div > span:nth-child(1)")
    WebElement select_depart_dates;

    @FindBy(css = "#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__formHeader--2Hpvk > fieldset > div > label:nth-child(1) > span.app-components-BookFlightForm-bookFlightForm__checkmark--2DHJD")
    WebElement click_on_round_trip_radio_button;

    @FindBy(css = "#passengersSlidingInputContainer > div.app-components-BookFlightForm-bookFlightForm__bookCalendar--1f4qZ > div > div > div > div > div.DateRangePicker_picker.DateRangePicker_picker_1.DateRangePicker_picker__directionLeft.DateRangePicker_picker__directionLeft_2 > div > div > div:nth-child(1) > div.DayPicker_focusRegion.DayPicker_focusRegion_1 > div.DayPickerNavigation.DayPickerNavigation_1.DayPickerNavigation__horizontal.DayPickerNavigation__horizontal_2 > button.app-containers-BookCalendar-bookCalendar__nextIconContainer--308a5 > span")
    WebElement click_on_forward_arrow;

    @FindBy(css = "#passengersSlidingInputContainer > div.app-components-BookFlightForm-bookFlightForm__bookCalendar--1f4qZ > div > div > div > div > div.DateRangePicker_picker.DateRangePicker_picker_1.DateRangePicker_picker__directionLeft.DateRangePicker_picker__directionLeft_2 > div > div > div:nth-child(1) > div.DayPicker_focusRegion.DayPicker_focusRegion_1 > div.DayPicker_transitionContainer.DayPicker_transitionContainer_1.DayPicker_transitionContainer__horizontal.DayPicker_transitionContainer__horizontal_2 > div > div:nth-child(3) > div > table > tbody > tr:nth-child(3) > td:nth-child(3) > div > span.app-containers-BookCalendar-bookCalendar__day--1NDo_")
    WebElement select_departure_date;

    @FindBy(css = "#passengersSlidingInputContainer > div.app-components-BookFlightForm-bookFlightForm__bookCalendar--1f4qZ > div > div > div > div > div.DateRangePicker_picker.DateRangePicker_picker_1.DateRangePicker_picker__directionLeft.DateRangePicker_picker__directionLeft_2 > div > div > div:nth-child(1) > div.DayPicker_focusRegion.DayPicker_focusRegion_1 > div.DayPicker_transitionContainer.DayPicker_transitionContainer_1.DayPicker_transitionContainer__horizontal.DayPicker_transitionContainer__horizontal_2 > div > div:nth-child(3) > div > table > tbody > tr:nth-child(4) > td:nth-child(3) > div > span.app-containers-BookCalendar-bookCalendar__day--1NDo_")
    WebElement pick_return_date;

    @FindBy(css = "#passengerSelector > button")
    WebElement click_on_travelers_link;

    @FindBy(css = "#passengerMenuId > div.app-components-PassengerSelector-passengers__passengerMenu__items--lgmNz > div:nth-child(1) > div:nth-child(1) > div > button:nth-child(3)")
    WebElement add_one_more_adult;

    @FindBy(css = "#passengerMenuId > div.app-components-PassengerSelector-passengers__passengerMenu__items--lgmNz > div:nth-child(1) > div:nth-child(3) > div > button:nth-child(3)")
    WebElement Add_one_more_Infant;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[3]/button[2]\n")
    WebElement click_travelers_x_button;

    @FindBy(css = "#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__basicEconomyToggle--1VE5O > div > div:nth-child(1) > div > div > button")
    WebElement find_flight_button_displayed;

    public WebElement getFind_flight_button_displayed() {
        return find_flight_button_displayed;
    }

    public WebElement getClick_travelers_x_button() {
        return click_travelers_x_button;
    }

    public WebElement getAdd_one_more_Infant() {
        return Add_one_more_Infant;
    }

    public WebElement getAdd_one_more_adult() {
        return add_one_more_adult;
    }

    public WebElement getClick_on_travelers_link() {
        return click_on_travelers_link;
    }

    public WebElement getPick_return_date() {
        return pick_return_date;
    }

    public WebElement getSelect_departure_date() {
        return select_departure_date;
    }

    public WebElement getClick_on_forward_arrow() {
        return click_on_forward_arrow;
    }

    public WebElement getClick_on_round_trip_radio_button() {
        return click_on_round_trip_radio_button;
    }

    public WebElement getSelect_depart_dates() {
        return select_depart_dates;
    }

    public WebElement getClick_on_way_radio_button() {
        return click_on_way_radio_button;
    }

    public WebElement getClick_on_findFlights_button() {
        return click_on_findFlights_button;
    }


    public WebElement getSelect_return_date() {
        return select_return_date;
    }

    public WebElement getClick_return_date() {
        return click_return_date;
    }

    public WebElement getSelect_depart_date() {
        return select_depart_date;
    }

    public WebElement getClick_on_depart() {
        return click_on_depart;
    }

    public WebElement getClick_on_dates_x_button() {
        return click_on_dates_x_button;
    }

    public WebElement getClick_on_dates_column() {
        return click_on_dates_column;
    }

    public WebElement getClick_on_Miami() {
        return click_on_Miami;
    }

    public WebElement getFill_out_to_field() {
        return fill_out_to_field;
    }

    public WebElement getClick_on_to_field() {
        return click_on_to_field;
    }

    public WebElement getClick_on_washinghton() {
        return click_on_washinghton;
    }

    public WebElement getFill_out_from_field() {
        return fill_out_from_field;
    }

    public WebElement getClick_X_button() {
        return click_X_button;
    }

    public WebElement getState_name() {
        return state_name;
    }

    public WebElement getFill_out_all_the_destination_fields() {
        return fill_out_all_the_destination_fields;
    }

    public List<WebElement> getVerifyThatPageIsLoading() {
        return verifyThatPageIsLoading;
    }

    public Travel_Info_Page() {
        PageFactory.initElements(driver, this);

    }
}
