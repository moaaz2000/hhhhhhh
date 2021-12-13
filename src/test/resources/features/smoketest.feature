Feature: Testing the major functionalities


  user should able to go to website and all the feature should display

   Scenario: app load with book,fight status , etc
    Given verify all the tabs on the homepage

  Scenario:Available flights are displayed when user searches for round trip basic economy ticket
    Given fill out all the destination fields
    And click on find flight button
    Then verify that user is able to see all the available flights

  Scenario:User checks out one way flight ticket for the date of Jan 15, 2022
    Given click on one way radio button
    Then fill out leaving and destination fields
    And select the date filed
    And click on find flight button
    Then verify that flight has been checked out

  Scenario: User checks out 3 round trip flight tickets: 2 adults, 1 infant for the date of Feb 15, 2022
  Given click on round trip radio button
    Then fill out leaving and destination fields fields
    And select the dates
    And click on Travelers link
    And select the amount of travelers
    Then verify round trip flight has been checked out






