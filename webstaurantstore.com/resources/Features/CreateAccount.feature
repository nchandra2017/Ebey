
@Sanity

Feature: Create new Account

  @TC_RF_00001
  Scenario: Create new Account for new customer
    Given Lanch webstaurantstore "<URL>"
    Then Click login to your account from manu bar
    And Click on the Create an Account button
    Then Write email in the Email text field
    And Write name in the Name text field
    And Write company in the Company text field
    And Click Choose company type drop down bar
    Then Click company name ChooseCompanyType
    Then Write home Address in the text field
    And Write Address in Address Line
    And Write postal code in the text field
    Then Write PhoneNumber in the Phone text field
    Then Create New Password in the text field
    Then click in the create My Account button

 
