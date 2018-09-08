Feature: Test the Home Page functionalities

  Background:
    Given I am on the Home Page

  Scenario: Verify whether the text "Please your loved ones with a card this year!" is displayed on the home page
    Then  I should be able to view the text "Please your loved ones with a card this year!"


  Scenario: Verify whether user is able to add an item to the shopping cart
    When I click on the button "Add to cart" for the book "Closeness and Togetherness"
    Then I should be able to see a pop up with the price overview
    When I click on the button "Add to cart"
    Then I should be redirected to my "Shopping Cart"
    And I should be able to see the item added in Cart


  Scenario: Verify whether the user is able to view Info about the card
    When I click on the button "More Info" for the book "Closeness and Togetherness"
    Then I should be redirected to the page containing info about the book "Closeness and Togetherness"
