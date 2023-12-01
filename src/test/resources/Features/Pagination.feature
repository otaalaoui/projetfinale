Feature: Courses Pagination

  Background: 
    Given the admin is on the homepage
    When the admin selects the login option
    And the admin inputs their mouna.makni@talan.com and Admin09$
    And the admin selects the login button
    When the admin clicks on Cursus in the dashboard menu

  @Pagination
  Scenario: Navigation between courses pages
    When The admin clicks the right arrow to go to the next page
    Then The next page of courses is displayed
    When The admin clicks the left arrow to go back to the previous page
    Then The previous page of courses is displayed
  #@PaginationWithBotton
  #Scenario: Admin selects different items per page
    #When The admin selects to display "10" items per page
    #Then The course with "10" items per page are displayed
    #When The admin clicks to display "15" items per page
    #Then The page displayed with "15" items 
    #When The admin enter to display "20" items per page
    #Then The courses with "20" items per page are displayed
