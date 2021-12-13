Feature:

  Scenario:User should see vacation search result with all fields filled properly
    Given click on package tab
    And fill out all the fields
    Then verify that user is able to see search results

    Scenario: Vacation form should have only up to 4 rooms
      Given click on package tab
      And click on rooms dropdown
      Then verify that it has just four rooms

      Scenario: Rooms container should say “rooms” if room count is bigger than one
        Given click on package tab
        And click on rooms dropdown
        And click on the two rooms
        Then verify that room containers says room

        Scenario: Rooms option dropdown should disappear when Flight and car option is selected
          Given click on package tab
          And click on flight and car dropdown
          Then verify that rooms field should disappear

          Scenario: Clicking cruise link should navigate to United Cruises page
            Given click on cruise link
            Then verify that user should navigate to united cruises page



