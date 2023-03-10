#Author: Bruno Carvalho

@general
Feature: Customer Registration
  I would like to do a customer registration

  @customer-registration
  Scenario: Customer registration
    Given I am on the home of the app
    When I fill all the fields
    Then The customer was registered successfully
  
