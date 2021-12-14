Feature:


  Scenario:Choosing round trip option should have departing and return date fields
    Given click on round trip radio button
    Then verify that departing and return date fields should displayed


  Scenario: Choosing one way flight option should only have departing field
    Given click on one way radio button
    Then verify that it has destination field

  Scenario: User should be able to increment traveler count up to 9
    Given click on travelers
    And click on adult plus icon ten times
    Then verify that it display nine in adult input field

  Scenario: User should be able to increment every traveler type
    Given click on travelers link
    And select one passenger from adult
    And select one passenger from seniors
    And select one passenger from infants
    And select one passenger from infants lap
    And select one passenger from all children field
    Then verify that all passengers are selected

    Scenario: Leaving from and going to fields should switch when click on switch icon in the middle
      Given click on the the arrows in the middle of from and going to filed
      Then verify that destinations switching from one field to other field

      Scenario:Leaving from and going to fields should have correct placeholders
        Given verify leaving from and going to have correct fields

        Scenario: User should be able to remove leaving from location value
        Given click on from field
          And click on cross button
          Then verify that from field is empty

          Scenario: User should be able to remove going to location value
            Given Click on going to filed
            And find the airport location
            And click on that airport
            And click on x button
            Then verify that going to field is empty

            Scenario: User can select different flight classes such as Economy, Premium economy, Business or First
              Given click on flight list box arrow
              And select the economy class
              Then click on flight list box arrow
              And select he premium economy
              Then click on flight list box arrow
              And select the business or first class

              Scenario: Minimum one traveler should be selected
                Given click on travelers
                And click on subtract button
                Then verify that just one traveler is selected

                Scenario: User can only travel with one pet
                  Given click on travelers
                  And click on travel with pet
                  And click on select number of pet
                  Then verify that user is able to select just one pet

              Scenario: Advance search should open a separate page with more advanced search fields
                Given click on advance search link
                Then verify that advance search filed provide advance search fields

                Scenario: Checking flexible dates option should change the Dates field to month dropdown only
                  Given click on flexible date
                  Then verify that date text field have month and days dropdown




















