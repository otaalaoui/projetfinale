Feature: Verify and manage course header details

  Background: 
    Given the admin is on the homepage
    When the admin selects the login option
    And the admin inputs their mouna.makni@talan.com and Admin09$
    And the admin selects the login button
    When the admin clicks on Cursus in the dashboard menu

  @HeaderElementsDisplay
  Scenario: Verify and manage course header
    And the course title should be "Course"
    And the course description should be "Description"
    And the tags associated with the course should be "Tags"
    And the course visibility should be "Visibility"
    And the course actions should be "Actions"
    Then the elements of the header should be displayed
