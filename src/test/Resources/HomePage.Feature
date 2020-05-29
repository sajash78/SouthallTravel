Feature:
  Scenario: user is searching for flights from and to  with departing and returning dates.
    Given user in the home page of Southall travel
    When user selects the airport from the depart box
    And user selects the airport from the destination box
    And user selects 27th May in the departing Calender
    And user select 17th June in returning Calender
    And user select 3 in the adult box
    And user select Air India in the Airline box
    Then user should be able to see result page