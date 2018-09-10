$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 1,
  "name": "Test the Home Page functionalities",
  "description": "",
  "id": "test-the-home-page-functionalities",
  "keyword": "Feature"
});
formatter.before({
  "duration": 24609120,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionHomePage.i_am_on_the_Home_Page()"
});
formatter.result({
  "duration": 7043961089,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify whether user is able to add an item to the shopping cart",
  "description": "",
  "id": "test-the-home-page-functionalities;verify-whether-user-is-able-to-add-an-item-to-the-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I click on the button \"Add to cart\" for the book \"Closeness and Togetherness\" in Special Offers",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should be able to see a pop up with the price overview",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I click on the button \"Add to cart\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I should be redirected to my \"Shopping Cart\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I should be able to see the item added in Cart",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Add to cart",
      "offset": 23
    },
    {
      "val": "Closeness and Togetherness",
      "offset": 50
    }
  ],
  "location": "StepDefinitionHomePage.i_click_on_the_button_for_the_book(String,String)"
});
formatter.result({
  "duration": 136721907,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionHomePage.i_should_be_able_to_see_a_pop_up_with_the_price_overview()"
});
formatter.result({
  "duration": 33017,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add to cart",
      "offset": 23
    }
  ],
  "location": "StepDefinitionHomePage.i_click_on_the_button(String)"
});
formatter.result({
  "duration": 110179,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping Cart",
      "offset": 30
    }
  ],
  "location": "StepDefinitionHomePage.i_should_be_redirected_to_my(String)"
});
formatter.result({
  "duration": 67377,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionHomePage.i_should_be_able_to_see_the_item_added_in_Cart()"
});
formatter.result({
  "duration": 372458,
  "status": "passed"
});
formatter.after({
  "duration": 272423,
  "status": "passed"
});
});