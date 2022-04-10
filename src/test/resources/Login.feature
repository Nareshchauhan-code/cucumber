Feature:Amazone search

  Scenario:Search the Product
    Given I have searh field on Amazone page
    When I search product name "Apple macbook Pro" and Price is 10000
    Then Product name should be displayed

