Feature:

Scenario: Panel should have following fields: Going to, check-in, check-out, number of rooms, number of travelers,book with miles and find hotels button
  Given click on hotel tab
  Then verify that all links are displaying

  Scenario: One room and 1 travelers should be selected by default
    Given click on hotel tab
    Then verify that one traveler and one room is selected

    Scenario: User can select maximum 8 adult and 8 children travelers, 16 in total
      Given click on hotel tab
      Given click on travelers button
      And click on adult plus button eight times
      Then click on children plus button eight times
      Then Verify that traveler input field should display sixteen travelers

      Scenario: User should be able to maximum 8 rooms
        Given click on hotel tab
        And click on number of rooms link
        Then select room eight

        Scenario: Number of travelers field should disappear when number of rooms is more than one
          Given click on hotel tab
          And click on number of rooms link
          And select more than one room
          Then verify that number of traveler filed should disappear

          Scenario: User should see result when finding for a hotel with all the form fields filled properly
            Given click on hotel tab
            And click on going to text field
            And fill out the going to text field
            Then click on check in date field
            And fill out he check in date field
            Then click on checkout date field
            And fill out the check out date field
            Then click on book with miles
            And click on find hotels button
            Then verify that user is able to see the result








