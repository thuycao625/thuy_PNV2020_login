Feature: Login admin page


  Scenario Outline: Login admin page
    Given Open website <website>
    When I select username <userSelect>
    When I click Login
    Then I verify Harry Potter is selected

    Examples:
     |website                                                               | userSelect  |
     |http://www.way2automation.com/angularjs-protractor/banking/#/customer | Harry Potter|
