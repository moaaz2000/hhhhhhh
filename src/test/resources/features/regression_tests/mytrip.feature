Feature:
  Scenario: There should be a link to find United Travel Credits page
    Given click on my trips tab on header
    Then verify that there is a find your travel credit link

    Scenario: Empty My Trips form should show error messages when searched without filling up
      Given click on my trips tab on header
      And click on search button in my trip tab
      Then verify that it shows error message when click

      Scenario: There should be a link to find my trips sign in page
        Given click on my trips tab on header
        Then verify that sign in link is displayed





