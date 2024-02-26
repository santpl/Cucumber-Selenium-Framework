Feature: Shopping for Men's fashion items on Amazon website

Scenario: Filter Men's Fashion Items by Criteria and Add Product to Cart

Given User on the Amazon.in homepage
When User clicked on Fashion and then Mens header link
And User filter by Average customer review of 4 stars and Up
And User filter by price range 1000-5000
And User select Puma and Allen Solly in Brands
And I count the number of results on the first page and log the count to the console
When I click on the second product
And I add it to the cart
Then I validate that no of items in cart is increased by 1