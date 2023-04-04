@login @regression
Feature: Login
  #As s user, I should be able to login with my valid credentials so that I
  #can reach out to the app to use.
  #Acceptance Criteria:
  #   1.User should be able to login with valid credentials.
  #   2.User should not be able to login with invalid credentials.
  @teacher @krafttech @paralel
  Scenario: Login as Mike
    Given  The user is on the login page
    When  The user enters valid credentials that belongs to Mike
    Then The user should be able to login

  @student @krafttech
  Scenario: Login as Jack
    Given The user is on the login page
    When The user enters valid credentials that belongs to Jhon
    Then The user should be able to login

  @developer
  Scenario: Login as Sebastian
    Given The user is on the login page
    When The user enters valid credentials that belongs to Eddie Murphy
    Then The user should be able to login

  @SDET @db
  Scenario: Login as SDET
    Given The user is on the login page
    When The user enters valid credentials that belongs to Morgan Freeman
    Then The user should be able to login





