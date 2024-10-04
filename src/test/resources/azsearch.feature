Feature: To Validate the Amazon application


Background:
Given To launch the brawser and maximize

@Smoke
Scenario: To validate the amazon search feild
When To launch the amaxon url
Then To enter the Search the product
|Watches|Tabs|Shoes|Laptops|Mobiles|Tv|Projector|Bottles|headphones|notes|pens|pencils|box|
Then To Click the search button
And To validate the product page

@Sanity
Scenario: To validate the amazon search feild
When To launch the amaxon url
Then To enter the Search the product
|Watches|Tabs|Shoes|Laptops|Mobiles|Tv|Projector|Bottles|headphones|notes|pens|pencils|box|
Then To Click the search button
And To validate the product page