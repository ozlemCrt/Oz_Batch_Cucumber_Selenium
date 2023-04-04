@regression @paralel
Feature: Profile Tests

  @scenario
  Scenario: User should be able to edit his/her profile
    Given The user is on the login page
    When The user logs in using "john@gmail.com" and "John1234."
    And  The user should be able to login
    And User should go to my profile with "John"
    And User should navigate to "Edit Profile"
  #  And User should fill out necessary input boxes and tap on save changes button
  #  Then User should verify the profile updated message

  @editProfile
  Scenario: User should be able to edit his/her profile
    Given The user is on the login page
    When The user logs in using "orhan@gmail.com" and "Orhan1234*"
    And  The user should be able to login
    And User should go to my profile with "orhan"
    And User should navigate to "Edit Profile"
    And The user must fill in the input boxes with the texts "Excellent QA" ,"orhan","QA","Test","Turkiye","Aotomation Master" and tap on save changes button
    Then User should verify the "Profile Updated" message
@fillAddEducation
    Scenario: The user navigates to Add Education Page
      Given The user is on the login page
      When The user logs in using "orhan@gmail.com" and "Orhan1234*"
      Then The user should be able to login
      When User should go to my profile with "orhan"
      And User should navigate to "Add Education"
      Then User should be able to see "Add Education" button
      When The user fill the form with followings : "İTÜ","Bachelor","Engineering","08052020","11122022","Hard Program"
      Then The user should see added record with :"İTÜ"
      And The user should be able to delete last added record with: "İTÜ"

