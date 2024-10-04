Feature: To validate the FB login Functionality
@Tag1
Scenario Outline: To Validate the FB Login With valid email and invalid password
Given To launch the browser and to maximize the window
When To lunch the URL
Then To pass the valid email in email feild"<email>"
Then To enter the invalid password in password feild"<password>"
And To Click the login button
Then To validate home page
Then To check whether navigated to home page
Then To Close the Browser.


Examples:
|email						|password		|
|asd@gmail.com		|sdfghk		|
|abc@gmail.com		|qbdegg	|
|zyx@gmail.com		|szdxyu	|