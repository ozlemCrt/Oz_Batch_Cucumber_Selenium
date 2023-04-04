@regression
Feature: Negative Test

  @negative
  Scenario Outline: Negative Login Test
    Given The user is on the login page
    When The user logs in using "<userEmail>" and "<password>"
    Then User should verify the "<mesaj>" message
    Examples:
      | userEmail               | password                 | mesaj                                    |
      | john@gmailcom           | John1234.                | Email address is incorrect. Please check |
      | mike@gmail.com          | mike1234mike1234mike1234 | Password is incorrect. Please check      |
      | eddiem@kraft.com.       | eddiem12                 | Email address is incorrect. Please check |
      | morganfreeman@kraft.com | mfreema                  | Password is incorrect. Please check      |
      | orhan@gmail             | Orhan1234                | Email address is incorrect. Please check |
