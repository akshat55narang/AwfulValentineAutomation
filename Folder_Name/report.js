$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 1,
  "name": "Test the Home Page functionalities",
  "description": "",
  "id": "test-the-home-page-functionalities",
  "keyword": "Feature"
});
formatter.before({
  "duration": 177063,
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
  "duration": 6896607224,
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
  "duration": 19401646,
  "status": "passed"
});
formatter.after({
  "duration": 120347,
  "status": "passed"
});
formatter.before({
  "duration": 101328,
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
  "duration": 969770789,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify whether user is able to add an item to the shopping cart",
  "description": "",
  "id": "test-the-home-page-functionalities;verify-whether-user-is-able-to-add-an-item-to-the-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I click on the button \"Add to cart\" for the book \"Closeness and Togetherness\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should be able to see a pop up with the price overview",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click on the button \"Add to cart\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should be redirected to my \"Shopping Cart\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
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
  "duration": 5964621,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionHomePage.i_should_be_able_to_see_a_pop_up_with_the_price_overview()"
});
formatter.result({
  "duration": 3945484,
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
  "duration": 94536,
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
  "duration": 123845,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionHomePage.i_should_be_able_to_see_the_item_added_in_Cart()"
});
formatter.result({
  "duration": 111310,
  "status": "passed"
});
formatter.after({
  "duration": 64108,
  "status": "passed"
});
formatter.before({
  "duration": 65012,
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
  "duration": 982641451,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify whether the user is able to view Info about the card",
  "description": "",
  "id": "test-the-home-page-functionalities;verify-whether-the-user-is-able-to-view-info-about-the-card",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "I click on the button \"More Info\" for the book \"Closeness and Togetherness\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I should be redirected to the page containing info about the book \"Closeness and Togetherness\"",
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
  "duration": 112372,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Closeness and Togetherness",
      "offset": 67
    }
  ],
  "location": "StepDefinitionHomePage.i_should_be_redirected_to_the_page_containing_info_about_the_book(String)"
});
formatter.result({
  "duration": 75532,
  "status": "passed"
});
formatter.after({
  "duration": 76175,
  "status": "passed"
});
});