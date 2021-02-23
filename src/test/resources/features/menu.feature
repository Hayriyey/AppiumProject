Feature: Menu size and add more items

  Scenario: Menu size
    Given The user on the login page and should be able to login
    Then  The user go to basket and able to see "There is no result" message
    Then The user go to main menu and menu size should be 12
    And  The user click on the "Atıştırmalık" button
    And  The user add more items and navigate the main menu
    And  The user click on the "Yiyecek" button
    And The user add three items and go to basket