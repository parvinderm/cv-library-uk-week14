Feature: Home Page
  As a user I want To verify Job Search using different data set

  Scenario Outline: User should be able to verify JobSearch Result Using Different DataSet
    Given I am on homepage
    When User accept cookies
    And User enter job title "<jobTitle>"
    And User enter Location "<location>"
    And User select distance "<distance>"
    And User click on moreSearchOptionsLink
    And User enter salaryMin "<salaryMin>"
    And User enter salaryMax "<salaryMax>"
    And User select salaryType "<salaryType>"
    And User select jobType "<jobType>"
    And User click on Find Jobs Button
    Then User verify the result "<result>"
    Examples:
      | jobTitle            | location                          | distance       | salaryMin | salaryMax | salaryType | jobType   | result                                             |
      | Tester              | Harrow on the Hill,Greater London | up to 5 miles  | 30000     | 50000     | Per annum  | Permanent | Permanent Tester jobs in Harrow on the Hill        |
      | Development Manager | Wembley,Greater London            | up to 7 miles  | 50000     | 70000     | Per annum  | Permanent | Permanent Development Manager jobs in Wembley      |
      | Teacher             | Edgware,Greater London            | up to 5 miles  | 35000     | 37000     | Per annum  | Permanent | Permanent Teacher jobs in Edgware                  |
      | Store Manager       | Stanmore,Greater London           | up to 5 miles  | 48000     | 62000     | Per annum  | Permanent | Permanent Store Manager jobs in Stanmore           |
      | Marketing Executive | Harrow Weald,Greater London       | up to 10 miles | 30000     | 45000     | Per annum  | Permanent | Permanent Marketing Executive jobs in Harrow Weald |
      | Qa Analyst          | Harrowgate                        | up to 5 miles  | 35000     | 40000     | Per annum  | Permanent | Permanent Qa Analyst jobs                          |
