@TC_RF_00
Feature: User enter valid Id and Password should login successfully
@TC_RF_01
  Scenario: user login and log out successfully
    Given Lanch webstaurantstore "<URL>"
    Then Click login to your account from manu bar1
    And User entered valid username
    And User entered valid password
    Then Click in the Login button
    Then Click user account manu bar
    Then Click Logout button

  @TC_RF_02
  Scenario: user entered invalid username should not login
    Given Lanch webstaurantstore "<URL>"
    Then Click login to your account from manu bar1
    And User entered invalid username
    And User entered valid password
    Then Click in the Login button
    Then Click user account manu bar
    Then Click Logout button

  @TC_RF_03
  Scenario: user entered invalid password should not login 
    Given Lanch webstaurantstore "<URL>"
    Then Click login to your account from manu bar1
    And User entered valid username
    And User entered invalid password
    Then Click in the Login button
    Then Click user account manu bar
    Then Click Logout button

  @TC_RF_04
  Scenario: user entered invalid username and password should not login and account should be lock
    Given Lanch webstaurantstore "<URL>"
    Then Click login to your account from manu bar1
    And User entered invalid username
    And User entered invalid password
    Then Click in the Login button
    Then Click user account manu bar
    Then Click Logout button
    
   
