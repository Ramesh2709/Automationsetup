$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample.feature");
formatter.feature({
  "line": 1,
  "name": "Reset functionality on login page of Application",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verification of reset button",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the Username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Reset the Credential",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.Open_the_application()"
});
formatter.result({
  "duration": 19717717447,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Enter_the_Username_and_Password()"
});
formatter.result({
  "duration": 4378063174,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Reset_the_Credential()"
});
formatter.result({
  "duration": 8330328596,
  "status": "passed"
});
});