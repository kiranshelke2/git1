#Author:- Kiran Shelke
#Date :-26/11/2021
#Description :-Test


Feature: feature to test timer functionality

  Scenario: Check timer begins and counted successfully
    Given user is on timer page
    When user enters timer
    And clicks on start button
    Then timer countdown begins
    #Then after timer ends logout from the application
