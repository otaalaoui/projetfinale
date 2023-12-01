Feature: Course Search Feature for Admins on Talan Academy

  Background: 
    Given the admin is on the homepage
    When the admin selects the login option
    And the admin inputs their mouna.makni@talan.com and Admin09$
    And the admin selects the login button
    When the admin clicks on Cursus in the dashboard menu

  @SearchByExistingName
  Scenario Outline: Verify course search functionality
    When the admin selects the course search option
    And the admin enters the course name <courseName>
    Then the corresponding course should be displayed

    Examples: 
      | courseName         |
      | Test et validation |

  @ClearingSearchField
  Scenario Outline: Verify clearing search field
    When the admin selects the course search option
    And the admin enters the course name <coursename>
    And the admin clears the course name
    Then the initial page should be displayed

    Examples: 
      | coursename         |
      | Test et validation |

    Examples: 
      | coursename         |
      | Test et validation |

  @inexsist_name
  Scenario: Verify message for inexistent course
    When the admin selects the course search option
    And the admin enters an inexistent course name "Diagramme"
    Then the message "aucun cursus trouvé" should be displayed
