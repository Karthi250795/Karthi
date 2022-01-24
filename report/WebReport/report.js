$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/LoginPage.feature");
formatter.feature({
  "name": "Verifying adactin hotel",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying adactin hotel login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on adactin hotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.user_is_on_adactin_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_should_enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_should_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify succesfully login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_should_verify_succesfully_login()"
});
formatter.result({
  "status": "passed"
});
});