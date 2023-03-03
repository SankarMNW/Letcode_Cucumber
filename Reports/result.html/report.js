$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\Features\\Login.feature");
formatter.feature({
  "name": "BookCart application demo",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to the application login",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.userShouldNavigateToTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the login link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userClicksOnTheLoginLink()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login should be Success",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "User enter the username as \"ortoni\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEnterTheUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the password as \"pass1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEnterThePasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.userClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login should be success",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.loginShouldBeSuccess()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to the application login",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.userShouldNavigateToTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the login link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userClicksOnTheLoginLink()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login should be Failed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "User enter the username as \"sankar\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEnterTheUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the password as \"pwd123\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEnterThePasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.userClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login should fail",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.loginShouldFail()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src\\test\\java\\Features\\addToCart.feature");
formatter.feature({
  "name": "Bookcart application demo",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Add a product to the cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User should login as \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User search a \"\u003cbook\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User add the book to the cart",
  "keyword": "When "
});
formatter.step({
  "name": "The cart badge should be update",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "book"
      ]
    },
    {
      "cells": [
        "ortoni",
        "pass1234",
        "Soul of the Sword"
      ]
    },
    {
      "cells": [
        "ortonikc",
        "pass1234",
        "A Princess in Theory"
      ]
    }
  ],
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "AddToCartSteps.userShouldNavigateToTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a product to the cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User should login as \"ortoni\" and \"pass1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.userShouldLoginAsAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search a \"Soul of the Sword\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.userSearchA(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add the book to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartSteps.userAddTheBookToTheCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The cart badge should be update",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.theCartBadgeShouldBeUpdate()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "AddToCartSteps.userShouldNavigateToTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a product to the cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User should login as \"ortonikc\" and \"pass1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.userShouldLoginAsAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search a \"A Princess in Theory\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.userSearchA(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add the book to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartSteps.userAddTheBookToTheCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The cart badge should be update",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.theCartBadgeShouldBeUpdate()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "book"
      ]
    },
    {
      "cells": [
        "ortoni",
        "pass1234",
        "Marriage of Inconvenience"
      ]
    }
  ],
  "tags": [
    {
      "name": "@dev"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "AddToCartSteps.userShouldNavigateToTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a product to the cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@dev"
    }
  ]
});
formatter.step({
  "name": "User should login as \"ortoni\" and \"pass1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.userShouldLoginAsAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search a \"Marriage of Inconvenience\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.userSearchA(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add the book to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartSteps.userAddTheBookToTheCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The cart badge should be update",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.theCartBadgeShouldBeUpdate()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});