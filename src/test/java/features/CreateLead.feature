Feature: Create a Lead

@regression
Scenario Outline: Create a Lead Using multiple data
Given Open and maximize the Browser
And Set the timeout 
And Enter the url
And Enter the userName as <userName>
And Enter the password as <password>
And Click on login and verify login is sucessful
And Click on crmsfa
And Click on leads
And Click on createLead
And Enter the companyName as <cName>
And Enter the firstName as <fName>
And Enter the lastName as <lName>
When Click on submitButton
Then Create Lead is sucessful

Examples:

|userName|password|cName|fName|lName|
|DemoSalesManager|crmsfa|CTS|Karthik|Anns|
|DemoSalesManager|crmsfa|TCS|Velu|R|

@sanity
Scenario: Create a Lead_Happy path

Given Open and maximize the Browser
And Set the timeout
And Enter the url
And Enter the userName as DemoSalesManager
And Enter the password as crmsfa
And Click on login and verify login is sucessful
And Click on crmsfa
And Click on leads
And Click on createLead
And Enter the companyName as CTS
And Enter the firstName as Karthik
And Enter the lastName as Anns
When Click on submitButton
Then Create Lead is sucessful




