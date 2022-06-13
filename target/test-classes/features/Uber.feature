@Uberbook1
Feature: Uber booking feature

  @Uberbook
  Scenario: Book a cab
    Given User wants to select a car type "Sedan" from Uber app
    When user selects car "sedan" and pick up point "Kanpur" and drop Location "Lucknow"
    Then driver starts the journey
    And driver ends the journey
    Then user pays 1000 Rupees

