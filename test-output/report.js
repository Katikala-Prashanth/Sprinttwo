$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Functions/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with valid username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Scenarios.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://www.demoblaze.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Scenarios.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters login Email as \"projecttest@gmail.com\" and Password as \"projecttest@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Scenarios.user_enters_Email_as_and_Password_as_Login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Scenarios.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page tittle should be \"STORE\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Scenarios.page_tittle_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Scenarios.close_browser()"
});
formatter.result({
  "status": "passed"
});
});