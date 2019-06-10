Feature: Verificar google home

  Scenario: verificar si el campo busqueda esta visible
    Given google page is loaded
#    And browser is maximize
    Then the 'Search' field is visible