Feature: Verificar localhost
  Scenario: verificar si el botón del navbar es visible
    Given localhost page loaded
    Then Navbar button is visible

  Scenario: Verificar si se puede acceder al menu de creación de cuenta
    Given localhost page loaded
    And Navbar button is clicked
    And Add account button is clicked
    Then Name input is visible
    But Create Account button should not be visible