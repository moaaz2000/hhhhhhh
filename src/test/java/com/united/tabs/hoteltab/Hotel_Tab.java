package com.united.tabs.hoteltab;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.internal.annotations.ListenersAnnotation;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Hotel_Tab {
    @FindBy(css = "#bookHotelTab > h3 > span") WebElement click_on_hotel_tab;

    @FindBy(css = "#bookHotelTab-panel > form") WebElement Verify_all_links_displayed;

    @FindBy(css = "#roomsDropdown > div") WebElement verify_that_one_room_is_selected_by_default;

    @FindBy(xpath = "//*[@id=\"bookHotelModel.passengers\"]") WebElement verify_that_one_traveler_is_selected_by_default;

    @FindBy(xpath = "//*[@id=\"Adults plusBtn\"]") WebElement click_on_adult_plus_button_eight_times;

    @FindBy(xpath = "//*[@id=\"bookHotelModel.passengers\"]") WebElement click_on_travelers_link;

    @FindBy(xpath = "(//button[text()='+'])[2]") WebElement click_on_children_plus_button_eight_times;

    @FindBy(css = "input[name='bookHotelModel.passengers']") WebElement travelers_input_field;

    @FindBy(css = "#roomsDropdown > div") WebElement click_on_numbers_of_rooms;

    @FindBy(xpath = "//*[@id=\"bookHotelTab-panel\"]/form/div[2]/div[1]/div/div/ul/li") List<WebElement> list_of_rooms;

    @FindBy(css = "#bookHotelInput") WebElement going_to_button;

    @FindBy(css = "#bookHotelInput-menu-item-0 > button > div > span") WebElement select_the_place;

    @FindBy(xpath = "//*[@id=\"bookHotelCheckinDate\"]") WebElement check_in_button;

    @FindBy(xpath = "//*[@id=\"bookHotelTab-panel\"]/form/div[1]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[7]") WebElement select_the_check_in_date;

    @FindBy(xpath = "//*[@id=\"bookHotelCheckoutDate\"]") WebElement check_out_date_click;

    public WebElement getSelect_the_check_out_date() {return select_the_check_out_date;}

    @FindBy(xpath = "//*[@id=\"bookHotelTab-panel\"]/form/div[1]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[3]/div/table/tbody/tr[4]/td[7]") WebElement select_the_check_out_date;

    @FindBy(xpath = "//*[@id=\"bookHotelTab-panel\"]/form/ul") WebElement click_book_with_miles;

    @FindBy(css = "#bookHotelTab-panel > form > button") WebElement find_hotel;

    @FindBy(css = "//*[@id=\"filters\"]/div[4]") List<WebElement>narrow_result;

    public WebElement getNarrow_result() {return (WebElement) narrow_result;}

    public WebElement getFind_hotel() {return find_hotel;}

    public WebElement getClick_book_with_miles() {return click_book_with_miles;}

    public WebElement getCheck_out_date_click() {return check_out_date_click;}

    public WebElement getSelect_the_check_in_date() {return select_the_check_in_date;}

    public WebElement getCheck_in_button() {return check_in_button;}

    public WebElement getSelect_the_place() {return select_the_place;}

    public WebElement getGoing_to_button() {return going_to_button;}

    public List<WebElement> getList_of_rooms() {return list_of_rooms;}

    public WebElement getClick_on_numbers_of_rooms() {return click_on_numbers_of_rooms;}

    public WebElement getTravelers_input_field() {return travelers_input_field;}

    public WebElement getClick_on_children_plus_button_eight_times() {return click_on_children_plus_button_eight_times;}

    public WebElement getClick_on_travelers_link() {return click_on_travelers_link;}

    public WebElement getClick_on_adult_plus_button_eight_times() {return click_on_adult_plus_button_eight_times;}

    public WebElement getVerify_that_one_traveler_is_selected_by_default() {return verify_that_one_traveler_is_selected_by_default;}

    public WebElement getVerify_that_one_room_is_selected_by_default() {return verify_that_one_room_is_selected_by_default;}

    public WebElement getVerify_all_links_displayed() {return Verify_all_links_displayed;}

    public WebElement getClick_on_hotel_tab() {return click_on_hotel_tab;}

    public Hotel_Tab() {PageFactory.initElements(driver, this);}
}
