@dashboard @regression
Feature: Dashboard checks

  Background:
    Given The user is on the login page

  Scenario: Example for Cucumber List
    When The user logs in using "john@gmail.com" and "John1234."
    Then Validate all tabs are on the page
      | Dashboard  |
      | Developers |
      | Components |
      | Forms      |
      | JavaScript |
      | John       |

  @cucumberMap @paralel
  Scenario: Example-2 for Cucumber Map
    Then Enter credentials and validate that user is on the home page
      | userEmail | john@gmail.com |
      | password  | John1234.      |
      | name      | John           |