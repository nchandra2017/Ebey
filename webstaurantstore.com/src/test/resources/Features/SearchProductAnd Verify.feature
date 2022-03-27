Feature: Search product and varify
  
 @TC_RF_001

  Scenario: Search and Verify product Title
 
  
    Given Lanch webstaurantstore "<URL>"
    Then Search for 'stainless work table'                                    
    When Check the search result ensuring every product item has the word 'Table' in its title  
    Then Add the last of found items to Cart
    Then Empty Cart
