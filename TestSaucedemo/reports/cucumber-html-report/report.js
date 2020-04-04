$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Saucedemo Website",
  "description": "",
  "id": "saucedemo-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Saucedemo"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "Login in the Saucedemo",
  "id": "saucedemo-website;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_Saucedemo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the Saucedemo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user login using \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "saucedemo-website;;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "saucedemo-website;;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 13,
      "id": "saucedemo-website;;;2"
    },
    {
      "cells": [
        "problem_user",
        "secret_sauce"
      ],
      "line": 14,
      "id": "saucedemo-website;;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "",
  "description": "Login in the Saucedemo",
  "id": "saucedemo-website;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_Saucedemo"
    },
    {
      "line": 1,
      "name": "@Saucedemo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the Saucedemo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user login using standard_user and secret_sauce",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.match({
  "location": "Saucedemo_Login.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 6882076347,
  "status": "passed"
});
formatter.match({
  "location": "Saucedemo_Login.the_user_open_the_saucedemo_home_page()"
});
formatter.result({
  "duration": 6229976637,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 21
    },
    {
      "val": "secret_sauce",
      "offset": 39
    }
  ],
  "location": "Saucedemo_Login.the_user_login_using_username_and_password(String,String)"
});
formatter.result({
  "duration": 637889485,
  "status": "passed"
});
formatter.match({
  "location": "Saucedemo_Login.click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "duration": 9848226652,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "",
  "description": "Login in the Saucedemo",
  "id": "saucedemo-website;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_Saucedemo"
    },
    {
      "line": 1,
      "name": "@Saucedemo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the Saucedemo Home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user login using problem_user and secret_sauce",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.match({
  "location": "Saucedemo_Login.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 4633547543,
  "status": "passed"
});
formatter.match({
  "location": "Saucedemo_Login.the_user_open_the_saucedemo_home_page()"
});
formatter.result({
  "duration": 6690213072,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "problem_user",
      "offset": 21
    },
    {
      "val": "secret_sauce",
      "offset": 38
    }
  ],
  "location": "Saucedemo_Login.the_user_login_using_username_and_password(String,String)"
});
formatter.result({
  "duration": 1326307780,
  "status": "passed"
});
formatter.match({
  "location": "Saucedemo_Login.click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "duration": 3460661604,
  "status": "passed"
});
});