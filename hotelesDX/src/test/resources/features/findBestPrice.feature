Feature: Find the cheaper hotel price
  As automation analyst
  I Want to looking for the cheaper hotel price
  To give it to the client

  Scenario: Looking for the cheaper hotel price
    Given user is on the site
    When user input details
      | location      | checkIn   | checkOut  |
      | San Francisco | 9/28/2022 | 9/29/2022 |
    Then user can select the cheaper hotel price