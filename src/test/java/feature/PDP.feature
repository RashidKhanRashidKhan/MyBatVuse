Feature: Add product from pdp


@Reg
Scenario: Add product from PDP
When Go to home page and search-product
When Click product and go to PDP
And Add to basket product from PDP
Then Verify product add or not in basket

