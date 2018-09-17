$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 1,
  "name": "Test the Home Page functionalities",
  "description": "",
  "id": "test-the-home-page-functionalities",
  "keyword": "Feature"
});
formatter.before({
  "duration": 124952420,
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
  "duration": 6960849277,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify whether the text \"Valentine\u0027s Day Cards | Please your loved ones with a card this year!\" is visible",
  "description": "as the title",
  "id": "test-the-home-page-functionalities;verify-whether-the-text-\"valentine\u0027s-day-cards-|-please-your-loved-ones-with-a-card-this-year!\"-is-visible",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I should be able to view the text \"Valentine\u0027s Day Cards | Please your loved ones with a card this year!\" as the page title",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Valentine\u0027s Day Cards | Please your loved ones with a card this year!",
      "offset": 35
    }
  ],
  "location": "StepDefinitionHomePage.i_should_be_able_to_view_the_text(String)"
});
formatter.result({
  "duration": 21907348,
  "status": "passed"
});
formatter.after({
  "duration": 42833,
  "status": "passed"
});
formatter.before({
  "duration": 60198,
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
  "duration": 1035510761,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify whether user is able to add an item to the shopping cart",
  "description": "",
  "id": "test-the-home-page-functionalities;verify-whether-user-is-able-to-add-an-item-to-the-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario"
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
  "name": "I should be able to see the book \"Closeness and Togetherness\" added in Cart",
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
  "duration": 140872368,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionHomePage.i_should_be_able_to_see_a_pop_up_with_the_price_overview()"
});
formatter.result({
  "duration": 80751928,
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
  "duration": 1822344056,
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
  "duration": 35617574,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Closeness and Togetherness",
      "offset": 34
    }
  ],
  "location": "StepDefinitionHomePage.i_should_be_able_to_see_the_item_added_in_Cart(String)"
});
formatter.result({
  "duration": 67333980,
  "status": "passed"
});
formatter.after({
  "duration": 34214,
  "status": "passed"
});
formatter.before({
  "duration": 81128,
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
  "duration": 1135196925,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Verify whether the user is able to view Info about the card",
  "description": "",
  "id": "test-the-home-page-functionalities;verify-whether-the-user-is-able-to-view-info-about-the-card",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I click on the button \"More Info\" for the book \"Closeness and Togetherness\" in Special Offers",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I should be redirected to the page containing info about the book \"closeness-and-togetherness\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "More Info",
      "offset": 23
    },
    {
      "val": "Closeness and Togetherness",
      "offset": 48
    }
  ],
  "location": "StepDefinitionHomePage.i_click_on_the_button_for_the_book(String,String)"
});
formatter.result({
  "duration": 3800047472,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "closeness-and-togetherness",
      "offset": 67
    }
  ],
  "location": "StepDefinitionHomePage.verifyCardInfo(String)"
});
formatter.result({
  "duration": 4452567,
  "status": "passed"
});
formatter.after({
  "duration": 104524,
  "status": "passed"
});
});