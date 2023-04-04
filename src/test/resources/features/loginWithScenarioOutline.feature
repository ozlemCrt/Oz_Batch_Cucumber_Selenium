@regression
Feature: Login with Scenario Outline

  @scenarioOutline
  Scenario Outline: Pozitive Login Test with Different Users
    Given The user is on the login page
    When Enter credentials as "<userEmail>" and "<password>"
    Then Verify that "<name>" is visible on the dashboard
    Examples:
      | userEmail               | password  | name           |
      | mike@gmail.com          | mike1234  | mike           |
      | john@gmail.com          | John1234. | John           |
      | eddiem@kraft.com        | eddiem12  | Eddie Murphy   |
      | morganfreeman@kraft.com | mfreeman  | Morgan Freeman |
