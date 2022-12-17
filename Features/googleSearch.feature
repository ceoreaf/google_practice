Feature: searching products
Scenario Outline: searching products in google

Given im on the google home page

When i enter the "<Product_Name>" in the search bar
And I click on the search icon button

Then i can see the search results succesfully 

Examples:  
| Product_Name |
| pet          |
| Football     |
| Fifa         |
