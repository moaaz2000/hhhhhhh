Feature:
  Scenario: User searches flight status between from and to destinations
    Given click On flight status tab
    And fill out from and to fields
    Then Verify that user is on flight schedules page

    Scenario: Flight number field should not accept other than numbers
      Given click On flight status tab
      And click on flight number field
      And fill out the field with alphabets
      Then verify that flight number field should accept just numbers

      Scenario: Invalid number error message should be displayed when a wrong flight number is entered
        Given click On flight status tab
        And click on flight number field
        And fill out the field with invalid flight number
        And click on search button
        Then verify that the number you entered is not a valid flight number.





