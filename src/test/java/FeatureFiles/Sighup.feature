Feature: Application Signup
Scenario: Saleforce signup 
Given Initialize the Chrome Browser for signup
And nevigate to this url "https://login.salesforce.com/?locale=in"
When click on Try for free button
Then Enter the data on signup page