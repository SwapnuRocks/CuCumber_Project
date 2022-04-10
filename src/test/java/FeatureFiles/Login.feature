Feature: Application Login
Scenario Outline: Saleforce Homepage Login
Given Initialize the Chrome Browser
And nevigate to "https://login.salesforce.com/"
When User enters <Username> and <Passward> and click on Login Button
Then User should be able to login
Examples:

|Username| |Passward|
|test1| |pass123|
|Test2| |Pas1234|
