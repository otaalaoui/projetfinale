Feature: Course management

  Background: 
    Given the admin is on the homepage
    When the admin selects the login option
    And the admin inputs their mouna.makni@talan.com and Admin09$
    And the admin selects the login button

  @addCourse
  Scenario Outline: Admin adds a new Course
    When the admin clicks on Cursus in the dashboard menu
    And the admin clicks on the Add Course option
    And the admin enters the title <title>
    And the admin enters the visibility <visibility>
    And the admin enters the description <description>
    And the admin enters the imageurl <imageurl>
    And the admin enters the numberofdays <numberofdays>
    And the admin enters the tagsname <tagsname>
    And the admin clicks on the add button
    Then the course is added

    Examples: 
      | title           | visibility | description                                         | imageurl                                                                                                               | numberofdays | tagsname     |
      | java/springboot | oui        | ce cursus contient le cours sur le framework spring | https://geekflare.com/wp-content/uploads/2022/09/Verification-vs.-Validation-in-Software-Testing-Know-the-Basics-1.png |           30 | SQL,DataBase |
