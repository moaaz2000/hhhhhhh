Feature:

  Scenario:Cars form should have following fields: Pickup location, Drop off location, Pickup time, Drop off time, return car to same location, primary driver is 25 or older, book with miles, find cars
    Given click on car tab
    Then verify all the required fields are available

    Scenario: Drop off location should disappear if return car to same location checkbox is checked
      Given click on car tab
      And click on return car to same location
      Then verify that drop off location is disappear

      Scenario: Age field should disappear if primary driver is 25 or older checkbox is checked
        Given click on car tab
        And click on primary field check box
        Then verify that age field is disappear

        Scenario: Finding a car after filling up the form should navigate to a separate tab
          Given click on car tab
          And click on pickup location
          Then fill out the pickup location
          Then click on pickup dates field
          And select the date
          Then click on drop off date
          And select drop off date
          Then click on book with miles check box
          And click on find car button


          Scenario: Finding a car with book with miles checked should return result with miles only
            Given click on car tab
            And click on pickup location
            Then fill out the pickup location
            Then click on pickup dates field
            And select the date
            Then click on drop off date
            And select drop off date
            And click on book with miles check box
            And click on find car button
            Then verify that checked with miles is returning the result with miles only

            Scenario: Searching for a rental car with an age lesser than 21 should display “Some car rental suppliers do not rent to young drivers. If you are travelling with an older person, it may help to make them your main driver.
              Given click on car tab
              And click on pickup location
              Then fill out the pickup location
              Then click on pickup dates field
              And select the date
              Then click on drop off date
              And select drop off date
              Then click on twenty five or older option
              And click on age field
              Then fill out the age field
              And click on find car button
              Then verify that age lesser than twenty one should display “Some car rental suppliers do not rent to young drivers. If you are travelling with an older person, it may help to make them your main driver

              Scenario:Searching for a rental car with an age of 21 should not return any search result
                Given click on car tab
                And click on pickup location
                Then fill out the pickup location
                Then click on pickup dates field
                And select the date
                Then click on drop off date
                And select drop off date
                Then click on twenty five or older option
                And click on age field
                And Write twenty one in age field
                And click on find car button
                Then verify that rental car with an age of twenty one should not return any search result

                Scenario: Searching for a rental car with an age bigger than 21 should return search result
                  Given click on car tab
                  And click on pickup location
                  Then fill out the pickup location
                  Then click on pickup dates field
                  And select the date
                  Then click on drop off date
                  And select drop off date
                  Then click on twenty five or older option
                  And click on age field
                  And add date in the date field
                  And  And click on find car button
                  Then rental car with an age bigger than twenty one should return search result


















