Feature: Remove product from basket


Scenario: Remove product from basket and verify
When Go to home page and search--product
When Click product and go to -PDP
And Add to basket product from -PDP and verify
Then Delete added product from basket and verify