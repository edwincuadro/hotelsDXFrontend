Feature: Find the cheaper hotel price
  As automation analyst
  I Want to looking for the cheaper hotel price
  To give it to the client

  Scenario Outline: Looking for the cheaper hotel price
    Given user is on the site
    When user input details
      | location      | checkIn    | checkOut   |
      | San Francisco | 10/06/2022 | 10/07/2022 |
    Then user can select the cheaper hotel price and "<total>"

    Examples:
      | total  |
      | 598.00 |