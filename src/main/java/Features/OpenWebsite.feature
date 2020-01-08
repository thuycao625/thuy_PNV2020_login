Feature: Open the website


  Scenario Outline: Open the website

    Given I Open website <website>

    Examples:
      | website                                                             |
      |http://www.way2automation.com/angularjs-protractor/banking/#/customer|