@Saucedemo
Feature: Saucedemo Website
@TC01_Saucedemo
Scenario Outline:
Login in the Saucedemo
Given the user launch the chrome application
When the user open the Saucedemo Home page 
Then the user login using <username> and <password>
Then click on the login button user nagivate to the next page
  
Examples:
| username 			| password					|
|	standard_user	|		secret_sauce		|
|	problem_user	|		secret_sauce		|

@TC02_Saucedemo
Scenario Outline:
Select price-range
Given the user launch chrome
When the user login Saucedemo using <username> and <password>
Then select the price range from low to high

Examples:
| username 			| password					|
|	standard_user	|		secret_sauce		|

@TC03_Saucedemo
Scenario Outline: 
Select product
Given the user opens the browser
When the user login to Saucedemo using <username> and <password>
Then the user select the product
Then adds the product to Add Cart

Examples:
| username 			| password					|
|	standard_user	|		secret_sauce		|

@TC04_Saucedemo
Scenario Outline:
To know product is added to cart
Given the user opens the chrome
When user login using <username> and <password>
Then the user select the product and add to cart
Then check product is added to cart or not

Examples:
| username 			| password					|
|	standard_user	|		secret_sauce		|

@TC05_Saucedemo
Scenario Outline:
To open menu
Given the user opens the chrome browser
When login using <username> and <password>
Then user opens the menu
Then user click on About

Examples:
| username 			| password					|
|	standard_user	|		secret_sauce		|

@TC06_Saucedemo
Scenario Outline:
Logout from Saucedemo
Given opens the chrome
When login to Saucedemo <username> and <password> 
Then user opens  menu
Then user click on Logout

Examples:
| username 			| password					|
|	standard_user	|		secret_sauce		|




