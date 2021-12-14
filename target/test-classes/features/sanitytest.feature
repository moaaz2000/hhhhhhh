Feature:

  Scenario: Home page booker container tabs should display correct fields
    Given click on book tab
    Then verify that book tab has all the correct fields
    And click on flight status
    Then verify that flight status has all the correct fields
    And click on check in tab
    Then verify that check in has all the correct fields
    And click on my trips tab
    Then verify that my trips has all the correct fields


  Scenario: User should be able to change language
    Given click on language selector button on header
    And click on select language dropdown arrow
    And select the language
    And click on change button
    Then verify that language is changed



Scenario: Advisory top section should display info with links
  Given verify that header info is displayed with links

  Scenario: Top header tabs should show correct panels when clicked
    Given click on the header Book tab
    And verify Book tab links are displayed on the panel
    Then click on header My Trips tab
    And verify My Trips tab links are displayed on the panel
    Then click on header Travel tab
    And verify Travel tab links are displayed on the panel
    Then click on the header MileAgePlus tab
    And verify MileAgePlus tab related are displayed on the panel
    Then click on the header Deals tab
    And verify Deals tab links are displayed on the panel
    Then click on the header Help tab
    And verify Help tab links are displayed on the panel

  Scenario: Footer links should not be broken
    Given verify user is on home page
    Then verify all footer section links are not broken