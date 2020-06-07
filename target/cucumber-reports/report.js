$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:searchOnAmazon.feature");
formatter.feature({
  "name": "Search product on Amazon searchBox",
  "description": "  As a customer I want to search product on Amazon site to purchase",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search product",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am at Amazon Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchOnAmazon_StepDefinition.i_am_at_Amazon_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter IPhone in search input field",
  "keyword": "And "
});
formatter.match({
  "location": "SearchOnAmazon_StepDefinition.i_enter_IPhone_in_search_input_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "SearchOnAmazon_StepDefinition.i_click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see IPhone",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchOnAmazon_StepDefinition.i_should_see_IPhone()"
});
formatter.result({
  "status": "passed"
});
});