Feature:
  Scenario: Empty flight check-in form should show error messages when searched without filling up
    Given click on check in tab
    And click on search field
    Then verify that it shows error message

    Scenario: There should be a check-in details link and navigates to correct page
      Given click on check in tab
      And click on check in detail link
      Then verify that it navigates user to correct page

      Scenario: There should be a check-in with MilesPlus link and navigates to correct page
        Given click on check in tab
        And click on check in with your mileage
        Then verify that user navigates to mileage page


