Feature: as an admin i want to access to the talan academy platform

  @login
  Scenario Outline: verify login using correct credentials
    Given the admin is on the homepage
    When the admin selects the login option
    And the admin inputs their <email> and <password>
    And the admin selects the login button
    Then the admin should be directed to the dashboard

    Examples: 
      | email                 | password |
      | mouna.makni@talan.com | Admin09$ |
